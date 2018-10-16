package com.kalix.jdyy.cascade.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.cascade.api.dao.ICascadeBeanDao;
import com.kalix.jdyy.cascade.entities.CascadeBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.UUID;

/**
 * Created by Wanghw on 2018/10/12.
 * 柱状图数据
 */
public class CascadeBeanDaoImpl extends GenericDao<CascadeBean, Long> implements ICascadeBeanDao {
    private String uuid;
    public CascadeBeanDaoImpl() {

        uuid = UUID.randomUUID().toString();
    }

    @Override
    @PersistenceContext(unitName = "cascade-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }

}
