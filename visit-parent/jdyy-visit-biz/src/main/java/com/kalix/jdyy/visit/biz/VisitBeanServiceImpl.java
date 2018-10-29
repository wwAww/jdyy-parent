package com.kalix.jdyy.visit.biz;

import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.visit.api.biz.IVisitBeanService;
import com.kalix.jdyy.visit.api.dao.IVisitBeanDao;
import com.kalix.jdyy.visit.api.dto.VisitPatientsDTO;
import com.kalix.jdyy.visit.api.dto.pieDataDTO;
import com.kalix.jdyy.visit.entities.VisitBean;

import javax.persistence.EntityManager;
import java.util.List;

public class VisitBeanServiceImpl extends GenericBizServiceImpl<IVisitBeanDao, VisitBean> implements IVisitBeanService {
    protected EntityManager entityManager;

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     *
     * @param diaDate 年份信息
     * @param diaStartAge 年龄段的起始年龄
     * @param diaEndAge 年龄段的结束年龄
     * @param diaRadio 性别（男/女）
     * @return 获取诊断饼状图数据
     */
    @Override
    public JsonData getDiaData(String diaDate, Integer diaStartAge, Integer diaEndAge, String diaRadio) {
        String sql = "SELECT d.content as name,count(v) as value FROM jdyy_diagnosis d,jdyy_visit v " +
                "WHERE d.parentId=-1 and substring(d.code,1,2)=substring(v.diagnosisCode,1,2)";
        if (diaDate != null && !diaDate.isEmpty()) {
            sql += " and v.operationDate like '" + diaDate + "%'";
        }
//        if (diaStartAge != null && diaEndAge != null) {
//            sql += " and p.age between " + diaStartAge + "and" + diaEndAge;
//            sql += " and v.pid = p.id";
//        }
//        if (diaRadio != null && !diaRadio.isEmpty()) {
//            sql += " and p,sex = " + diaRadio;
//            sql += " and v.pid = p.id";
//        }
        sql += " GROUP BY d.content";
        List<pieDataDTO> list = dao.findByNativeSql(sql,pieDataDTO.class);
        JsonData jsondata = new JsonData();
        jsondata.setData(list);
        jsondata.setTotalCount((long)list.size());
        return jsondata;
    }

    /**
     *
     * @param surDate 年份信息
     * @param surStartAge 年龄段的起始年龄
     * @param surEndAge 年龄段的结束年龄
     * @param surRadio 性别（男/女）
     * @return 获取诊断饼状图数据
     */
    @Override
    public JsonData getSurData(String surDate, Integer surStartAge, Integer surEndAge, String surRadio) {
        String sql = "SELECT s.content as name,count(v) as value FROM jdyy_surgical s,jdyy_visit v " +
                "WHERE s.parentId=-1 and substring(s.code,1,2)=substring(v.surgicalCode,1,2)";
        if (surDate != null && !surDate.isEmpty()) {
            sql += " and v.operationDate like '" + surDate + "%'";
        }
//        if (diaStartAge != null && diaEndAge != null) {
//            sql += " and p.age between " + diaStartAge + "and" + diaEndAge;
//            sql += " and v.pid = p.id";
//        }
//        if (diaRadio != null && !diaRadio.isEmpty()) {
//            sql += " and p,sex = " + diaRadio;
//            sql += " and v.pid = p.id";
//        }
        sql += " GROUP BY s.content";
        List<pieDataDTO> list = dao.findByNativeSql(sql,pieDataDTO.class);
        JsonData jsondata = new JsonData();
        jsondata.setData(list);
        jsondata.setTotalCount((long)list.size());
        return jsondata;
    }

    /**
     *
     * @return 根据UserId获取该用户就诊信息
     */
    @Override
    public JsonData getAllByUserId(long userId) {
        String sql = "select v from VisitBean v where v.pid=" + userId;
        List<VisitBean> list = dao.find(sql);
        JsonData jsonData = new JsonData();
        jsonData.setTotalCount((long)list.size());
        jsonData.setData(list);
        return jsonData;
    }

    /**
     * 根据Pid查询Pname
     * @return 多表联查 根据Pid返回带Pname的list
     */
    @Override
    public JsonData getPnameByPid(Integer page,Integer limit) {
        String sql = "select v.id,v.pid,v.diagnosis,v.surgical,v.diagnosisCode,v.surgicalCode,v.AOcode,v.operationDate,v.periodization,v.parting,v.xid,v.photo,p.name as pname " +
                "from jdyy_visit v,jdyy_patients p where v.pid=p.id";
        List<VisitPatientsDTO> vplist = dao.findByNativeSql(sql,VisitPatientsDTO.class);
        List<VisitPatientsDTO> list = vplist.subList(page*limit-limit, limit*page>vplist.size()?vplist.size():limit*page);
        JsonData jsondata = new JsonData();
        jsondata.setData(list);
        jsondata.setTotalCount((long)vplist.size());
        return jsondata;
    }
}
