package com.kalix.jdyy.cascade.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.jdyy.cascade.api.model.CascadeData;
import com.kalix.jdyy.cascade.entities.CascadeBean;


/**
 * Created by Wanghw on 2018/10/12.
 * 柱状图数据
 */
public interface ICascadeBeanService extends IBizService<CascadeBean> {
    public CascadeData getAllCascade();
}
