package com.kalix.jdyy.surgical.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.surgical.api.dto.SurgicalTreeDTO;
import com.kalix.jdyy.surgical.entities.SurgicalBean;

public interface ISurgicalBeanService extends IBizService<SurgicalBean> {
    // 术式树
    SurgicalTreeDTO getAllSurByParentId(long parentId);

    JsonData getSurById();
}
