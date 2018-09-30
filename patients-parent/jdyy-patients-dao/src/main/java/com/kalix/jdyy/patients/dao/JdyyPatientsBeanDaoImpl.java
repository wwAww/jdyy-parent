package com.kalix.jdyy.patients.dao;


import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.patients.api.dao.IJdyyPatientsBeanDao;
import com.kalix.jdyy.patients.entities.JdyyPatientsBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JdyyPatientsBeanDaoImpl extends GenericDao<JdyyPatientsBean,Long> implements IJdyyPatientsBeanDao {
    @Override
    @PersistenceContext(unitName = "jdyy-patients-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
