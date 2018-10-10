package com.kalix.jdyy.patients.dao;


import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.patients.api.dao.IPatientsBeanDao;
import com.kalix.jdyy.patients.entities.PatientsBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PatientsBeanDaoImpl extends GenericDao<PatientsBean,Long> implements IPatientsBeanDao {
    @Override
    @PersistenceContext(unitName = "jdyy-patients-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
