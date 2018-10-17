package com.kalix.jdyy.investigation.entities;

import com.kalix.framework.core.api.persistence.PersistentEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author
 * @create
 * @desc 全膝关节调查实体类
 **/
@Entity
@Table(name = "jdyy_knee")
public class KneeBean extends PersistentEntity {
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
    private String disease2;// 诊断结果
    // 翻修指征
    private String position2;// 部位
    private String mode;// 方式
    // 术前膝关节情况/治疗
    private String fracture;// 骨折
    private String infected;// 感染
    private String arthroscope;// 关节镜
    private String osteotomy;// 截骨
    private String substitution;// 置换
    private String other1;// 其他
    private String other2;// 其他
    // 其他关节
    private String contralateral;// 对侧膝关节
    private String other3;// 其他
    // 病人分类
    private String classification;// 分类
    // 术前膝关节功能评分
    private String pain;// 疼痛
        // 术前活动度
    private String unwind;// 伸直
    private String overextension;
    private String buckling;// 屈曲
        // 稳定性
    private String apPosition;// 前后位
    private String lateralPosition;// 侧位
    private String hyperextension;// 过伸
    private String fixedFlexionContracture;// 固定屈曲挛缩(FFC)
    private String forceLine;// 力线
    // 术前膝关节协会功能评估
    private String hoof;// 行走
    private String stairActivity;// 上下楼梯
    private String walkingAid;// 行走辅助
    // 其他信息
    private String height;// 身高
    private String muscle;// 股四头肌肌力
    private String weight;// 体重
    private String machine;// 机械轴（前后位X线片）
    private String angle11;
    private String around;
    // 手术
    private String date2;// 日期
    private String doctor2;// 手术医生
    // 电动驱血带
    private String firstInflation;// 第一次充气
    private String deFlation;// 放气
    private String secondInflation;// 第二次充气
    // 入路
    private String approach;// 入路
    private String other4;// 其他
    // 松解
    private String inside;// 内侧
    private String rear;// 后方
    private String outBoard;// 外侧
    private String retinaculum;// 外侧支持带
    // 软组织
    private String fatPad;// 脂肪垫
    private String synovectomy;// 滑膜切除
    private String ligament;// 髌韧带
    // 翻修手术
    private String femur;// 股骨
    private String tibia;// 胫骨
    private String patella;// 髌骨
    private String renewal;// 更换组件
    // 假体
    private String name2;// 名称
    private String genre;// 类型
    // 股骨部分
    // 组件
    private String genre2;// 型号
    private String genre3;// 水泥型
    private String spin;// 旋转
    private String angle;
    private String thighbone;// 股骨前方截骨
    private String longHandle;// 长柄
    private String longness;// 长度
    private String diameter;// 直径
    private String guider;// 髓内导向器
    // 胫骨部分
    // 金属底托
    private String genre4;// 型号
    private String genre5;// 水泥型
    private String spin2;// 旋转
    private String angle2;
    private String lateralPosition1;// 侧位
    private String normotopia;// 正位
        // 植入
    private String dimension;// 尺寸
    private String thickness;// 厚度
    private String longHandle2;// 长柄
    private String longness2;// 长度
    private String diameter2;// 直径
    // 髌骨假体
    //尺寸
    private String cement;// 水泥
    private String thickness2;// 总厚度
    private String location;// 位置
    // 股骨侧缺陷
    private String vitium;
    private String location2;// 位置
    private String location3;
        // 区域
    private String length;
    private String wide;
    private String depth;
    // 胫骨侧缺陷
    private String vitium2;//
    private String location4;// 位置
    private String location5;
        // 区域
    private String length2;
    private String wide2;
    private String depth2;
    private String processingScheme;
    // 术中所见
    private String patellaTrajectory;// 髌骨轨迹
    private String completelyStraight;// 完全伸直
    private String overextension2;
    private String allBends;// 全屈
    private String forceLine2;
    private String reversal;
    private String exist;// 内侧松弛
    private String angle3;
    private String angle4;
    private String exist1;// 外侧松弛
    private String angle5;
    private String angle6;
    // 术后
    private String drainage;// 总引流
        // 屈曲达到90°
    private String postoperationDay;// 术后
        // 术后两周活动度
    private String unwind2;// 伸直
    private String buckling2;// 屈曲
    private String debonding;
    private String woundHealing;// 切口愈合
        // 用单手杖行走
    private String postoperationDay2;// 术后
        // 独立行走
    private String postoperationDay3;// 术后
    // 膝关节功能评分
    private String date3;// 日期
    private String postoperationMonth;// 术后第（）个月
    private String pain2;// 疼痛
    private String activity;// 活动度
    private String stability;// 稳定性
    private String fixedFlexionContracture2;// 固定屈曲挛缩（FFC）
    private String extensionRelaxation;// 伸直位松弛
    private String forceLine3;// 力线
    private String total3;// 总计
    // 置换术后的特殊问题
    private String date4;// 日期
    private String postoperationMonth2;// 术后第（）个月
    private String satisfaction;// 患者满意度
    private String gait;// 步态
    private String problem;// 髌骨侧问题
    private String muscleStrength;// 股四头肌肌力
    private String fixedFlexionContracture3;// 固定屈曲挛缩（FFC）
    private String hyperextension2;// 过伸
    private String lateralSlack;// 侧方松弛
    private String frontBackSlack;// 前后松弛
    private String backSlack;// 后方松弛
    // 膝关节协会功能评估
    private String date5;// 日期
    private String postoperationMonth3;// 术后第（）个月
    private String walk1;// 步行
    private String stairActivity1;// 上下楼梯
    private String walkingAid1;// 辅助行走
    private String total5;// 总计
    // 影像学评估
    // 下肢全长片
    private String date6;// 日期
    private String postoperationWeek;// 术后第
        // 机械轴
    private String mechanicalAxis;
        // 解剖轴
    private String dissectionAxis;
        // 前后位股骨假体角度
    private String angle7;
        // 前后位胫骨假体角度
    private String angle8;
        // 侧位股骨假体角度
    private String angle9;
        // 侧位胫骨假体角度
    private String angle10;
        // 踝关节横截线
    private String ankle;
        // 胫骨覆盖率
    private String tibiaFraction;
    //
    private String date7;// 日期
    private String postoperationMonth4;// 术后第（）月
    private String thighboneSide;// 股骨骨水泥透亮区-侧位
    private String tibiaFab;// 胫骨骨水泥透亮区-前后位
    private String tibiaSide;// 胫骨骨水泥透亮区-侧位
    private String thighboneCut;// 髌骨骨水泥透亮区-切位
    private String thighboneSubluxation;// 髌骨半脱位
    private String boneGraft;// 植骨吸收
    private String loose;// 松动（股骨/胫骨/髌骨）
    private String polyethyleneLiner;// 聚乙烯内衬
    private String osteolysis;// 骨溶解

    public Integer getPatientsId() {
        return patientsId;
    }

    public void setPatientsId(Integer patientsId) {
        this.patientsId = patientsId;
    }

    public String getHospitalNumber() {
        return hospitalNumber;
    }

    public void setHospitalNumber(String hospitalNumber) {
        this.hospitalNumber = hospitalNumber;
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

    public String getDisease2() {
        return disease2;
    }

    public void setDisease2(String disease2) {
        this.disease2 = disease2;
    }

    public String getPosition2() {
        return position2;
    }

    public void setPosition2(String position2) {
        this.position2 = position2;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getFracture() {
        return fracture;
    }

    public void setFracture(String fracture) {
        this.fracture = fracture;
    }

    public String getInfected() {
        return infected;
    }

    public void setInfected(String infected) {
        this.infected = infected;
    }

    public String getArthroscope() {
        return arthroscope;
    }

    public void setArthroscope(String arthroscope) {
        this.arthroscope = arthroscope;
    }

    public String getOsteotomy() {
        return osteotomy;
    }

    public void setOsteotomy(String osteotomy) {
        this.osteotomy = osteotomy;
    }

    public String getSubstitution() {
        return substitution;
    }

    public void setSubstitution(String substitution) {
        this.substitution = substitution;
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1;
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2;
    }

    public String getContralateral() {
        return contralateral;
    }

    public void setContralateral(String contralateral) {
        this.contralateral = contralateral;
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getPain() {
        return pain;
    }

    public void setPain(String pain) {
        this.pain = pain;
    }

    public String getUnwind() {
        return unwind;
    }

    public void setUnwind(String unwind) {
        this.unwind = unwind;
    }

    public String getOverextension() {
        return overextension;
    }

    public void setOverextension(String overextension) {
        this.overextension = overextension;
    }

    public String getBuckling() {
        return buckling;
    }

    public void setBuckling(String buckling) {
        this.buckling = buckling;
    }

    public String getApPosition() {
        return apPosition;
    }

    public void setApPosition(String apPosition) {
        this.apPosition = apPosition;
    }

    public String getLateralPosition() {
        return lateralPosition;
    }

    public void setLateralPosition(String lateralPosition) {
        this.lateralPosition = lateralPosition;
    }

    public String getHyperextension() {
        return hyperextension;
    }

    public void setHyperextension(String hyperextension) {
        this.hyperextension = hyperextension;
    }

    public String getFixedFlexionContracture() {
        return fixedFlexionContracture;
    }

    public void setFixedFlexionContracture(String fixedFlexionContracture) {
        this.fixedFlexionContracture = fixedFlexionContracture;
    }

    public String getForceLine() {
        return forceLine;
    }

    public void setForceLine(String forceLine) {
        this.forceLine = forceLine;
    }

    public String getHoof() {
        return hoof;
    }

    public void setHoof(String hoof) {
        this.hoof = hoof;
    }

    public String getStairActivity() {
        return stairActivity;
    }

    public void setStairActivity(String stairActivity) {
        this.stairActivity = stairActivity;
    }

    public String getWalkingAid() {
        return walkingAid;
    }

    public void setWalkingAid(String walkingAid) {
        this.walkingAid = walkingAid;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getMuscle() {
        return muscle;
    }

    public void setMuscle(String muscle) {
        this.muscle = muscle;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getAngle11() {
        return angle11;
    }

    public void setAngle11(String angle11) {
        this.angle11 = angle11;
    }

    public String getAround() {
        return around;
    }

    public void setAround(String around) {
        this.around = around;
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

    public String getFirstInflation() {
        return firstInflation;
    }

    public void setFirstInflation(String firstInflation) {
        this.firstInflation = firstInflation;
    }

    public String getDeFlation() {
        return deFlation;
    }

    public void setDeFlation(String deFlation) {
        this.deFlation = deFlation;
    }

    public String getSecondInflation() {
        return secondInflation;
    }

    public void setSecondInflation(String secondInflation) {
        this.secondInflation = secondInflation;
    }

    public String getApproach() {
        return approach;
    }

    public void setApproach(String approach) {
        this.approach = approach;
    }

    public String getOther4() {
        return other4;
    }

    public void setOther4(String other4) {
        this.other4 = other4;
    }

    public String getInside() {
        return inside;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }

    public String getRear() {
        return rear;
    }

    public void setRear(String rear) {
        this.rear = rear;
    }

    public String getOutBoard() {
        return outBoard;
    }

    public void setOutBoard(String outBoard) {
        this.outBoard = outBoard;
    }

    public String getRetinaculum() {
        return retinaculum;
    }

    public void setRetinaculum(String retinaculum) {
        this.retinaculum = retinaculum;
    }

    public String getFatPad() {
        return fatPad;
    }

    public void setFatPad(String fatPad) {
        this.fatPad = fatPad;
    }

    public String getSynovectomy() {
        return synovectomy;
    }

    public void setSynovectomy(String synovectomy) {
        this.synovectomy = synovectomy;
    }

    public String getLigament() {
        return ligament;
    }

    public void setLigament(String ligament) {
        this.ligament = ligament;
    }

    public String getFemur() {
        return femur;
    }

    public void setFemur(String femur) {
        this.femur = femur;
    }

    public String getTibia() {
        return tibia;
    }

    public void setTibia(String tibia) {
        this.tibia = tibia;
    }

    public String getPatella() {
        return patella;
    }

    public void setPatella(String patella) {
        this.patella = patella;
    }

    public String getRenewal() {
        return renewal;
    }

    public void setRenewal(String renewal) {
        this.renewal = renewal;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre2() {
        return genre2;
    }

    public void setGenre2(String genre2) {
        this.genre2 = genre2;
    }

    public String getGenre3() {
        return genre3;
    }

    public void setGenre3(String genre3) {
        this.genre3 = genre3;
    }

    public String getSpin() {
        return spin;
    }

    public void setSpin(String spin) {
        this.spin = spin;
    }

    public String getAngle() {
        return angle;
    }

    public void setAngle(String angle) {
        this.angle = angle;
    }

    public String getThighbone() {
        return thighbone;
    }

    public void setThighbone(String thighbone) {
        this.thighbone = thighbone;
    }

    public String getLongHandle() {
        return longHandle;
    }

    public void setLongHandle(String longHandle) {
        this.longHandle = longHandle;
    }

    public String getLongness() {
        return longness;
    }

    public void setLongness(String longness) {
        this.longness = longness;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getGuider() {
        return guider;
    }

    public void setGuider(String guider) {
        this.guider = guider;
    }

    public String getGenre4() {
        return genre4;
    }

    public void setGenre4(String genre4) {
        this.genre4 = genre4;
    }

    public String getGenre5() {
        return genre5;
    }

    public void setGenre5(String genre5) {
        this.genre5 = genre5;
    }

    public String getSpin2() {
        return spin2;
    }

    public void setSpin2(String spin2) {
        this.spin2 = spin2;
    }

    public String getAngle2() {
        return angle2;
    }

    public void setAngle2(String angle2) {
        this.angle2 = angle2;
    }

    public String getLateralPosition1() {
        return lateralPosition1;
    }

    public void setLateralPosition1(String lateralPosition1) {
        this.lateralPosition1 = lateralPosition1;
    }

    public String getNormotopia() {
        return normotopia;
    }

    public void setNormotopia(String normotopia) {
        this.normotopia = normotopia;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getThickness() {
        return thickness;
    }

    public void setThickness(String thickness) {
        this.thickness = thickness;
    }

    public String getLongHandle2() {
        return longHandle2;
    }

    public void setLongHandle2(String longHandle2) {
        this.longHandle2 = longHandle2;
    }

    public String getLongness2() {
        return longness2;
    }

    public void setLongness2(String longness2) {
        this.longness2 = longness2;
    }

    public String getDiameter2() {
        return diameter2;
    }

    public void setDiameter2(String diameter2) {
        this.diameter2 = diameter2;
    }

    public String getCement() {
        return cement;
    }

    public void setCement(String cement) {
        this.cement = cement;
    }

    public String getThickness2() {
        return thickness2;
    }

    public void setThickness2(String thickness2) {
        this.thickness2 = thickness2;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getVitium() {
        return vitium;
    }

    public void setVitium(String vitium) {
        this.vitium = vitium;
    }

    public String getLocation2() {
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    public String getLocation3() {
        return location3;
    }

    public void setLocation3(String location3) {
        this.location3 = location3;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getVitium2() {
        return vitium2;
    }

    public void setVitium2(String vitium2) {
        this.vitium2 = vitium2;
    }

    public String getLocation4() {
        return location4;
    }

    public void setLocation4(String location4) {
        this.location4 = location4;
    }

    public String getLocation5() {
        return location5;
    }

    public void setLocation5(String location5) {
        this.location5 = location5;
    }

    public String getLength2() {
        return length2;
    }

    public void setLength2(String length2) {
        this.length2 = length2;
    }

    public String getWide2() {
        return wide2;
    }

    public void setWide2(String wide2) {
        this.wide2 = wide2;
    }

    public String getDepth2() {
        return depth2;
    }

    public void setDepth2(String depth2) {
        this.depth2 = depth2;
    }


    public String getProcessingScheme() {
        return processingScheme;
    }

    public void setProcessingScheme(String processingScheme) {
        this.processingScheme = processingScheme;
    }

    public String getPatellaTrajectory() {
        return patellaTrajectory;
    }

    public void setPatellaTrajectory(String patellaTrajectory) {
        this.patellaTrajectory = patellaTrajectory;
    }

    public String getCompletelyStraight() {
        return completelyStraight;
    }

    public void setCompletelyStraight(String completelyStraight) {
        this.completelyStraight = completelyStraight;
    }

    public String getOverextension2() {
        return overextension2;
    }

    public void setOverextension2(String overextension2) {
        this.overextension2 = overextension2;
    }

    public String getAllBends() {
        return allBends;
    }

    public void setAllBends(String allBends) {
        this.allBends = allBends;
    }

    public String getForceLine2() {
        return forceLine2;
    }

    public void setForceLine2(String forceLine2) {
        this.forceLine2 = forceLine2;
    }

    public String getReversal() {
        return reversal;
    }

    public void setReversal(String reversal) {
        this.reversal = reversal;
    }

    public String getExist() {
        return exist;
    }

    public void setExist(String exist) {
        this.exist = exist;
    }

    public String getAngle3() {
        return angle3;
    }

    public void setAngle3(String angle3) {
        this.angle3 = angle3;
    }

    public String getAngle4() {
        return angle4;
    }

    public void setAngle4(String angle4) {
        this.angle4 = angle4;
    }

    public String getExist1() {
        return exist1;
    }

    public void setExist1(String exist1) {
        this.exist1 = exist1;
    }

    public String getAngle5() {
        return angle5;
    }

    public void setAngle5(String angle5) {
        this.angle5 = angle5;
    }

    public String getAngle6() {
        return angle6;
    }

    public void setAngle6(String angle6) {
        this.angle6 = angle6;
    }

    public String getDrainage() {
        return drainage;
    }

    public void setDrainage(String drainage) {
        this.drainage = drainage;
    }

    public String getPostoperationDay() {
        return postoperationDay;
    }

    public void setPostoperationDay(String postoperationDay) {
        this.postoperationDay = postoperationDay;
    }

    public String getUnwind2() {
        return unwind2;
    }

    public void setUnwind2(String unwind2) {
        this.unwind2 = unwind2;
    }

    public String getBuckling2() {
        return buckling2;
    }

    public void setBuckling2(String buckling2) {
        this.buckling2 = buckling2;
    }

    public String getDebonding() {
        return debonding;
    }

    public void setDebonding(String debonding) {
        this.debonding = debonding;
    }

    public String getWoundHealing() {
        return woundHealing;
    }

    public void setWoundHealing(String woundHealing) {
        this.woundHealing = woundHealing;
    }

    public String getPostoperationDay2() {
        return postoperationDay2;
    }

    public void setPostoperationDay2(String postoperationDay2) {
        this.postoperationDay2 = postoperationDay2;
    }

    public String getPostoperationDay3() {
        return postoperationDay3;
    }

    public void setPostoperationDay3(String postoperationDay3) {
        this.postoperationDay3 = postoperationDay3;
    }

    public String getDate3() {
        return date3;
    }

    public void setDate3(String date3) {
        this.date3 = date3;
    }

    public String getPostoperationMonth() {
        return postoperationMonth;
    }

    public void setPostoperationMonth(String postoperationMonth) {
        this.postoperationMonth = postoperationMonth;
    }

    public String getPain2() {
        return pain2;
    }

    public void setPain2(String pain2) {
        this.pain2 = pain2;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getStability() {
        return stability;
    }

    public void setStability(String stability) {
        this.stability = stability;
    }

    public String getFixedFlexionContracture2() {
        return fixedFlexionContracture2;
    }

    public void setFixedFlexionContracture2(String fixedFlexionContracture2) {
        this.fixedFlexionContracture2 = fixedFlexionContracture2;
    }

    public String getExtensionRelaxation() {
        return extensionRelaxation;
    }

    public void setExtensionRelaxation(String extensionRelaxation) {
        this.extensionRelaxation = extensionRelaxation;
    }

    public String getForceLine3() {
        return forceLine3;
    }

    public void setForceLine3(String forceLine3) {
        this.forceLine3 = forceLine3;
    }

    public String getTotal3() {
        return total3;
    }

    public void setTotal3(String total3) {
        this.total3 = total3;
    }

    public String getDate4() {
        return date4;
    }

    public void setDate4(String date4) {
        this.date4 = date4;
    }

    public String getPostoperationMonth2() {
        return postoperationMonth2;
    }

    public void setPostoperationMonth2(String postoperationMonth2) {
        this.postoperationMonth2 = postoperationMonth2;
    }

    public String getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(String satisfaction) {
        this.satisfaction = satisfaction;
    }

    public String getGait() {
        return gait;
    }

    public void setGait(String gait) {
        this.gait = gait;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getMuscleStrength() {
        return muscleStrength;
    }

    public void setMuscleStrength(String muscleStrength) {
        this.muscleStrength = muscleStrength;
    }

    public String getFixedFlexionContracture3() {
        return fixedFlexionContracture3;
    }

    public void setFixedFlexionContracture3(String fixedFlexionContracture3) {
        this.fixedFlexionContracture3 = fixedFlexionContracture3;
    }

    public String getHyperextension2() {
        return hyperextension2;
    }

    public void setHyperextension2(String hyperextension2) {
        this.hyperextension2 = hyperextension2;
    }

    public String getLateralSlack() {
        return lateralSlack;
    }

    public void setLateralSlack(String lateralSlack) {
        this.lateralSlack = lateralSlack;
    }

    public String getFrontBackSlack() {
        return frontBackSlack;
    }

    public void setFrontBackSlack(String frontBackSlack) {
        this.frontBackSlack = frontBackSlack;
    }

    public String getBackSlack() {
        return backSlack;
    }

    public void setBackSlack(String backSlack) {
        this.backSlack = backSlack;
    }

    public String getDate5() {
        return date5;
    }

    public void setDate5(String date5) {
        this.date5 = date5;
    }

    public String getPostoperationMonth3() {
        return postoperationMonth3;
    }

    public void setPostoperationMonth3(String postoperationMonth3) {
        this.postoperationMonth3 = postoperationMonth3;
    }

    public String getWalk1() {
        return walk1;
    }

    public void setWalk1(String walk1) {
        this.walk1 = walk1;
    }

    public String getStairActivity1() {
        return stairActivity1;
    }

    public void setStairActivity1(String stairActivity1) {
        this.stairActivity1 = stairActivity1;
    }

    public String getWalkingAid1() {
        return walkingAid1;
    }

    public void setWalkingAid1(String walkingAid1) {
        this.walkingAid1 = walkingAid1;
    }

    public String getTotal5() {
        return total5;
    }

    public void setTotal5(String total5) {
        this.total5 = total5;
    }

    public String getDate6() {
        return date6;
    }

    public void setDate6(String date6) {
        this.date6 = date6;
    }

    public String getPostoperationWeek() {
        return postoperationWeek;
    }

    public void setPostoperationWeek(String postoperationWeek) {
        this.postoperationWeek = postoperationWeek;
    }

    public String getMechanicalAxis() {
        return mechanicalAxis;
    }

    public void setMechanicalAxis(String mechanicalAxis) {
        this.mechanicalAxis = mechanicalAxis;
    }

    public String getDissectionAxis() {
        return dissectionAxis;
    }

    public void setDissectionAxis(String dissectionAxis) {
        this.dissectionAxis = dissectionAxis;
    }

    public String getAngle7() {
        return angle7;
    }

    public void setAngle7(String angle7) {
        this.angle7 = angle7;
    }

    public String getAngle8() {
        return angle8;
    }

    public void setAngle8(String angle8) {
        this.angle8 = angle8;
    }

    public String getAngle9() {
        return angle9;
    }

    public void setAngle9(String angle9) {
        this.angle9 = angle9;
    }

    public String getAngle10() {
        return angle10;
    }

    public void setAngle10(String angle10) {
        this.angle10 = angle10;
    }

    public String getAnkle() {
        return ankle;
    }

    public void setAnkle(String ankle) {
        this.ankle = ankle;
    }

    public String getTibiaFraction() {
        return tibiaFraction;
    }

    public void setTibiaFraction(String tibiaFraction) {
        this.tibiaFraction = tibiaFraction;
    }

    public String getDate7() {
        return date7;
    }

    public void setDate7(String date7) {
        this.date7 = date7;
    }

    public String getPostoperationMonth4() {
        return postoperationMonth4;
    }

    public void setPostoperationMonth4(String postoperationMonth4) {
        this.postoperationMonth4 = postoperationMonth4;
    }

    public String getThighboneSide() {
        return thighboneSide;
    }

    public void setThighboneSide(String thighboneSide) {
        this.thighboneSide = thighboneSide;
    }

    public String getTibiaFab() {
        return tibiaFab;
    }

    public void setTibiaFab(String tibiaFab) {
        this.tibiaFab = tibiaFab;
    }

    public String getTibiaSide() {
        return tibiaSide;
    }

    public void setTibiaSide(String tibiaSide) {
        this.tibiaSide = tibiaSide;
    }

    public String getThighboneCut() {
        return thighboneCut;
    }

    public void setThighboneCut(String thighboneCut) {
        this.thighboneCut = thighboneCut;
    }

    public String getThighboneSubluxation() {
        return thighboneSubluxation;
    }

    public void setThighboneSubluxation(String thighboneSubluxation) {
        this.thighboneSubluxation = thighboneSubluxation;
    }

    public String getBoneGraft() {
        return boneGraft;
    }

    public void setBoneGraft(String boneGraft) {
        this.boneGraft = boneGraft;
    }

    public String getLoose() {
        return loose;
    }

    public void setLoose(String loose) {
        this.loose = loose;
    }

    public String getPolyethyleneLiner() {
        return polyethyleneLiner;
    }

    public void setPolyethyleneLiner(String polyethyleneLiner) {
        this.polyethyleneLiner = polyethyleneLiner;
    }

    public String getOsteolysis() {
        return osteolysis;
    }

    public void setOsteolysis(String osteolysis) {
        this.osteolysis = osteolysis;
    }
}
