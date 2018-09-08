package com.kalix.jdyy.system.dict.dao;


import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.system.dict.api.dao.IJdyyDictBeanDao;
import com.kalix.jdyy.system.dict.entities.JdyyDictBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JdyyDictBeanDaoImpl extends GenericDao<JdyyDictBean, Long> implements IJdyyDictBeanDao {
    @Override
    @PersistenceContext(unitName = "jdyy-system-dict-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
