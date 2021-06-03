package com.ryx.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户VO
 */
public class User implements Serializable {
    /**
     * 用户UUID USER_UUID
     */
    private String userUuid;

    /**
     * 姓名 XM
     */
    private String xm;

    /**
     * 手机号 PHONE
     */
    private String phone;

    /**
     * null PWD
     */
    private String pwd;

    /**
     * 用户类型 USER_TYPE
     */
    private String userType;

    /**
     * 身份证件号 SFZJHM
     */
    private String sfzjhm;

    /**
     * 支付宝账号 ZFBZH
     */
    private String zfbzh;

    /**
     * 上级用户UUID SJ_USER_UUID
     */
    private String sjUserUuid;

    /**
     * 上级用户名称 SJ_XM
     */
    private String sjXm;

    /**
     * 职位 ZW
     */
    private String zw;

    /**
     * 微信openid OPENID
     */
    private String openid;

    /**
     * 录入时间 LRSJ
     */
    private Date lrsj;

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
     * 有效标志 YXBZ
     */
    private String yxbz;

    /**
     * 角色类型 JS_TYPE
     */
    private String jsType;

    /**
     * 微信头像链接地址 HEAD_URL
     */
    private String headUrl;

    /**
     * 渠道商ID QDS
     */
    private String qds;

    /**
     * 所属渠道商ID SSQDID
     */
    private String ssqdid;

    /**
     * T_QDS_USER
     */
    private static final long serialVersionUID = 1L;

    /**
     * 用户UUID
     * @return USER_UUID 用户UUID
     */
    public String getUserUuid() {
        return userUuid;
    }

    /**
     * 用户UUID
     * @param userUuid 用户UUID
     */
    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    /**
     * 姓名
     * @return XM 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 姓名
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm;
    }

    /**
     * 手机号
     * @return PHONE 手机号
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号
     * @param phone 手机号
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * null
     * @return PWD null
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * null
     * @param pwd null
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 用户类型
     * @return USER_TYPE 用户类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 用户类型
     * @param userType 用户类型
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * 身份证件号
     * @return SFZJHM 身份证件号
     */
    public String getSfzjhm() {
        return sfzjhm;
    }

    /**
     * 身份证件号
     * @param sfzjhm 身份证件号
     */
    public void setSfzjhm(String sfzjhm) {
        this.sfzjhm = sfzjhm;
    }

    /**
     * 支付宝账号
     * @return ZFBZH 支付宝账号
     */
    public String getZfbzh() {
        return zfbzh;
    }

    /**
     * 支付宝账号
     * @param zfbzh 支付宝账号
     */
    public void setZfbzh(String zfbzh) {
        this.zfbzh = zfbzh;
    }

    /**
     * 上级用户UUID
     * @return SJ_USER_UUID 上级用户UUID
     */
    public String getSjUserUuid() {
        return sjUserUuid;
    }

    /**
     * 上级用户UUID
     * @param sjUserUuid 上级用户UUID
     */
    public void setSjUserUuid(String sjUserUuid) {
        this.sjUserUuid = sjUserUuid;
    }

    /**
     * 上级用户名称
     * @return SJ_XM 上级用户名称
     */
    public String getSjXm() {
        return sjXm;
    }

    /**
     * 上级用户名称
     * @param sjXm 上级用户名称
     */
    public void setSjXm(String sjXm) {
        this.sjXm = sjXm;
    }

    /**
     * 职位
     * @return ZW 职位
     */
    public String getZw() {
        return zw;
    }

    /**
     * 职位
     * @param zw 职位
     */
    public void setZw(String zw) {
        this.zw = zw;
    }

    /**
     * 微信openid
     * @return OPENID 微信openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 微信openid
     * @param openid 微信openid
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * 录入时间
     * @return LRSJ 录入时间
     */
    public Date getLrsj() {
        return lrsj;
    }

    /**
     * 录入时间
     * @param lrsj 录入时间
     */
    public void setLrsj(Date lrsj) {
        this.lrsj = lrsj;
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
     * 有效标志
     * @return YXBZ 有效标志
     */
    public String getYxbz() {
        return yxbz;
    }

    /**
     * 有效标志
     * @param yxbz 有效标志
     */
    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    /**
     * 角色类型
     * @return JS_TYPE 角色类型
     */
    public String getJsType() {
        return jsType;
    }

    /**
     * 角色类型
     * @param jsType 角色类型
     */
    public void setJsType(String jsType) {
        this.jsType = jsType;
    }

    /**
     * 微信头像链接地址
     * @return HEAD_URL 微信头像链接地址
     */
    public String getHeadUrl() {
        return headUrl;
    }

    /**
     * 微信头像链接地址
     * @param headUrl 微信头像链接地址
     */
    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl;
    }

    /**
     * 渠道商ID
     * @return QDS 渠道商ID
     */
    public String getQds() {
        return qds;
    }

    /**
     * 渠道商ID
     * @param qds 渠道商ID
     */
    public void setQds(String qds) {
        this.qds = qds;
    }

    /**
     * 所属渠道商ID
     * @return SSQDID 所属渠道商ID
     */
    public String getSsqdid() {
        return ssqdid;
    }

    /**
     * 所属渠道商ID
     * @param ssqdid 所属渠道商ID
     */
    public void setSsqdid(String ssqdid) {
        this.ssqdid = ssqdid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("{userUuid=").append(userUuid);
        sb.append(", xm=").append(xm);
        sb.append(", phone=").append(phone);
        sb.append(", pwd=").append(pwd);
        sb.append(", userType=").append(userType);
        sb.append(", sfzjhm=").append(sfzjhm);
        sb.append(", zfbzh=").append(zfbzh);
        sb.append(", sjUserUuid=").append(sjUserUuid);
        sb.append(", sjXm=").append(sjXm);
        sb.append(", zw=").append(zw);
        sb.append(", openid=").append(openid);
        sb.append(", lrsj=").append(lrsj);
        sb.append(", lrry=").append(lrry);
        sb.append(", xgsj=").append(xgsj);
        sb.append(", xgry=").append(xgry);
        sb.append(", yxbz=").append(yxbz);
        sb.append(", jsType=").append(jsType);
        sb.append(", headUrl=").append(headUrl);
        sb.append(", qds=").append(qds);
        sb.append(", ssqdid=").append(ssqdid);
        sb.append("}");
        return sb.toString();
    }
}