package com.kalix.jdyy.diagnosis.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.diagnosis.api.dto.DiagnosisTreeDTO;
import com.kalix.jdyy.diagnosis.entities.DiagnosisBean;

public interface IDiagnosisBeanService extends IBizService<DiagnosisBean> {
    // 回复树
    DiagnosisTreeDTO getAllDiaByParentId(long parentId);

    JsonData getDiaById();
}
