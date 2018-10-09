package com.kalix.jdyy.statistics.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.statistics.entities.StatisticsBean;

/**
 * @author 江彪
 * @create 2018-09-25 下午 3:49
 * @desc 统计biz接口
 **/
public interface IStatisticsBeanService extends IBizService<StatisticsBean> {
    JsonData getAllByDate(String date);// 对应今日数据指标的方法接口
    Integer[] getAllByYear(String date);// 对应月份数据对比的方法接口
}
