package com.kalix.jdyy.system.dict.biz;

import com.kalix.framework.core.api.persistence.JsonStatus;
import com.kalix.framework.core.impl.system.BaseDictServiceImpl;
import com.kalix.jdyy.system.dict.api.biz.IJdyyDictBeanService;
import com.kalix.jdyy.system.dict.api.dao.IJdyyDictBeanDao;
import com.kalix.jdyy.system.dict.entities.JdyyDictBean;

import java.util.List;

public class JdyyDictBeanServiceImpl extends BaseDictServiceImpl<IJdyyDictBeanDao, JdyyDictBean>
        implements IJdyyDictBeanService {

    public JdyyDictBeanServiceImpl() {
        super();
    }

    @Override
    public JsonStatus saveEntity(JdyyDictBean entity) {
        Integer maxValue = dao.getFieldMaxValue("value","type='"+entity.getType()+"'");

        maxValue=maxValue+1;
        entity.setValue(maxValue);

        return super.saveEntity(entity);
    }

}
