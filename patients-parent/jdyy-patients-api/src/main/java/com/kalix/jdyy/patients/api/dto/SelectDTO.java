package com.kalix.jdyy.patients.api.dto;

/**
 * @author jiangbiao
 * @create 2018-10-19 上午 11:44
 * @desc el-select选择器需要的数据类型
 **/
public class SelectDTO {
    private long value;
    private String label;

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
