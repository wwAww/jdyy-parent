package com.kalix.jdyy.patients.api.biz;


import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.patients.entities.PatientsBean;

public interface IPatientsBeanService extends IBizService<PatientsBean> {
//    获取病员信息（以el-select选择器需要的形式返回数据）
    JsonData getDataBySelect();
}
