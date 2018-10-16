package com.kalix.jdyy.cascade.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel(value = "分页查询数据<br>CascadeData")
public class CascadeData {

    @ApiModelProperty("data")
    private List<CascadeMdl> data;

    public List<CascadeMdl> getData() {
        return data;
    }

    public void setData(List<CascadeMdl> data) {
        this.data = data;
    }
}
