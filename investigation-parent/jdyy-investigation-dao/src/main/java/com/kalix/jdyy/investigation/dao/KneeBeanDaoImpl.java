package com.kalix.jdyy.investigation.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.investigation.api.dao.IKneeBeanDao;
import com.kalix.jdyy.investigation.entities.KneeBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class KneeBeanDaoImpl extends GenericDao<KneeBean,Long> implements IKneeBeanDao {
    @Override
    @PersistenceContext(unitName = "jdyy-investigation-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
