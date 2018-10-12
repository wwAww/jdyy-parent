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
import java.util.List;

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

    public JsonData getAllDiaByParentId() {
        DiagnosisDTO diagnosisDTO = new DiagnosisDTO();
        List<DiagnosisDTO> list = new ArrayList<>();
        List<DiagnosisBean> oneList = dao.find("select d from DiagnosisBean d where d.parentId=-1");
        for(DiagnosisBean one : oneList) {
            DiagnosisDTO oneModel = new DiagnosisDTO();
            oneModel.setValue(one.getContent());
            oneModel.setLabel(one.getContent());
            List<DiagnosisBean> twoList = dao.find("select d from DiagnosisBean d where d.parentId = ?1" , one.getId());
            List<DiagnosisDTO> tsList = new ArrayList<>();
            for (DiagnosisBean two:twoList) {
                DiagnosisDTO twoModel = new DiagnosisDTO();
                twoModel.setValue(two.getContent());
                twoModel.setLabel(two.getContent());
                List<DiagnosisBean> threeList = dao.find("select d from DiagnosisBean d where d.parentId = ?1" , two.getId());
                List<DiagnosisDTO> thList = new ArrayList<>();
                for (DiagnosisBean three:threeList) {
                    DiagnosisDTO threeModel = new DiagnosisDTO();
                    threeModel.setValue(three.getContent());
                    threeModel.setLabel(three.getContent());
                    thList.add(threeModel);
                }
                twoModel.setChildren(thList);
                tsList.add(twoModel);
            }
            oneModel.setChildren(tsList);
            list.add(oneModel);
        }
        List<String> infoList = new ArrayList<>();
        infoList.add(new Gson().toJson(list));
        JsonData jsonData = new JsonData();
        jsonData.setTotalCount((long) list.size());
        jsonData.setData(infoList);
        return jsonData;
    }
}
