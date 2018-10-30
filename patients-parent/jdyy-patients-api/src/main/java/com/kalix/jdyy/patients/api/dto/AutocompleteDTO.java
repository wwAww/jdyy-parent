package com.kalix.jdyy.patients.api.dto;

/**
 * @author jiangbiao
 * @create 2018-10-30 下午 2:47
 * @desc el-autocomplete匹配数据泛型
 **/
public class AutocompleteDTO {
    private String value;
    private long pid;

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
