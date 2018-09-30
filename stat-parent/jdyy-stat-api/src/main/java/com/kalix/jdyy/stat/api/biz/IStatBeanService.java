package com.kalix.jdyy.stat.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.stat.entities.StatBean;

/**
 * @author 江彪
 * @create 2018-09-25 下午 3:49
 * @desc 统计biz接口
 **/
public interface IStatBeanService extends IBizService<StatBean> {
    JsonData getAllByDate(String date);
    Integer[] getAllByYear(String date);
}
