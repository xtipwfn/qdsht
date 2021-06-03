package com.ryx.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 贷款申请VO
 */
public class Order implements Serializable {
    /**
     * 申请UUID SQ_UUID
     */
    private String sqUuid;

    /**
     * 公司税号 NSRSBH
     */
    private String nsrsbh;

    /**
     * 公司名称 GSMC
     */
    private String gsmc;

    /**
     * 法人姓名 FR_XM
     */
    private String frXm;

    /**
     * 法人手机号 FR_PHONE
     */
    private String frPhone;

    /**
     * 法人身份证件号 FR_SFZJHM
     */
    private String frSfzjhm;

    /**
     * 实际放款金额 SJFKJE
     */
    private Short sjfkje;

    /**
     * 产品UUID PROD_UUID
     */
    private String prodUuid;

    /**
     * 产品名称 PROD_NAME
     */
    private String prodName;

    /**
     * 推荐人UUID QDS_UUID
     */
    private String qdsUuid;

    /**
     * 推荐人名称 QDS_MC
     */
    private String qdsMc;

    /**
     * 申请状态 SQZT
     */
    private String sqzt;

    /**
     * 申请状态名称
     */
    private String sqztmc;

    /**
     * 申请日期 SQRQ
     */
    private Date sqrq;

    /**
     * 所属日期起
     */
    private String sqrqq;
    /**
     * 所属日期止
     */
    private String sqrqz;

    /**
     * 录入人员 LRRY
     */
    private String lrry;

    /**
     * 修改时间 XGSJ
     */
    private Date xgsj;

    /**
     * 修改人员 XGRY
     */
    private String xgry;

    /**
     * 微信OPENID OPENID
     */
    private String openid;

    /**
     * 备注说明 BZ
     */
    private String bz;

    /**
     * 类型（01系统账，02手工账） LX
     */
    private String lx;

    /**
     * 贷款所属渠道商 QDS
     */
    private String qds;

    /**
     * T_QDS_DKSQB
     */
    private static final long serialVersionUID = 1L;

    /**
     * 申请UUID
     * @return SQ_UUID 申请UUID
     */
    public String getSqUuid() {
        return sqUuid;
    }

    /**
     * 申请UUID
     * @param sqUuid 申请UUID
     */
    public void setSqUuid(String sqUuid) {
        this.sqUuid = sqUuid;
    }

    /**
     * 公司税号
     * @return NSRSBH 公司税号
     */
    public String getNsrsbh() {
        return nsrsbh;
    }

    /**
     * 公司税号
     * @param nsrsbh 公司税号
     */
    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    /**
     * 公司名称
     * @return GSMC 公司名称
     */
    public String getGsmc() {
        return gsmc;
    }

    /**
     * 公司名称
     * @param gsmc 公司名称
     */
    public void setGsmc(String gsmc) {
        this.gsmc = gsmc;
    }

    /**
     * 法人姓名
     * @return FR_XM 法人姓名
     */
    public String getFrXm() {
        return frXm;
    }

    /**
     * 法人姓名
     * @param frXm 法人姓名
     */
    public void setFrXm(String frXm) {
        this.frXm = frXm;
    }

    /**
     * 法人手机号
     * @return FR_PHONE 法人手机号
     */
    public String getFrPhone() {
        return frPhone;
    }

    /**
     * 法人手机号
     * @param frPhone 法人手机号
     */
    public void setFrPhone(String frPhone) {
        this.frPhone = frPhone;
    }

    /**
     * 法人身份证件号
     * @return FR_SFZJHM 法人身份证件号
     */
    public String getFrSfzjhm() {
        return frSfzjhm;
    }

    /**
     * 法人身份证件号
     * @param frSfzjhm 法人身份证件号
     */
    public void setFrSfzjhm(String frSfzjhm) {
        this.frSfzjhm = frSfzjhm;
    }

    /**
     * 实际放款金额
     * @return SJFKJE 实际放款金额
     */
    public Short getSjfkje() {
        return sjfkje;
    }

    /**
     * 实际放款金额
     * @param sjfkje 实际放款金额
     */
    public void setSjfkje(Short sjfkje) {
        this.sjfkje = sjfkje;
    }

    /**
     * 产品UUID
     * @return PROD_UUID 产品UUID
     */
    public String getProdUuid() {
        return prodUuid;
    }

    /**
     * 产品UUID
     * @param prodUuid 产品UUID
     */
    public void setProdUuid(String prodUuid) {
        this.prodUuid = prodUuid;
    }

    /**
     * 产品名称
     * @return PROD_NAME 产品名称
     */
    public String getProdName() {
        return prodName;
    }

    /**
     * 产品名称
     * @param prodName 产品名称
     */
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    /**
     * 推荐人UUID
     * @return QDS_UUID 推荐人UUID
     */
    public String getQdsUuid() {
        return qdsUuid;
    }

    /**
     * 推荐人UUID
     * @param qdsUuid 推荐人UUID
     */
    public void setQdsUuid(String qdsUuid) {
        this.qdsUuid = qdsUuid;
    }

    /**
     * 推荐人名称
     * @return QDS_MC 推荐人名称
     */
    public String getQdsMc() {
        return qdsMc;
    }

    /**
     * 推荐人名称
     * @param qdsMc 推荐人名称
     */
    public void setQdsMc(String qdsMc) {
        this.qdsMc = qdsMc;
    }

    /**
     * 申请状态
     * @return SQZT 申请状态
     */
    public String getSqzt() {
        return sqzt;
    }

    /**
     * 申请状态
     * @param sqzt 申请状态
     */
    public void setSqzt(String sqzt) {
        this.sqzt = sqzt;
    }

    /**
     * 申请日期
     * @return SQRQ 申请日期
     */
    public Date getSqrq() {
        return sqrq;
    }

    /**
     * 申请日期
     * @param sqrq 申请日期
     */
    public void setSqrq(Date sqrq) {
        this.sqrq = sqrq;
    }

    /**
     * 录入人员
     * @return LRRY 录入人员
     */
    public String getLrry() {
        return lrry;
    }

    /**
     * 录入人员
     * @param lrry 录入人员
     */
    public void setLrry(String lrry) {
        this.lrry = lrry;
    }

    /**
     * 修改时间
     * @return XGSJ 修改时间
     */
    public Date getXgsj() {
        return xgsj;
    }

    /**
     * 修改时间
     * @param xgsj 修改时间
     */
    public void setXgsj(Date xgsj) {
        this.xgsj = xgsj;
    }

    /**
     * 修改人员
     * @return XGRY 修改人员
     */
    public String getXgry() {
        return xgry;
    }

    /**
     * 修改人员
     * @param xgry 修改人员
     */
    public void setXgry(String xgry) {
        this.xgry = xgry;
    }

    /**
     * 微信OPENID
     * @return OPENID 微信OPENID
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 微信OPENID
     * @param openid 微信OPENID
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 备注说明
     * @return BZ 备注说明
     */
    public String getBz() {
        return bz;
    }

    /**
     * 备注说明
     * @param bz 备注说明
     */
    public void setBz(String bz) {
        this.bz = bz;
    }

    /**
     * 类型（01系统账，02手工账）
     * @return LX 类型（01系统账，02手工账）
     */
    public String getLx() {
        return lx;
    }

    /**
     * 类型（01系统账，02手工账）
     * @param lx 类型（01系统账，02手工账）
     */
    public void setLx(String lx) {
        this.lx = lx;
    }

    /**
     * 申请状态名称
     * @return
     */
    public String getSqztmc() {
        return sqztmc;
    }

    public void setSqztmc(String sqztmc) {
        this.sqztmc = sqztmc;
    }

    /**
     * 贷款所属渠道商
     * @return QDS 贷款所属渠道商
     */
    public String getQds() {
        return qds;
    }

    /**
     * 贷款所属渠道商
     * @param qds 贷款所属渠道商
     */
    public void setQds(String qds) {
        this.qds = qds;
    }

    public String getSqrqq() {
        return sqrqq;
    }

    public void setSqrqq(String sqrqq) {
        this.sqrqq = sqrqq;
    }

    public String getSqrqz() {
        return sqrqz;
    }

    public void setSqrqz(String sqrqz) {
        this.sqrqz = sqrqz;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sqUuid=").append(sqUuid);
        sb.append(", nsrsbh=").append(nsrsbh);
        sb.append(", gsmc=").append(gsmc);
        sb.append(", frXm=").append(frXm);
        sb.append(", frPhone=").append(frPhone);
        sb.append(", frSfzjhm=").append(frSfzjhm);
        sb.append(", sjfkje=").append(sjfkje);
        sb.append(", prodUuid=").append(prodUuid);
        sb.append(", prodName=").append(prodName);
        sb.append(", qdsUuid=").append(qdsUuid);
        sb.append(", qdsMc=").append(qdsMc);
        sb.append(", sqzt=").append(sqzt);
        sb.append(", sqrq=").append(sqrq);
        sb.append(", lrry=").append(lrry);
        sb.append(", xgsj=").append(xgsj);
        sb.append(", xgry=").append(xgry);
        sb.append(", openid=").append(openid);
        sb.append(", bz=").append(bz);
        sb.append(", lx=").append(lx);
        sb.append(", qds=").append(qds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}