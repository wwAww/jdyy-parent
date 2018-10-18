package com.kalix.jdyy.visit.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.visit.entities.VisitBean;

public interface IVisitBeanService extends IBizService<VisitBean> {
    // 获取诊断饼状图数据
    JsonData getPieData(String diaColumn);
}
