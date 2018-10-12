package com.kalix.jdyy.surgical.biz;

import com.google.gson.Gson;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.surgical.api.biz.ISurgicalBeanService;
import com.kalix.jdyy.surgical.api.dao.ISurgicalBeanDao;
import com.kalix.jdyy.surgical.api.dto.SurgicalDTO;
import com.kalix.jdyy.surgical.api.dto.SurgicalTreeDTO;
import com.kalix.jdyy.surgical.entities.SurgicalBean;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

public class SurgicalBeanServiceImpl extends GenericBizServiceImpl<ISurgicalBeanDao,SurgicalBean> implements ISurgicalBeanService {
        public SurgicalBeanServiceImpl() {
        super();
    }
    /**
     * 术式树
     */
    @Override
    public SurgicalTreeDTO getAllSurByParentId(long parentId) {
        SurgicalTreeDTO root = new SurgicalTreeDTO();
        root.setId(-1L);
        List<SurgicalBean> beans = new ArrayList<>();
        String sql = "select s from SurgicalBean s where 1=1";
        if(parentId != -1){
            sql += " and s.parentId=" + parentId;
        }
        sql += " order by s.creationDate desc";
        beans = dao.find(sql);

        if(beans != null && beans.size() > 0){
            List<SurgicalBean> rootElements = getRootElements(beans);
            if(rootElements != null && rootElements.size() > 0){
                for(SurgicalBean rootElement:rootElements){
                    Mapper mapper = new DozerBeanMapper();
                    SurgicalTreeDTO surgicalTreeDTO = mapper.map(rootElement,SurgicalTreeDTO.class);
                    surgicalTreeDTO.setLeaf(rootElement.getIsLeaf() == 0 ? false : true);
                    surgicalTreeDTO.setParentName("根目录");
                    getChilden(surgicalTreeDTO, beans, mapper);
                    root.getChildren().add(surgicalTreeDTO);
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
    private void getChilden(SurgicalTreeDTO root, List<SurgicalBean> elements, Mapper mapper){
        List<SurgicalTreeDTO> children = new ArrayList<SurgicalTreeDTO>();
        for(SurgicalBean surgicalBean : elements){
            if(root.getId() != -1 && (root.getId() == surgicalBean.getParentId())){
                SurgicalTreeDTO surgicalTreeDTO = mapper.map(surgicalBean, SurgicalTreeDTO.class);
                surgicalTreeDTO.setLeaf(surgicalBean.getIsLeaf() == 0 ? false : true);
                surgicalTreeDTO.setParentName(root.getContent());
                children.add(surgicalTreeDTO);
                if(surgicalBean.getIsLeaf() == 0){
                    getChilden(surgicalTreeDTO, elements ,mapper);
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

    private List<SurgicalBean> getRootElements(List<SurgicalBean> elements) {
        List<SurgicalBean> roots=new ArrayList<SurgicalBean>();
        for (SurgicalBean element : elements) {
            if (element.getParentId() == -1) {
                roots.add(element);
            }
        }
        return roots;
    }

    public JsonData getAllSurByParentId() {
        SurgicalDTO surgicalDTO = new SurgicalDTO();
        List<SurgicalDTO> list = new ArrayList<>();
        List<SurgicalBean> oneList = dao.find("select s from SurgicalBean s where s.parentId=-1");
        for(SurgicalBean one : oneList) {
            SurgicalDTO oneModel = new SurgicalDTO();
            oneModel.setValue(one.getContent());
            oneModel.setLabel(one.getContent());
            List<SurgicalBean> twoList = dao.find("select s from SurgicalBean s where s.parentId = ?1" , one.getId());
            List<SurgicalDTO> tsList = new ArrayList<>();
            for (SurgicalBean two:twoList) {
                SurgicalDTO twoModel = new SurgicalDTO();
                twoModel.setValue(two.getContent());
                twoModel.setLabel(two.getContent());
                List<SurgicalBean> threeList = dao.find("select s from SurgicalBean s where s.parentId = ?1" , two.getId());
                List<SurgicalDTO> thList = new ArrayList<>();
                for (SurgicalBean three:threeList) {
                    SurgicalDTO threeModel = new SurgicalDTO();
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
