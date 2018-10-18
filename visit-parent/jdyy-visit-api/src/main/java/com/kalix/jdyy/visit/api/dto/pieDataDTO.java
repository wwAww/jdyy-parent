package com.kalix.jdyy.visit.api.dto;

/**
 * @author jiangbiao
 * @create 2018-10-17 下午 8:05
 * @desc 饼状图数据类型
 **/
public class pieDataDTO {
    private Integer value;
    private String name;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
