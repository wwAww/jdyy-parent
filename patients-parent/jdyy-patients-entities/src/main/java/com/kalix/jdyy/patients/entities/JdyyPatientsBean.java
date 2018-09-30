package com.kalix.jdyy.patients.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "jdyy_patients")
public class JdyyPatientsBean extends PersistentEntity {
    private String name;
    private String sex;
    private String brith;
    private Integer age;
    private Integer idcard;
    private String bedNumber;
    private Integer hospitalNumber;
    private String directorDoctor;
    private String dateAdmission;
    private String dateAischarge;
    private Integer stature;
    private Integer weight;
    private Integer bmi;
    private Integer bloodPressure;
    private String specialDisorders;
    private String descriptionSpecialdisease;
    private Integer allergicHistory;
    private String type_medicalTreatment;
    private Integer WhetherDischarge;
    private Integer telephonePerson;
    private Integer familyPhone;
    private String province;
    private String city;
    private String district;
    private String completeAddress;
    private String remarks;
    private Integer harris;
    private Integer hss;
    private String diagnosis;
    private String Surgical;
    private String dateOperation;
    private String periodization;

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

    public Integer getIdcard() {
        return idcard;
    }

    public void setIdcard(Integer idcard) {
        this.idcard = idcard;
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

    public String getDateAischarge() {
        return dateAischarge;
    }

    public void setDateAischarge(String dateAischarge) {
        this.dateAischarge = dateAischarge;
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

    public String getDescriptionSpecialdisease() {
        return descriptionSpecialdisease;
    }

    public void setDescriptionSpecialdisease(String descriptionSpecialdisease) {
        this.descriptionSpecialdisease = descriptionSpecialdisease;
    }

    public Integer getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(Integer allergicHistory) {
        this.allergicHistory = allergicHistory;
    }

    public String getType_medicalTreatment() {
        return type_medicalTreatment;
    }

    public void setType_medicalTreatment(String type_medicalTreatment) {
        this.type_medicalTreatment = type_medicalTreatment;
    }

    public Integer getWhetherDischarge() {
        return WhetherDischarge;
    }

    public void setWhetherDischarge(Integer whetherDischarge) {
        WhetherDischarge = whetherDischarge;
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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
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

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getSurgical() {
        return Surgical;
    }

    public void setSurgical(String surgical) {
        Surgical = surgical;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public String getPeriodization() {
        return periodization;
    }

    public void setPeriodization(String periodization) {
        this.periodization = periodization;
    }
}
