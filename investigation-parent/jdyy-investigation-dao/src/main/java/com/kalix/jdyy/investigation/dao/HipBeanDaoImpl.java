package com.kalix.jdyy.investigation.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.investigation.api.dao.IHipBeanDao;
import com.kalix.jdyy.investigation.entities.HipBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class HipBeanDaoImpl extends GenericDao<HipBean,Long> implements IHipBeanDao {
    @Override
    @PersistenceContext(unitName = "jdyy-investigation-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
