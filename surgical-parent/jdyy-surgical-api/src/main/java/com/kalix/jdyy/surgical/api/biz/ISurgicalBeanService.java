package com.kalix.jdyy.surgical.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.surgical.api.dto.SurgicalTreeDTO;
import com.kalix.jdyy.surgical.entities.SurgicalBean;

public interface ISurgicalBeanService extends IBizService<SurgicalBean> {
    // 术式树
    SurgicalTreeDTO getAllSurByParentId(long parentId);
    // 获取术式的级联数据
    JsonData getSurCascader();
    // 获取统计分析中诊断饼状图列表数据
    String[] getSurColumn();
    // 术式删除节点以及子节点的功能
    void deleteAllSur(long id);
    // 计算当前父节点下的节点的最大代码（code）返回处理后的新code
    String getCodeByPid(long pid);
}
