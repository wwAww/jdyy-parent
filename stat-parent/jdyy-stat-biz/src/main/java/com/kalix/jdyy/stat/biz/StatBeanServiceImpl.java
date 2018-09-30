package com.kalix.jdyy.stat.biz;

import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.stat.api.biz.IStatBeanService;
import com.kalix.jdyy.stat.api.dao.IStatBeanDao;
import com.kalix.jdyy.stat.entities.StatBean;

import java.util.List;

/**
 * @author jiangbiao
 * @create 2018-09-25 下午 4:41
 * @desc biz实现类
 **/
public class StatBeanServiceImpl extends GenericBizServiceImpl<IStatBeanDao, StatBean> implements IStatBeanService {
    public StatBeanServiceImpl(){super.init(StatBean.class.getName());}

    @Override
    public JsonData getAllByDate(String date) {
        String sql = "select s from StatBean s where 1=1";
        if(date != null && date != "") {
            sql+=" and s.date like '%" + date + "%'";
        }
        JsonData jsonData= new JsonData();
        List<StatBean> list = dao.find(sql);
        jsonData.setData(list);
        jsonData.setTotalCount((long)(list.size()));
        System.out.println("jsonData==============" + jsonData);
        return jsonData;
    }

    @Override
    public Integer[] getAllByYear(String date) {
        String sql = "select s from StatBean s where 1=1";
        if(date != null && date != "") {
            sql+=" and s.date like '%" + date + "%'";
        }
        List<StatBean> list = dao.find(sql);
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
        for (StatBean s : list) {
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
