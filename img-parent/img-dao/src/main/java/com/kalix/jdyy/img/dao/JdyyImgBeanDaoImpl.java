package com.kalix.jdyy.img.dao;

import com.kalix.framework.core.impl.dao.GenericDao;
import com.kalix.jdyy.img.api.dao.IJdyyImgBeanDao;
import com.kalix.jdyy.img.entities.JdyyImgBean;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author 江彪
 * @create 2018-09-18 上午 9:24
 * @desc dao接口的实现类
 **/
public class JdyyImgBeanDaoImpl extends GenericDao<JdyyImgBean, Long> implements IJdyyImgBeanDao {
    @Override
    @PersistenceContext(unitName = "img-unit")
    public void setEntityManager(EntityManager em) {
        super.setEntityManager(em);
    }
}
