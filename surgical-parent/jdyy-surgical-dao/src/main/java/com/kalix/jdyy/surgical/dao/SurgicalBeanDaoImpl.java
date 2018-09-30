package com.kalix.jdyy.surgical.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.surgical.api.dao.ISurgicalBeanDao;
import com.kalix.jdyy.surgical.entities.SurgicalBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class SurgicalBeanDaoImpl extends GenericDao<SurgicalBean,Long> implements ISurgicalBeanDao {
    @Override
    @PersistenceContext(unitName = "surgical-cm")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
