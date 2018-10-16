package com.kalix.jdyy.visit.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.visit.api.dao.IVisitBeanDao;
import com.kalix.jdyy.visit.entities.VisitBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class VisitBeanDaoImpl extends GenericDao<VisitBean, Long> implements IVisitBeanDao {
    @Override
    @PersistenceContext(unitName = "jdyy-visit-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
