package com.kalix.jdyy.cascade.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Wanghw on 2018/10/12.
 * 柱状图数据
 */
@Entity
@Table(name = "jdyy-cascade")
public class CascadeBean extends PersistentEntity {
    private String lable;
    private String children;
    private String value;

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
