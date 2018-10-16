package com.kalix.jdyy.cascade.api.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

@ApiModel(value = "分页查询数据<br>CascadeMdl")
public class CascadeMdl {
    @ApiModelProperty("名称")
    private String value;
    @ApiModelProperty("当前页记录集")
    private List data = new ArrayList<>();

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
