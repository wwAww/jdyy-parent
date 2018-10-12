package com.kalix.jdyy.system.district.api.dto;

import java.util.List;

/**
 * Created by wangpeng on 2018/5/26 0026.
 * 省市区三级联动查询格式封装
 */
public class CascaderDTO {
    private String value;
    private String label;
    private List<CascaderDTO> children;
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<CascaderDTO> getChildren() {
        return children;
    }

    public void setChildren(List<CascaderDTO> children) {
        this.children = children;
    }
}
