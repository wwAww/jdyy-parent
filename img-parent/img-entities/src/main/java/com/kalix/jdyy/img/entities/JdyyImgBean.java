package com.kalix.jdyy.img.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.*;

/**
 * @author 江彪
 * @create 2018-09-17 下午 5:04
 * @desc 图片实体类
 **/
@Entity
@Table(name = "hospital_img")
public class JdyyImgBean extends PersistentEntity {
    private String imgurl;//图片地址（CouchDB返回的path）
    private String name;//图片名称
    private String link;//图片描述

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
