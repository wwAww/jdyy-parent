package com.kalix.jdyy.img.biz;

import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.img.api.biz.IJdyyImgBeanService;
import com.kalix.jdyy.img.api.dao.IJdyyImgBeanDao;
import com.kalix.jdyy.img.entities.JdyyImgBean;

/**
 * @author 江彪
 * @create 2018-09-18 上午 9:43
 * @desc biz实现类
 **/
public class JdyyImgBeanServiceImpl extends GenericBizServiceImpl<IJdyyImgBeanDao,JdyyImgBean> implements IJdyyImgBeanService {
     public JdyyImgBeanServiceImpl(){super.init(JdyyImgBean.class.getName());}
}
