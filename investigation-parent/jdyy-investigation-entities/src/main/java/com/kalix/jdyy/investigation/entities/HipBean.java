package com.kalix.jdyy.investigation.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jiangbiao
 * @create 2018-10-16 上午 11:22
 * @desc 全髋关节调查实体类
 **/

@Entity
@Table(name = "jdyy_hip")
public class HipBean extends PersistentEntity {
    private Integer patientsId;// 病员ID
    private String hospitalNumber;// 研究序号
    private String date;// 日期
    private String position;// 部位
    private String disease;// 诊断
    private String operationType;// 手术类型
    private String prosthesis;// 假体
    private String doctor;// 医生
    // 术前及围手术期手术资料
    // 主要诊断
    private String arthritis;// 关节炎
    private String osteonecrosis;// 骨坏死
    private String pathogeny;// 常见病因
    private String other1;// 其他
    // 翻修指征
    private String loosening;// 松动
    private String abrasion;// 聚乙烯磨损
    private String infected1;// 深部感染
    private String other2;// 其他
    // 术前髋关节情况/治疗
    private String fracture;// 骨折
    private String infected2;// 感染
    private String substitution;// 置换
    private String other3;// 其他
    // 其他关节
//    private String contralateral;// 对侧髋关节
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号
//    private String hospitalNumber;// 研究序号

}
