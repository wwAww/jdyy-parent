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
import java.util.stream.Collectors;

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

    /**
     * 获取术式信息，并以级联形式返回数据
     * @return
     */

    public JsonData getSurCascader() {
        List<SurgicalBean> qlist = dao.find("select s from SurgicalBean s");
        List<SurgicalBean> listParents = qlist.stream().filter(db-> db.getParentId()==-1).collect(Collectors.toList());
        List<SurgicalDTO> list = new ArrayList<>();
        for(SurgicalBean one : listParents) {
            SurgicalDTO sd = new SurgicalDTO();
            sd.setValue(one.getContent());
            sd.setLabel(one.getContent());
            sd.setChildren(getSurgicalChilden(one, qlist));
            list.add(sd);
        }
        JsonData jsonData = new JsonData();
        jsonData.setTotalCount((long) list.size());
        jsonData.setData(list);
        return jsonData;
    }

    /**
     * 获取统计分析中诊断饼状图列表数据
     * @return
     */
    @Override
    public String[] getSurColumn() {
        List<SurgicalBean> list = dao.find("select s from SurgicalBean s where s.parentId = -1");
        String str = "";
        for (SurgicalBean dia : list) {
            str += dia.getContent() + ',';
        }
        String[] strs = str.trim().split(",");
        return strs;
    }

    /**
     *术式删除节点以及子节点的功能
     * @param id
     */
    @Override
    public void deleteAllSur(long id) {
        dao.remove(id);
        deleteAllChilders(id);
    }

    /**
     * @param pid
     * @return 计算当前父节点下的节点的最大代码（code）返回处理后的新code
     */
    @Override
    public String getCodeByPid(long pid) {
        List<SurgicalBean> list = dao.find("select s from SurgicalBean s where s.parentId=?1", pid);
        Integer num = getLevelByPid(pid, 1);
        if (pid != -1) {
            SurgicalBean sur = dao.get(pid);
            StringBuilder code = new StringBuilder(sur.getCode());
            Integer codeNum = 0;
            if (list.size() != 0) {
                codeNum = Integer.parseInt(list.get(0).getCode().substring((num-1)*2, num*2));
                for (SurgicalBean db : list) {
                    if (codeNum < Integer.parseInt(db.getCode().substring(num*2-2, num*2))) {
                        codeNum = Integer.parseInt(db.getCode().substring(num*2-2, num*2));
                    }
                }
            }
            codeNum = codeNum + 1;
            if (codeNum < 10) {
                code = code.replace((num-1)*2, num*2, "0" + codeNum);
                return code + "";
            }else {
                code = code.replace((num-1)*2, num*2, codeNum.toString());
                return code + "";
            }
        } else {
            Integer codeNum = 0;
            if (list.size() != 0) {
                codeNum = Integer.parseInt(list.get(0).getCode().substring((num-1)*2, num*2));
                for (SurgicalBean db : list) {
                    if (codeNum < Integer.parseInt(db.getCode().substring(num*2-2, num*2))) {
                        codeNum = Integer.parseInt(db.getCode().substring(num*2-2, num*2));
                    }
                }
            }
            codeNum = codeNum + 1;
            if (codeNum < 10) {
                String code = "0" + codeNum + "000000";
                return code;
            }else {
                String code = codeNum + "000000";
                return code;
            }
        }
    }

    /**
     *
     * @param content 术式的内容
     * @return 相应的术式信息
     */
    @Override
    public JsonData getCodeByContent(String content) {
        List<SurgicalBean> list = dao.find("select s from SurgicalBean s where s.content=?1", content);
        JsonData jsondata = new JsonData();
        jsondata.setData(list);
        jsondata.setTotalCount((long)list.size());
        return jsondata;
    }

    // 用递归计数获取第几级数据
    private Integer getLevelByPid(long pid, Integer num) {
        if (pid == -1) {
            return num;
        }else {
            SurgicalBean dia = dao.get(pid);
            num++;
            return getLevelByPid(dia.getParentId(), num);
        }
    }

    //用递归的方法
    public void deleteAllChilders(long id){
        List<SurgicalBean> list=dao.find("select s from SurgicalBean s ");
        for(SurgicalBean sur:list){
            if (sur.getParentId() == id){
                dao.remove(sur.getId());
                deleteAllChilders(sur.getId());
            }
        }
    }

    /**
     * 递归方法获取级联子节点
     */

    private List<SurgicalDTO> getSurgicalChilden(SurgicalBean one, List<SurgicalBean> qlist) {
        List<SurgicalDTO> list = new ArrayList<>();
        for (SurgicalBean db : qlist) {
            if (one.getId() == db.getParentId()) {
                SurgicalDTO sd = new SurgicalDTO();
                sd.setValue(db.getContent());
                sd.setLabel(db.getContent());
                List<SurgicalDTO> children = getSurgicalChilden(db, qlist);
                if (children != null && !children.isEmpty()) {
                    sd.setChildren(children);
                }
                list.add(sd);
            }
        }
        return list;
    }

}
