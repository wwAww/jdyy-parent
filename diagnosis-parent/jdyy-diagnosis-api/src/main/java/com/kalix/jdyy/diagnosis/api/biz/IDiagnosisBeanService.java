package com.kalix.jdyy.diagnosis.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.diagnosis.api.dto.DiagnosisTreeDTO;
import com.kalix.jdyy.diagnosis.entities.DiagnosisBean;

public interface IDiagnosisBeanService extends IBizService<DiagnosisBean> {
    // 回复树
    DiagnosisTreeDTO getAllDiaByParentId(long parentId);
    // 获取诊断的级联数据
    JsonData getDiaCascader();
    // 获取统计分析中诊断饼状图列表数据
    String[] getDiaColumn();
    // 诊断删除节点以及子节点的功能
    void deleteAllDia(long id);
    // 计算当前父节点下的节点的最大代码（code）返回处理后的新code
    String getCodeByPid(long pid);
    // 通过诊断的内容查询相应的诊断信息
    JsonData getCodeByContent(String content);
}
