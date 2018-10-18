package com.kalix.jdyy.patients.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;
// 病员基本信息
@Entity
@Table(name = "jdyy_patients")
public class PatientsBean extends PersistentEntity {
    private String name;// 姓名
    private String sex;// 性别
    private String brith;// 出生日期
    private Integer age;// 年龄
    private String idCard;// 身份证号
    private Integer bedNumber;// 床位号你
    private Integer hospitalNumber;// 住院号
    private String directorDoctor;// 主管医生
    private String dateAdmission;//入院日期
    private String dischargeDate;// 出院日期
    private Integer stature;// 身高
    private Integer weight;// 体重
    private Integer bmi;// BMI
    private Integer bloodPressure;// 血压
    private String specialDisorders;// 特殊疾病
    private String descriptionSpecialDisease;// 特殊疾病描述
    private String allergicHistory;// 过敏史
    private String medicalCategory;// 医疗类别
    private String whetherDischarge;// 是否出院
    private String telephonePerson;// 本人联系方式
    private String familyPhone;// 家属联系方式
    private String address;// 省市区
    private String completeAddress;// 详细地址
    private String remarks;// 备注
    private Integer harris;// harris评分
    private Integer hss;// hss评分
    private String buckling;// 屈曲
    private String abduction;// 外展
    private String adduction;// 内收

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public Integer getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(Integer bedNumber) {
        this.bedNumber = bedNumber;
    }

    public Integer getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(Integer hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getDirectorDoctor() {
        return directorDoctor;
    }

    public void setDirectorDoctor(String directorDoctor) {
        this.directorDoctor = directorDoctor;
    }

    public String getDateAdmission() {
        return dateAdmission;
    }

    public void setDateAdmission(String dateAdmission) {
        this.dateAdmission = dateAdmission;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public Integer getStature() {
        return stature;
    }

    public void setStature(Integer stature) {
        this.stature = stature;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getBmi() {
        return bmi;
    }

    public void setBmi(Integer bmi) {
        this.bmi = bmi;
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getSpecialDisorders() {
        return specialDisorders;
    }

    public void setSpecialDisorders(String specialDisorders) {
        this.specialDisorders = specialDisorders;
    }

    public String getDescriptionSpecialDisease() {
        return descriptionSpecialDisease;
    }

    public void setDescriptionSpecialDisease(String descriptionSpecialDisease) {
        this.descriptionSpecialDisease = descriptionSpecialDisease;
    }

    public String getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(String allergicHistory) {
        this.allergicHistory = allergicHistory;
    }

    public String getMedicalCategory() {
        return medicalCategory;
    }

    public void setMedicalCategory(String medicalCategory) {
        this.medicalCategory = medicalCategory;
    }

    public String getWhetherDischarge() {
        return whetherDischarge;
    }

    public void setWhetherDischarge(String whetherDischarge) {
        this.whetherDischarge = whetherDischarge;
    }

    public String getTelephonePerson() {
        return telephonePerson;
    }

    public void setTelephonePerson(String telephonePerson) {
        this.telephonePerson = telephonePerson;
    }

    public String getFamilyPhone() {
        return familyPhone;
    }

    public void setFamilyPhone(String familyPhone) {
        this.familyPhone = familyPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getHarris() {
        return harris;
    }

    public void setHarris(Integer harris) {
        this.harris = harris;
    }

    public Integer getHss() {
        return hss;
    }

    public void setHss(Integer hss) {
        this.hss = hss;
    }

    public String getBuckling() {
        return buckling;
    }

    public void setBuckling(String buckling) {
        this.buckling = buckling;
    }

    public String getAbduction() {
        return abduction;
    }

    public void setAbduction(String abduction) {
        this.abduction = abduction;
    }

    public String getAdduction() {
        return adduction;
    }

    public void setAdduction(String adduction) {
        this.adduction = adduction;
    }
}
