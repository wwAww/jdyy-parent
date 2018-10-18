package com.kalix.jdyy.visit.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.visit.entities.VisitBean;

public interface IVisitBeanService extends IBizService<VisitBean> {
    // 获取诊断饼状图数据
    JsonData getDiaData(String diaColumn);
    // 获取术式饼状图数据
    JsonData getSurData(String surColumn);
}
