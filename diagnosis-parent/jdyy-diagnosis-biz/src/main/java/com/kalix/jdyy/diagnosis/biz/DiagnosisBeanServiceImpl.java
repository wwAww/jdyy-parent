package com.kalix.jdyy.diagnosis.biz;

import com.google.gson.Gson;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.diagnosis.api.biz.IDiagnosisBeanService;
import com.kalix.jdyy.diagnosis.api.dao.IDiagnosisBeanDao;
import com.kalix.jdyy.diagnosis.api.dto.DiagnosisDTO;
import com.kalix.jdyy.diagnosis.api.dto.DiagnosisTreeDTO;
import com.kalix.jdyy.diagnosis.entities.DiagnosisBean;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiagnosisBeanServiceImpl extends GenericBizServiceImpl<IDiagnosisBeanDao,DiagnosisBean> implements IDiagnosisBeanService {
    public DiagnosisBeanServiceImpl() {
        super();
    }

    /**
     * 诊断树
     */
    @Override
    public DiagnosisTreeDTO getAllDiaByParentId(long parentId) {
        DiagnosisTreeDTO root = new DiagnosisTreeDTO();
        root.setId(-1L);
        List<DiagnosisBean> beans = new ArrayList<>();
        String sql = "select s from DiagnosisBean s where 1=1";
        if(parentId != -1){
            sql += " and s.parentId=" + parentId;
        }
        sql += " order by s.creationDate desc";
        beans = dao.find(sql);

        if(beans != null && beans.size() > 0){
            List<DiagnosisBean> rootElements = getRootElements(beans);
            if(rootElements != null && rootElements.size() > 0){
                for(DiagnosisBean rootElement:rootElements){
                    Mapper mapper = new DozerBeanMapper();
                    DiagnosisTreeDTO diagnosisTreeDTO = mapper.map(rootElement,DiagnosisTreeDTO.class);
                    diagnosisTreeDTO.setLeaf(rootElement.getIsLeaf() == 0 ? false : true);
                    diagnosisTreeDTO.setParentName("根目录");
                    getChilden(diagnosisTreeDTO, beans, mapper);
                    root.getChildren().add(diagnosisTreeDTO);
                }
            }
        }
        return root;
    }
    /**
     * 递归函数加载子节点
     * @param root
     * @param elements
     */
    private void getChilden(DiagnosisTreeDTO root, List<DiagnosisBean> elements, Mapper mapper){
        List<DiagnosisTreeDTO> children = new ArrayList<DiagnosisTreeDTO>();
        for(DiagnosisBean diagnosisBean : elements){
            if(root.getId() != -1 && (root.getId() == diagnosisBean.getParentId())){
                DiagnosisTreeDTO diagnosisTreeDTO = mapper.map(diagnosisBean, DiagnosisTreeDTO.class);
                diagnosisTreeDTO.setLeaf(diagnosisBean.getIsLeaf() == 0 ? false : true);
                diagnosisTreeDTO.setParentName(root.getContent());
                children.add(diagnosisTreeDTO);
                if(diagnosisBean.getIsLeaf() == 0){
                    getChilden(diagnosisTreeDTO, elements ,mapper);
                }
            }
        }
        root.setChildren(children);
    }

    /**
     * 获得所有根节点
     * @param elements
     * @return
     */

    private List<DiagnosisBean> getRootElements(List<DiagnosisBean> elements) {
        List<DiagnosisBean> roots=new ArrayList<DiagnosisBean>();
        for (DiagnosisBean element : elements) {
            if (element.getParentId() == -1) {
                roots.add(element);
            }
        }
        return roots;
    }

    /**
     * 获取诊断信息，并以级联形式返回数据
     * @return
     */

    public JsonData getDiaCascader() {
        List<DiagnosisBean> qlist = dao.find("select d from DiagnosisBean d");
        List<DiagnosisBean> listParents = qlist.stream().filter(db-> db.getParentId()==-1).collect(Collectors.toList());
        List<DiagnosisDTO> list = new ArrayList<>();
        for(DiagnosisBean one : listParents) {
            DiagnosisDTO dd = new DiagnosisDTO();
            dd.setValue(one.getContent());
            dd.setLabel(one.getContent());
            dd.setChildren(getDiagnosisChilden(one, qlist));
            list.add(dd);
        }
        JsonData jsonData = new JsonData();
        jsonData.setTotalCount((long) list.size());
        jsonData.setData(list);
        return jsonData;
    }

    /**
     *诊断删除节点以及子节点的功能
     * @param id
     */
    @Override
    public void deleteAllDia(long id) {
        dao.remove(id);
        deleteAllChildens(id);
    }
    //用递归的方法
    private void deleteAllChildens(long id) {
        List<DiagnosisBean> list = dao.find("select d from DiagnosisBean d");
        for (DiagnosisBean dia : list) {
            if (dia.getParentId() == id) {
                dao.remove(dia.getId());
                deleteAllChildens(dia.getId());
            }
        }
    }

    /**
     * 递归方法获取级联子节点
     */

    private List<DiagnosisDTO> getDiagnosisChilden(DiagnosisBean one, List<DiagnosisBean> qlist) {
        List<DiagnosisDTO> list = new ArrayList<>();
        for (DiagnosisBean db : qlist) {
            if (one.getId() == db.getParentId()) {
                DiagnosisDTO dd = new DiagnosisDTO();
                dd.setValue(db.getContent());
                dd.setLabel(db.getContent());
                List<DiagnosisDTO> children = getDiagnosisChilden(db, qlist);
                if (children != null && !children.isEmpty()) {
                    dd.setChildren(children);
                }
                list.add(dd);
            }
        }
        return list;
    }
}
