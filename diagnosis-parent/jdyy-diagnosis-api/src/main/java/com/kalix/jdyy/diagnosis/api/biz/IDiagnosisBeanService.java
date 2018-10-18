package com.kalix.jdyy.diagnosis.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.diagnosis.api.dto.DiagnosisTreeDTO;
import com.kalix.jdyy.diagnosis.entities.DiagnosisBean;

public interface IDiagnosisBeanService extends IBizService<DiagnosisBean> {
    // 回复树
    DiagnosisTreeDTO getAllDiaByParentId(long parentId);

    JsonData getDiaCascader();
    // 获取统计分析中诊断饼状图列表数据
    String[] getDiaColumn();
    // 诊断删除节点以及子节点的功能
    void deleteAllDia(long id);
}
