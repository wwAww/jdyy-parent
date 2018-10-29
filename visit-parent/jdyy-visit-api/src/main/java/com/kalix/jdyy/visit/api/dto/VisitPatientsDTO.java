package com.kalix.jdyy.visit.api.dto;

/**
 * @author jiangbiao
 * @create 2018-10-29 上午 9:21
 * @desc 病员基本信息与就诊信息的整合DTO
 **/
public class VisitPatientsDTO {
    private long id;
    private long pid;// 序号-患者的id
    private String diagnosis;// 诊断
    private String surgical;// 术式
    private String diagnosisCode;// 诊断代码
    private String surgicalCode;// 术式代码
    private String AOcode;// AO代码
    private String operationDate;// 手术日期
    private String periodization;// 分期
    private String parting;// 分型
    private String xid;// id（未知）
    private String photo;// 图片
    private String pname;// 患者姓名

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getPid() {
        return pid;
    }

    public void setPid(long pid) {
        this.pid = pid;
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

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getSurgicalCode() {
        return surgicalCode;
    }

    public void setSurgicalCode(String surgicalCode) {
        this.surgicalCode = surgicalCode;
    }

    public String getAOcode() {
        return AOcode;
    }

    public void setAOcode(String AOcode) {
        this.AOcode = AOcode;
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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }
}
