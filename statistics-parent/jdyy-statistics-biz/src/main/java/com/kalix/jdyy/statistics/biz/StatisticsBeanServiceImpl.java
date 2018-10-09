package com.kalix.jdyy.statistics.biz;

import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.statistics.api.biz.IStatisticsBeanService;
import com.kalix.jdyy.statistics.api.dao.IStatisticsBeanDao;
import com.kalix.jdyy.statistics.entities.StatisticsBean;

import java.util.List;

/**
 * @author jiangbiao
 * @create 2018-09-25 下午 4:41
 * @desc biz实现类
 **/
public class StatisticsBeanServiceImpl extends GenericBizServiceImpl<IStatisticsBeanDao, StatisticsBean> implements IStatisticsBeanService {
    public StatisticsBeanServiceImpl(){super.init(StatisticsBean.class.getName());}

    // 对应今日数据指标的方法实现：通过前台传回的日期参数，访问数据库，获取相应日期的数据
    @Override
    public JsonData getAllByDate(String date) {
        String sql = "select s from StatisticsBean s where 1=1";
        if(date != null && date != "") {
            sql+=" and s.date like '%" + date + "%'";
        }
        JsonData jsonData= new JsonData();
        List<StatisticsBean> list = dao.find(sql);
        jsonData.setData(list);
        jsonData.setTotalCount((long)(list.size()));
        System.out.println("jsonData==============" + jsonData);
        return jsonData;
    }

    // 对应月份数据对比的方法实现：通过前台传回的年份参数，访问数据库，获取相应年份的数据
    @Override
    public Integer[] getAllByYear(String date) {
        String sql = "select s from StatisticsBean s where 1=1";
        if(date != null && date != "") {
            sql+=" and s.date like '%" + date + "%'";
        }
        List<StatisticsBean> list = dao.find(sql);
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;
        int twelve = 0;
        for (StatisticsBean s : list) {
            String month = s.getDate().substring(5,7);
            if(month.equals("01")){
                one += s.getSurgeryNum();
            }
            if(month.equals("02")){
                two += s.getSurgeryNum();
            }
            if(month.equals("03")){
                three += s.getSurgeryNum();
            }
            if(month.equals("04")){
                four += s.getSurgeryNum();
            }
            if(month.equals("05")){
                five += s.getSurgeryNum();
            }
            if(month.equals("06")){
                six += s.getSurgeryNum();
            }
            if(month.equals("07")){
                seven += s.getSurgeryNum();
            }
            if(month.equals("08")){
                eight += s.getSurgeryNum();
            }
            if(month.equals("09")){
                nine += s.getSurgeryNum();
            }
            if(month.equals("10")){
                ten += s.getSurgeryNum();
            }
            if(month.equals("11")){
                eleven += s.getSurgeryNum();
            }
            if(month.equals("12")){
                twelve += s.getSurgeryNum();
            }
        }
        Integer[] str = {one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve};
        return str;
    }
}
