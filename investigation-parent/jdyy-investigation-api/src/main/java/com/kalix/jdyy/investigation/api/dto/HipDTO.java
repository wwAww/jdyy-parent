package com.kalix.jdyy.investigation.api.dto;

public class HipDTO {
    private String name;
    private String sex;
    private String age;
    private String telephonePerson;
    private String address;
    private Integer hospitalNumber;
    private Integer patientsId;// 病员ID
    private Integer orderNumber;// 研究序号
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
    private String contralateral;// 对侧髋关节
    private String other4;// 其他
    // 其他信息
    private String height;// 身高
    private String other5;// 其他疾病
    private String weight;// 体重
    private String work;// 职业
    // 病人分类
    private String classification;// 分类
    // 手术
    private String date2;// 日期
    private String doctor2;// 手术医生
    // 体位&入路
    private String posture;// 体位
    private String approach;// 入路
    // 翻修手术术中所见
    private String scar;// 瘢痕
    private String acetabular;// 臼杯
    private String femoralhead;// 股骨头
    private String femoralstem;// 股骨柄
    private String osteolysis;// 骨溶解
    // 假体植入
    private String acetabular2;// 臼杯
    private String acetabularType;// 臼杯类型
    private String femoralstem2;// 股骨柄
    private String femoralstemType;// 股骨柄类型
    // 关节界面
    private String ballDiameter;// 球头直径
    private String material;// 材料
    private String diameterLength;// 颈长
    // 髋臼
    private String aModel;// 髋臼磨锉
    private String bModel;// 假体
    private String cModel;// 加减
    private String Inclusiveness;// 包容
    private String stable1;// 稳定性
    // 摆放角度
    private String ectropion;// 外翻
    private String forward;// 前倾
    private String inAngle;// 聚乙烯衬垫植入角度
    private String inclock;// 防脱缘 在
    // 股骨
    private String medullaryCavity;// 髓腔锉型号
    private String prosthesisType;// 假体型号
    private String prosthesisLength;// 假体长度
    private String cement;// 远端骨水泥塞
    private String stable2;// 稳定性
    private String binding;// 捆绑线
    private String forceLine;// 假体术中力线
    // 翻修手术
    private String windowOpen;// 皮质骨开窗
    private String Osteotomy;// 股骨端截骨
    private String Complication;// 并发症
    private String defect1;// 股骨缺陷
    // 髋臼缺陷
    private String centerType;// 中心型
    private String periphery;// 髋臼周边
    // 髋臼植骨
    private String structuralBone1;// 结构性植骨
    private String screw;// 螺钉固定
    private String suppress1;// 打压植骨
    // 股骨端植骨
    private String structuralBone2;// 结构性植骨
    private String suppress2;// 打压植骨
    // 术后稳定性
    // 后方稳定性
    private String frontA;// 屈曲
    private String frontB;// 内收
    private String frontC;// 内旋
    // 前方稳定性
    private String afterA;// 伸展
    private String afterB;// 外旋
    private String resection;// 内收肌肌腱切除
    private String resectionAbduction;// 外展
    private String resectionaAngle;// 增加角度
    // 术后期
    private String flow;// 术后总引流量
    private String singleAbduction;// 单拐行走
    private String singleDay;// 术后
    private String leaveHospital;// 出院
    // 出院时关节活动角度
    private String angleA;// 屈曲
    private String angleB;// 外展
    private String angleC;// 内旋
    private String angleD;// 过伸
    private String angleE;// 内收
    private String angleF;// 外旋
    // 术后影像学检查
    // 术后骨盆正位
    private String date3;// 术后第
    private String weekDay;// 周
    // 臼杯位置
    private String cupPosition;
    // 内壁
    private String wall;
    // 臼杯外翻
    private String ectropion2;
    // 假体柄力线
    private String forceLine2;
    // 水泥接合
    private String joint;
    // 术后并发症
    // 骨科部分
    private String orthopedics;
    // 综合部分
    private String comprehensive;
    // 临床评价——Harris评分
    private String harADate;// 日期
    private String harA1;// 术后第（）月
    private String harA2;// 疼痛
    private String harA3;// 上下楼梯
    private String harA4;// 坐
    private String harA5;// 穿鞋袜
    private String harA6;// 上公交车
    private String harA7;// 跛行
    private String harA8;// 行走辅助
    private String harA9;// 行走距离
    private String harA10;// 无畸形
    private String harA11;// 关节活动度
    private String harA12;// 总分（100）
    private String harBDate;// 大腿痛
    private String harB1;// Trendelenburg 征
    private String harB2;// 活动度-伸直
    private String harB3;// 活动度-屈曲
    private String harB4;// 活动度-外展
    private String harB5;// 活动度-内收
    private String harB6;// 活动度-内旋
    private String harB7;// 活动度-外旋
    private String harB8;// 双下肢不等长
    // 患者满意度
    private String harCDate;// 日期
    private String harC1;// 与术前相比
    private String harC2;// 术后第（）月
    private String harC3;// 疼痛
    private String harC4;// 功能
    private String harC5;// 总评
    // 影像学评估
    private String harDDate;// 日期
    private String harD1;// 术后第（）月
    private String harD2;// 移位
    private String harD3;// 聚乙烯磨损
    private String harD4;// 骨水泥透亮区-1 *
    private String harD5;// 骨水泥透亮区-2 *
    private String harD6;// 骨溶解
    private String harD7;// 增生*
    private String harD8;// 萎缩 *
    private String harD9;// 异位骨化
    private String harD10;// 金属问题
    private String harD11;// 骨水泥金属界面透亮区
    private String harD12;// 骨水泥骨折（） *
    private String harD13;// 涂层脱落*

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

    public String getTelephonePerson() {
        return telephonePerson;
    }

    public void setTelephonePerson(String telephonePerson) {
        this.telephonePerson = telephonePerson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(Integer hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
    }

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getProsthesis() {
        return prosthesis;
    }

    public void setProsthesis(String prosthesis) {
        this.prosthesis = prosthesis;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getArthritis() {
        return arthritis;
    }

    public void setArthritis(String arthritis) {
        this.arthritis = arthritis;
    }

    public String getOsteonecrosis() {
        return osteonecrosis;
    }

    public void setOsteonecrosis(String osteonecrosis) {
        this.osteonecrosis = osteonecrosis;
    }

    public String getPathogeny() {
        return pathogeny;
    }

    public void setPathogeny(String pathogeny) {
        this.pathogeny = pathogeny;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getLoosening() {
        return loosening;
    }

    public void setLoosening(String loosening) {
        this.loosening = loosening;
    }

    public String getAbrasion() {
        return abrasion;
    }

    public void setAbrasion(String abrasion) {
        this.abrasion = abrasion;
    }

    public String getInfected1() {
        return infected1;
    }

    public void setInfected1(String infected1) {
        this.infected1 = infected1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getFracture() {
        return fracture;
    }

    public void setFracture(String fracture) {
        this.fracture = fracture;
    }

    public String getInfected2() {
        return infected2;
    }

    public void setInfected2(String infected2) {
        this.infected2 = infected2;
    }

    public String getSubstitution() {
        return substitution;
    }

    public void setSubstitution(String substitution) {
        this.substitution = substitution;
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3;
    }

    public String getContralateral() {
        return contralateral;
    }

    public void setContralateral(String contralateral) {
        this.contralateral = contralateral;
    }

    public String getOther4() {
        return other4;
    }

    public void setOther4(String other4) {
        this.other4 = other4;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getOther5() {
        return other5;
    }

    public void setOther5(String other5) {
        this.other5 = other5;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDate2() {
        return date2;
    }

    public void setDate2(String date2) {
        this.date2 = date2;
    }

    public String getDoctor2() {
        return doctor2;
    }

    public void setDoctor2(String doctor2) {
        this.doctor2 = doctor2;
    }

    public String getPosture() {
        return posture;
    }

    public void setPosture(String posture) {
        this.posture = posture;
    }

    public String getApproach() {
        return approach;
    }

    public void setApproach(String approach) {
        this.approach = approach;
    }

    public String getScar() {
        return scar;
    }

    public void setScar(String scar) {
        this.scar = scar;
    }

    public String getAcetabular() {
        return acetabular;
    }

    public void setAcetabular(String acetabular) {
        this.acetabular = acetabular;
    }

    public String getFemoralhead() {
        return femoralhead;
    }

    public void setFemoralhead(String femoralhead) {
        this.femoralhead = femoralhead;
    }

    public String getFemoralstem() {
        return femoralstem;
    }

    public void setFemoralstem(String femoralstem) {
        this.femoralstem = femoralstem;
    }

    public String getOsteolysis() {
        return osteolysis;
    }

    public void setOsteolysis(String osteolysis) {
        this.osteolysis = osteolysis;
    }

    public String getAcetabular2() {
        return acetabular2;
    }

    public void setAcetabular2(String acetabular2) {
        this.acetabular2 = acetabular2;
    }

    public String getAcetabularType() {
        return acetabularType;
    }

    public void setAcetabularType(String acetabularType) {
        this.acetabularType = acetabularType;
    }

    public String getFemoralstem2() {
        return femoralstem2;
    }

    public void setFemoralstem2(String femoralstem2) {
        this.femoralstem2 = femoralstem2;
    }

    public String getFemoralstemType() {
        return femoralstemType;
    }

    public void setFemoralstemType(String femoralstemType) {
        this.femoralstemType = femoralstemType;
    }

    public String getBallDiameter() {
        return ballDiameter;
    }

    public void setBallDiameter(String ballDiameter) {
        this.ballDiameter = ballDiameter;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDiameterLength() {
        return diameterLength;
    }

    public void setDiameterLength(String diameterLength) {
        this.diameterLength = diameterLength;
    }

    public String getaModel() {
        return aModel;
    }

    public void setaModel(String aModel) {
        this.aModel = aModel;
    }

    public String getbModel() {
        return bModel;
    }

    public void setbModel(String bModel) {
        this.bModel = bModel;
    }

    public String getcModel() {
        return cModel;
    }

    public void setcModel(String cModel) {
        this.cModel = cModel;
    }

    public String getInclusiveness() {
        return Inclusiveness;
    }

    public void setInclusiveness(String inclusiveness) {
        Inclusiveness = inclusiveness;
    }

    public String getStable1() {
        return stable1;
    }

    public void setStable1(String stable1) {
        this.stable1 = stable1;
    }

    public String getEctropion() {
        return ectropion;
    }

    public void setEctropion(String ectropion) {
        this.ectropion = ectropion;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }

    public String getInAngle() {
        return inAngle;
    }

    public void setInAngle(String inAngle) {
        this.inAngle = inAngle;
    }

    public String getInclock() {
        return inclock;
    }

    public void setInclock(String inclock) {
        this.inclock = inclock;
    }

    public String getMedullaryCavity() {
        return medullaryCavity;
    }

    public void setMedullaryCavity(String medullaryCavity) {
        this.medullaryCavity = medullaryCavity;
    }

    public String getProsthesisType() {
        return prosthesisType;
    }

    public void setProsthesisType(String prosthesisType) {
        this.prosthesisType = prosthesisType;
    }

    public String getProsthesisLength() {
        return prosthesisLength;
    }

    public void setProsthesisLength(String prosthesisLength) {
        this.prosthesisLength = prosthesisLength;
    }

    public String getCement() {
        return cement;
    }

    public void setCement(String cement) {
        this.cement = cement;
    }

    public String getStable2() {
        return stable2;
    }

    public void setStable2(String stable2) {
        this.stable2 = stable2;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getForceLine() {
        return forceLine;
    }

    public void setForceLine(String forceLine) {
        this.forceLine = forceLine;
    }

    public String getWindowOpen() {
        return windowOpen;
    }

    public void setWindowOpen(String windowOpen) {
        this.windowOpen = windowOpen;
    }

    public String getOsteotomy() {
        return Osteotomy;
    }

    public void setOsteotomy(String osteotomy) {
        Osteotomy = osteotomy;
    }

    public String getComplication() {
        return Complication;
    }

    public void setComplication(String complication) {
        Complication = complication;
    }

    public String getDefect1() {
        return defect1;
    }

    public void setDefect1(String defect1) {
        this.defect1 = defect1;
    }

    public String getCenterType() {
        return centerType;
    }

    public void setCenterType(String centerType) {
        this.centerType = centerType;
    }

    public String getPeriphery() {
        return periphery;
    }

    public void setPeriphery(String periphery) {
        this.periphery = periphery;
    }

    public String getStructuralBone1() {
        return structuralBone1;
    }

    public void setStructuralBone1(String structuralBone1) {
        this.structuralBone1 = structuralBone1;
    }

    public String getScrew() {
        return screw;
    }

    public void setScrew(String screw) {
        this.screw = screw;
    }

    public String getSuppress1() {
        return suppress1;
    }

    public void setSuppress1(String suppress1) {
        this.suppress1 = suppress1;
    }

    public String getStructuralBone2() {
        return structuralBone2;
    }

    public void setStructuralBone2(String structuralBone2) {
        this.structuralBone2 = structuralBone2;
    }

    public String getSuppress2() {
        return suppress2;
    }

    public void setSuppress2(String suppress2) {
        this.suppress2 = suppress2;
    }

    public String getFrontA() {
        return frontA;
    }

    public void setFrontA(String frontA) {
        this.frontA = frontA;
    }

    public String getFrontB() {
        return frontB;
    }

    public void setFrontB(String frontB) {
        this.frontB = frontB;
    }

    public String getFrontC() {
        return frontC;
    }

    public void setFrontC(String frontC) {
        this.frontC = frontC;
    }

    public String getAfterA() {
        return afterA;
    }

    public void setAfterA(String afterA) {
        this.afterA = afterA;
    }

    public String getAfterB() {
        return afterB;
    }

    public void setAfterB(String afterB) {
        this.afterB = afterB;
    }

    public String getResection() {
        return resection;
    }

    public void setResection(String resection) {
        this.resection = resection;
    }

    public String getResectionAbduction() {
        return resectionAbduction;
    }

    public void setResectionAbduction(String resectionAbduction) {
        this.resectionAbduction = resectionAbduction;
    }

    public String getResectionaAngle() {
        return resectionaAngle;
    }

    public void setResectionaAngle(String resectionaAngle) {
        this.resectionaAngle = resectionaAngle;
    }

    public String getFlow() {
        return flow;
    }

    public void setFlow(String flow) {
        this.flow = flow;
    }

    public String getSingleAbduction() {
        return singleAbduction;
    }

    public void setSingleAbduction(String singleAbduction) {
        this.singleAbduction = singleAbduction;
    }

    public String getSingleDay() {
        return singleDay;
    }

    public void setSingleDay(String singleDay) {
        this.singleDay = singleDay;
    }

    public String getLeaveHospital() {
        return leaveHospital;
    }

    public void setLeaveHospital(String leaveHospital) {
        this.leaveHospital = leaveHospital;
    }

    public String getAngleA() {
        return angleA;
    }

    public void setAngleA(String angleA) {
        this.angleA = angleA;
    }

    public String getAngleB() {
        return angleB;
    }

    public void setAngleB(String angleB) {
        this.angleB = angleB;
    }

    public String getAngleC() {
        return angleC;
    }

    public void setAngleC(String angleC) {
        this.angleC = angleC;
    }

    public String getAngleD() {
        return angleD;
    }

    public void setAngleD(String angleD) {
        this.angleD = angleD;
    }

    public String getAngleE() {
        return angleE;
    }

    public void setAngleE(String angleE) {
        this.angleE = angleE;
    }

    public String getAngleF() {
        return angleF;
    }

    public void setAngleF(String angleF) {
        this.angleF = angleF;
    }

    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String getCupPosition() {
        return cupPosition;
    }

    public void setCupPosition(String cupPosition) {
        this.cupPosition = cupPosition;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getEctropion2() {
        return ectropion2;
    }

    public void setEctropion2(String ectropion2) {
        this.ectropion2 = ectropion2;
    }

    public String getForceLine2() {
        return forceLine2;
    }

    public void setForceLine2(String forceLine2) {
        this.forceLine2 = forceLine2;
    }

    public String getJoint() {
        return joint;
    }

    public void setJoint(String joint) {
        this.joint = joint;
    }

    public String getOrthopedics() {
        return orthopedics;
    }

    public void setOrthopedics(String orthopedics) {
        this.orthopedics = orthopedics;
    }

    public String getComprehensive() {
        return comprehensive;
    }

    public void setComprehensive(String comprehensive) {
        this.comprehensive = comprehensive;
    }

    public String getHarADate() {
        return harADate;
    }

    public void setHarADate(String harADate) {
        this.harADate = harADate;
    }

    public String getHarA1() {
        return harA1;
    }

    public void setHarA1(String harA1) {
        this.harA1 = harA1;
    }

    public String getHarA2() {
        return harA2;
    }

    public void setHarA2(String harA2) {
        this.harA2 = harA2;
    }

    public String getHarA3() {
        return harA3;
    }

    public void setHarA3(String harA3) {
        this.harA3 = harA3;
    }

    public String getHarA4() {
        return harA4;
    }

    public void setHarA4(String harA4) {
        this.harA4 = harA4;
    }

    public String getHarA5() {
        return harA5;
    }

    public void setHarA5(String harA5) {
        this.harA5 = harA5;
    }

    public String getHarA6() {
        return harA6;
    }

    public void setHarA6(String harA6) {
        this.harA6 = harA6;
    }

    public String getHarA7() {
        return harA7;
    }

    public void setHarA7(String harA7) {
        this.harA7 = harA7;
    }

    public String getHarA8() {
        return harA8;
    }

    public void setHarA8(String harA8) {
        this.harA8 = harA8;
    }

    public String getHarA9() {
        return harA9;
    }

    public void setHarA9(String harA9) {
        this.harA9 = harA9;
    }

    public String getHarA10() {
        return harA10;
    }

    public void setHarA10(String harA10) {
        this.harA10 = harA10;
    }

    public String getHarA11() {
        return harA11;
    }

    public void setHarA11(String harA11) {
        this.harA11 = harA11;
    }

    public String getHarA12() {
        return harA12;
    }

    public void setHarA12(String harA12) {
        this.harA12 = harA12;
    }

    public String getHarBDate() {
        return harBDate;
    }

    public void setHarBDate(String harBDate) {
        this.harBDate = harBDate;
    }

    public String getHarB1() {
        return harB1;
    }

    public void setHarB1(String harB1) {
        this.harB1 = harB1;
    }

    public String getHarB2() {
        return harB2;
    }

    public void setHarB2(String harB2) {
        this.harB2 = harB2;
    }

    public String getHarB3() {
        return harB3;
    }

    public void setHarB3(String harB3) {
        this.harB3 = harB3;
    }

    public String getHarB4() {
        return harB4;
    }

    public void setHarB4(String harB4) {
        this.harB4 = harB4;
    }

    public String getHarB5() {
        return harB5;
    }

    public void setHarB5(String harB5) {
        this.harB5 = harB5;
    }

    public String getHarB6() {
        return harB6;
    }

    public void setHarB6(String harB6) {
        this.harB6 = harB6;
    }

    public String getHarB7() {
        return harB7;
    }

    public void setHarB7(String harB7) {
        this.harB7 = harB7;
    }

    public String getHarB8() {
        return harB8;
    }

    public void setHarB8(String harB8) {
        this.harB8 = harB8;
    }

    public String getHarCDate() {
        return harCDate;
    }

    public void setHarCDate(String harCDate) {
        this.harCDate = harCDate;
    }

    public String getHarC1() {
        return harC1;
    }

    public void setHarC1(String harC1) {
        this.harC1 = harC1;
    }

    public String getHarC2() {
        return harC2;
    }

    public void setHarC2(String harC2) {
        this.harC2 = harC2;
    }

    public String getHarC3() {
        return harC3;
    }

    public void setHarC3(String harC3) {
        this.harC3 = harC3;
    }

    public String getHarC4() {
        return harC4;
    }

    public void setHarC4(String harC4) {
        this.harC4 = harC4;
    }

    public String getHarC5() {
        return harC5;
    }

    public void setHarC5(String harC5) {
        this.harC5 = harC5;
    }

    public String getHarDDate() {
        return harDDate;
    }

    public void setHarDDate(String harDDate) {
        this.harDDate = harDDate;
    }

    public String getHarD1() {
        return harD1;
    }

    public void setHarD1(String harD1) {
        this.harD1 = harD1;
    }

    public String getHarD2() {
        return harD2;
    }

    public void setHarD2(String harD2) {
        this.harD2 = harD2;
    }

    public String getHarD3() {
        return harD3;
    }

    public void setHarD3(String harD3) {
        this.harD3 = harD3;
    }

    public String getHarD4() {
        return harD4;
    }

    public void setHarD4(String harD4) {
        this.harD4 = harD4;
    }

    public String getHarD5() {
        return harD5;
    }

    public void setHarD5(String harD5) {
        this.harD5 = harD5;
    }

    public String getHarD6() {
        return harD6;
    }

    public void setHarD6(String harD6) {
        this.harD6 = harD6;
    }

    public String getHarD7() {
        return harD7;
    }

    public void setHarD7(String harD7) {
        this.harD7 = harD7;
    }

    public String getHarD8() {
        return harD8;
    }

    public void setHarD8(String harD8) {
        this.harD8 = harD8;
    }

    public String getHarD9() {
        return harD9;
    }

    public void setHarD9(String harD9) {
        this.harD9 = harD9;
    }

    public String getHarD10() {
        return harD10;
    }

    public void setHarD10(String harD10) {
        this.harD10 = harD10;
    }

    public String getHarD11() {
        return harD11;
    }

    public void setHarD11(String harD11) {
        this.harD11 = harD11;
    }

    public String getHarD12() {
        return harD12;
    }

    public void setHarD12(String harD12) {
        this.harD12 = harD12;
    }

    public String getHarD13() {
        return harD13;
    }

    public void setHarD13(String harD13) {
        this.harD13 = harD13;
    }
}
