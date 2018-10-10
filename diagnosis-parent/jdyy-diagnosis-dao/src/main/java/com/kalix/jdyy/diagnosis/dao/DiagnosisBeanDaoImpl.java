package com.kalix.jdyy.diagnosis.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.diagnosis.api.dao.IDiagnosisBeanDao;
import com.kalix.jdyy.diagnosis.entities.DiagnosisBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DiagnosisBeanDaoImpl extends GenericDao<DiagnosisBean,Long> implements IDiagnosisBeanDao {
    @Override
    @PersistenceContext(unitName = "diagnosis-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }

}
