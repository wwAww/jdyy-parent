package com.kalix.jdyy.visit.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "jdyy_visit")
public class VisitBean extends PersistentEntity {
    private long pid;// 序号-患者的id
    private String pname;// 患者姓名
    private String sex;// 性别
    private Integer age;// 年龄
    private String diagnosis;// 诊断
    private String surgical;// 术式
    private Integer diagnosisCode;// 诊断代码
    private Integer surgicalCode;// 术式代码
    private Integer AOcode;// AO代码
    private String operationDate;// 手术日期
    private String periodization;// 分期
    private String parting;// 分型
    private String xid;// id（未知）
    private String photo;// 图片

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(Integer diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public Integer getSurgicalCode() {
        return surgicalCode;
    }

    public void setSurgicalCode(Integer surgicalCode) {
        this.surgicalCode = surgicalCode;
    }

    public Integer getAOcode() {
        return AOcode;
    }

    public void setAOcode(Integer AOcode) {
        this.AOcode = AOcode;
    }

    public String getParting() {
        return parting;
    }

    public void setParting(String parting) {
        this.parting = parting;
    }

    public String getXid() {
        return xid;
    }

    public void setXid(String xid) {
        this.xid = xid;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSurgical() {
        return surgical;
    }

    public void setSurgical(String surgical) {
        this.surgical = surgical;
    }

    public String getOperationDate() {
        return operationDate;
    }

    public void setOperationDate(String operationDate) {
        this.operationDate = operationDate;
    }

    public String getPeriodization() {
        return periodization;
    }

    public void setPeriodization(String periodization) {
        this.periodization = periodization;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
