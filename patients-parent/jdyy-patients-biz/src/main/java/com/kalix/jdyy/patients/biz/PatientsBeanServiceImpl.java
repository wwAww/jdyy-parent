package com.kalix.jdyy.patients.biz;

import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.patients.api.biz.IPatientsBeanService;
import com.kalix.jdyy.patients.api.dao.IPatientsBeanDao;
import com.kalix.jdyy.patients.entities.PatientsBean;

public class PatientsBeanServiceImpl extends GenericBizServiceImpl<IPatientsBeanDao,PatientsBean>
implements IPatientsBeanService {
}
