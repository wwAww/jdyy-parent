package com.kalix.jdyy.patients.biz;

import com.kalix.framework.core.api.persistence.JsonData;
import com.kalix.framework.core.impl.biz.GenericBizServiceImpl;
import com.kalix.jdyy.patients.api.biz.IPatientsBeanService;
import com.kalix.jdyy.patients.api.dao.IPatientsBeanDao;
import com.kalix.jdyy.patients.api.dto.SelectDTO;
import com.kalix.jdyy.patients.entities.PatientsBean;

import java.util.ArrayList;
import java.util.List;

public class PatientsBeanServiceImpl extends GenericBizServiceImpl<IPatientsBeanDao,PatientsBean>
implements IPatientsBeanService {
    /**
     *
     * @return获取病员信息（以el-select选择器需要的形式返回数据）
     */
    @Override
    public JsonData getDataBySelect() {
        List<PatientsBean> plist = dao.find("select p from PatientsBean p");
        List<SelectDTO> list = new ArrayList<>();
        for (PatientsBean pb : plist) {
            SelectDTO sd = new SelectDTO();
            sd.setLabel(pb.getName());
            sd.setValue(pb.getId());
            list.add(sd);
        }
        JsonData jsondata = new JsonData();
        jsondata.setData(list);
        jsondata.setTotalCount((long)list.size());
        return jsondata;
    }
}
