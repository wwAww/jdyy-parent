package com.kalix.jdyy.system.district.api.biz;

/**
 * Created by sunli on 2018/5/13.
 */

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.jdyy.system.district.entities.DistrictBean;

public interface IDistrictBeanService extends IBizService<DistrictBean> {

    JsonData getDistrictForCascader();

}
