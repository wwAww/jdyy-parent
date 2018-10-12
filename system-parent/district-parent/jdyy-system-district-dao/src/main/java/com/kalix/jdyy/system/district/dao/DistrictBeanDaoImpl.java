package com.kalix.jdyy.system.district.dao;
/**
 * Created by sunli on 2018/5/13.
 */


import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.system.district.api.dao.IDistrictBeanDao;
import com.kalix.jdyy.system.district.entities.DistrictBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DistrictBeanDaoImpl extends GenericDao<DistrictBean, Long> implements IDistrictBeanDao {
    @Override
    @PersistenceContext(unitName = "jdyy-system-district-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
