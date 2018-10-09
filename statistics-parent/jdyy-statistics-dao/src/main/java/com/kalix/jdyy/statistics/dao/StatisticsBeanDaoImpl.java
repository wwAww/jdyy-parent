package com.kalix.jdyy.statistics.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.statistics.api.dao.IStatisticsBeanDao;
import com.kalix.jdyy.statistics.entities.StatisticsBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author jiangbiao
 * @create 2018-09-25 下午 4:26
 * @desc 统计录入dao实现类
 **/
public class StatisticsBeanDaoImpl extends GenericDao<StatisticsBean, Long> implements IStatisticsBeanDao {
    @Override
    @PersistenceContext(unitName = "statistics-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
