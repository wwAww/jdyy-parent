package com.kalix.jdyy.diagnosis.api.dto;

import java.util.List;

/**
 * Created by liangchang on 2018/10/11
 * 术式三级联动查询格式封装
 */
public class DiagnosisDTO {
    private String value;
    private String label;
    private List<DiagnosisDTO> children;
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

    public List<DiagnosisDTO> getChildren() {
        return children;
    }

    public void setChildren(List<DiagnosisDTO> children) {
        this.children = children;
    }
}
