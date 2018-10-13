package com.kalix.jdyy.patients.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "jdyy_patients")
public class PatientsBean extends PersistentEntity {
    private String name;// 姓名
    private String sex;// 性别
    private String brith;// 出生日期
    private Integer age;// 年龄
    private Integer idCard;// 身份证号
    private String bedNumber;// 床位号
    private Integer hospitalNumber;// 住院号
    private String directorDoctor;// 主管医生
    private String dateAdmission;//入院日期
    private String dischargeDate;
    private Integer stature;
    private Integer weight;
    private Integer bmi;
    private Integer bloodPressure;
    private String specialDisorders;
    private String descriptionSpecialDisease;
    private Integer allergicHistory;
    private String typeMedicalTreatment;
    private Integer whetherDischarge;
    private Integer telephonePerson;
    private Integer familyPhone;
    private String address;
    private String completeAddress;
    private String remarks;
    private Integer harris;
    private Integer hss;
//    private String diagnosis;
//    private String surgical;
//    private String dateOperation;
//    private String periodization;
    private String buckling;
    private String abduction;
    private String adduction;
//    private String photo;

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

    public Integer getIdCard() {
        return idCard;
    }

    public void setIdCard(Integer idCard) {
        this.idCard = idCard;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
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

    public Integer getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(Integer allergicHistory) {
        this.allergicHistory = allergicHistory;
    }

    public String getTypeMedicalTreatment() {
        return typeMedicalTreatment;
    }

    public void setTypeMedicalTreatment(String typeMedicalTreatment) {
        this.typeMedicalTreatment = typeMedicalTreatment;
    }

    public Integer getWhetherDischarge() {
        return whetherDischarge;
    }

    public void setWhetherDischarge(Integer whetherDischarge) {
        this.whetherDischarge = whetherDischarge;
    }

    public Integer getTelephonePerson() {
        return telephonePerson;
    }

    public void setTelephonePerson(Integer telephonePerson) {
        this.telephonePerson = telephonePerson;
    }

    public Integer getFamilyPhone() {
        return familyPhone;
    }

    public void setFamilyPhone(Integer familyPhone) {
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
