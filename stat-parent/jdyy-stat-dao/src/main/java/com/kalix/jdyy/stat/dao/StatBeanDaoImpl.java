package com.kalix.jdyy.stat.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.stat.api.dao.IStatBeanDao;
import com.kalix.jdyy.stat.entities.StatBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author jiangbiao
 * @create 2018-09-25 下午 4:26
 * @desc 统计录入dao实现类
 **/
public class StatBeanDaoImpl extends GenericDao<StatBean, Long> implements IStatBeanDao {
    @Override
    @PersistenceContext(unitName = "stat-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
