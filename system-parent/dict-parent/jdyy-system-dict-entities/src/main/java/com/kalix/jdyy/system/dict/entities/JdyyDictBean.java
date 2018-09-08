package com.kalix.jdyy.system.dict.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.*;

/**
 * Created by Administrator on 2018/5/16.
 * 数据字典表
 */
@Entity
@Table(name = "hospital_dict")
@Inheritance(strategy = InheritanceType.JOINED)
public class JdyyDictBean extends PersistentEntity {
    private String type;    // 类型
    private String category;    // 分类
    private String description;
    private String label;
    private Integer value;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
