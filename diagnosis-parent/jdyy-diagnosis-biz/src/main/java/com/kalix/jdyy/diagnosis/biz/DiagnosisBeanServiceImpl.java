package com.kalix.jdyy.diagnosis.biz;

import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.diagnosis.api.biz.IDiagnosisBeanService;
import com.kalix.jdyy.diagnosis.api.dao.IDiagnosisBeanDao;
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
     * 回复树
     */
    @Override
    public DiagnosisTreeDTO getAllByParentId(long parentId) {
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
}
