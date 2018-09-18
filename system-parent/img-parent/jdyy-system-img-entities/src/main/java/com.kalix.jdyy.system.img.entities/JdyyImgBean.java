package com.kalix.jdyy.system.img.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.*;

/**
 * @author 江彪
 * @create 2018-09-17 下午 5:04
 * @desc 图片实体类
 **/
@Entity
@Table(name = "hospital_img")
@Inheritance(strategy = InheritanceType.JOINED)
public class JdyyImgBean extends PersistentEntity {
    private Integer id;
    private String img;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
