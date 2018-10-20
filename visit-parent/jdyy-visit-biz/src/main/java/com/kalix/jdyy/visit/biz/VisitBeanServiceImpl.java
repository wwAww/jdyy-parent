package com.kalix.jdyy.visit.biz;

import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.visit.api.biz.IVisitBeanService;
import com.kalix.jdyy.visit.api.dao.IVisitBeanDao;
import com.kalix.jdyy.visit.api.dto.pieDataDTO;
import com.kalix.jdyy.visit.entities.VisitBean;

import java.util.ArrayList;
import java.util.List;

public class VisitBeanServiceImpl extends GenericBizServiceImpl<IVisitBeanDao, VisitBean> implements IVisitBeanService {

    /**
     *
     * @param diaColumn 饼状图数据列表
     * @return 获取诊断饼状图数据
     */
    @Override
    public JsonData getDiaData(String diaColumn) {
        List<VisitBean> vlist = dao.find("select v from VisitBean v");
        String[] strs = diaColumn.split(",");
        List<pieDataDTO> list = new ArrayList<>();
        for (Integer i = 0; i < strs.length; i++) {
            Integer num = 0;
            if (vlist.size() != 0) {
                for (VisitBean vb : vlist) {
                    if (vb.getDiagnosis() != null) {
                        if (vb.getDiagnosis().split(",")[0].equals(strs[i])) {
                            num++;
                        }
                    }
                }
            }
            pieDataDTO pd = new pieDataDTO();
            pd.setName(strs[i]);
            pd.setValue(num);
            list.add(pd);
        }
        JsonData jsondata = new JsonData();
        jsondata.setData(list);
        jsondata.setTotalCount((long)list.size());
        return jsondata;
    }

    /**
     *
     * @param surColumn 饼状图数据列表
     * @return 获取术式饼状图数据
     */
    @Override
    public JsonData getSurData(String surColumn) {
        List<VisitBean> vlist = dao.find("select v from VisitBean v");
        String[] strs = surColumn.split(",");
        List<pieDataDTO> list = new ArrayList<>();
        for (Integer i = 0; i < strs.length; i++) {
            Integer num = 0;
            if (vlist.size() != 0) {
                for (VisitBean vb : vlist) {
                    if (vb.getSurgical()!=null) {
                        if (vb.getSurgical().split(",")[0].equals(strs[i])) {
                            num++;
                        }
                    }
                }
            }
            pieDataDTO pd = new pieDataDTO();
            pd.setName(strs[i]);
            pd.setValue(num);
            list.add(pd);
        }
        JsonData jsondata = new JsonData();
        jsondata.setData(list);
        jsondata.setTotalCount((long)list.size());
        return jsondata;
    }
}
