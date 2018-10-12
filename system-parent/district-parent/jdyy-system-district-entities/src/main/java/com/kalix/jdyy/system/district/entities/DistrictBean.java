package com.kalix.jdyy.system.district.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Created by sunli on 2018/5/16.
 * 地区编码表
 */
@Entity
@Table(name = "jdyy_district")
@Inheritance(strategy = InheritanceType.JOINED)
public class DistrictBean extends PersistentEntity{
    private String coding; //编码
    private String bewrite; //地区描述
    private String parentencoding; //上级地区编码

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding;
    }

    public String getBewrite() {
        return bewrite;
    }

    public void setBewrite(String bewrite) {
        this.bewrite = bewrite;
    }

    public String getParentencoding() {
        return parentencoding;
    }

    public void setParentencoding(String parentencoding) {
        this.parentencoding = parentencoding;
    }
}
