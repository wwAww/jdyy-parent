package com.kalix.jdyy.statistics.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.*;

/**
 * @author jiangbiao
 * @create 2018-09-25 下午 2:54
 * @desc 统计实体类
 **/
@Entity
@Table(name = "jdyy_statistics")
public class StatisticsBean extends PersistentEntity {
    private Integer protoNum;//原住院人数
    private Integer outNum;//出院人数
    private Integer inNum;//入院（转）入人数
    private Integer surgeryNum;//手术人数
    private Integer deathNum;//死亡人数
    private Integer nowNum;//现住院人数
    private Integer illNum;//重病人数
    private String doctor;//坐班医生
    private String date;//坐班日期

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getProtoNum() {
        return protoNum;
    }

    public void setProtoNum(Integer protoNum) {
        this.protoNum = protoNum;
    }

    public Integer getOutNum() {
        return outNum;
    }

    public void setOutNum(Integer outNum) {
        this.outNum = outNum;
    }

    public Integer getInNum() {
        return inNum;
    }

    public void setInNum(Integer inNum) {
        this.inNum = inNum;
    }

    public Integer getSurgeryNum() {
        return surgeryNum;
    }

    public void setSurgeryNum(Integer surgeryNum) {
        this.surgeryNum = surgeryNum;
    }

    public Integer getDeathNum() {
        return deathNum;
    }

    public void setDeathNum(Integer deathNum) {
        this.deathNum = deathNum;
    }

    public Integer getNowNum() {
        return nowNum;
    }

    public void setNowNum(Integer nowNum) {
        this.nowNum = nowNum;
    }

    public Integer getIllNum() {
        return illNum;
    }

    public void setIllNum(Integer illNum) {
        this.illNum = illNum;
    }
}
