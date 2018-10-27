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
    private String age;// 年龄
    private String brith;// 出生日期
    private String idCard;// 身份证号
    private String bedNumber;// 床位号
    private String medicalRecordNumber;// 病历号
    private String hospitalNumber;// 住院号
    private String medicalRecords;// 病历
    private String directorDoctor;// 主管医生
    private String dateAdmission;// 入院日期
    private String dischargeDate;// 出院日期
    private String stature;// 身高
    private String weight;// 体重
    private String bmi;// BMI
    private String bloodPressure;// 血压
    private String currentSituation; // 现况
    private String specialDisorders;// 特殊疾病
    private String descriptionSpecialDisease;// 特殊疾病描述
    private String allergicHistory;// 过敏史
    private String medicalCategory;// 医疗类别
    private String whetherDischarge;// 是否出院
    private String telephonePerson;// 本人联系方式
    private String familyPhone;// 家属联系方式
//    private String address;// 省市区
    private String completeAddress;// 通讯地址
    private String remarks;// 备注
    private String harris;// harris评分
    private String hss;// hss评分
    private String buckling;// 屈曲
    private String abduction;// 外展
    private String adduction;// 内收
    private String modifyStaff;// 修改人员
    private String heavyTime;// 重患时间

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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(String hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public String getMedicalRecords() {
        return medicalRecords;
    }

    public void setMedicalRecords(String medicalRecords) {
        this.medicalRecords = medicalRecords;
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

    public String getStature() {
        return stature;
    }

    public void setStature(String stature) {
        this.stature = stature;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getBmi() {
        return bmi;
    }

    public void setBmi(String bmi) {
        this.bmi = bmi;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getCurrentSituation() {
        return currentSituation;
    }

    public void setCurrentSituation(String currentSituation) {
        this.currentSituation = currentSituation;
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

    public String getHarris() {
        return harris;
    }

    public void setHarris(String harris) {
        this.harris = harris;
    }

    public String getHss() {
        return hss;
    }

    public void setHss(String hss) {
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

    public String getModifyStaff() {
        return modifyStaff;
    }

    public void setModifyStaff(String modifyStaff) {
        this.modifyStaff = modifyStaff;
    }

    public String getHeavyTime() {
        return heavyTime;
    }

    public void setHeavyTime(String heavyTime) {
        this.heavyTime = heavyTime;
    }
}
