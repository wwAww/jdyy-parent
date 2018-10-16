package com.kalix.jdyy.cascade.biz;

import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.cascade.api.biz.ICascadeBeanService;
import com.kalix.jdyy.cascade.api.dao.ICascadeBeanDao;
import com.kalix.jdyy.cascade.api.model.CascadeData;
import com.kalix.jdyy.cascade.api.model.CascadeMdl;
import com.kalix.jdyy.cascade.entities.CascadeBean;
import org.apache.commons.collections.map.LinkedMap;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Wanghw on 2018/10/12.
 * 柱状图数据
 */
public  class CascadeServiceImpl extends GenericBizServiceImpl<ICascadeBeanDao, CascadeBean> implements ICascadeBeanService {
    public CascadeServiceImpl(){
        super.init(CascadeBean.class.getName());
    }



    public CascadeData getAllColumncord() {

            JsonData jd = getAllEntityByQuery(1, 10000, "", "");
            List<CascadeBean> datas = jd.getData();
            Map<String, List<CascadeBean>> maps = new LinkedHashMap<>();

            List<String> names = new ArrayList<>();
            for (CascadeBean cr : datas) {
                if (!names.contains(cr.getValue())){
                    names.add(cr.getValue());
                }
            }

            CascadeData rd = new CascadeData();
            List<CascadeMdl> rds =new ArrayList<>();
            for (String name : names){
                List<CascadeBean> nDatas = datas.stream().filter((n)->name.equals(n.getValue())).collect(Collectors.toList());
                CascadeMdl rm = new CascadeMdl();
                rm.getValue();
                rm.setData(nDatas);
                rds.add(rm);
            }
            rd.setData(rds);

            return rd;

    }
}
