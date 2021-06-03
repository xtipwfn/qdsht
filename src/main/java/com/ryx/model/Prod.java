package com.ryx.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

/**
 * 产品VO
 */
public class Prod implements Serializable {
    /**
     * 产品主键 PROD_UUID
     */
    private String prodUuid;

    /**
     * 产品名称 PROD_NAME
     */
    private String prodName;

    /**
     * 产品状态 PROD_ZT
     */
    private String prodZt;

    /**
     * 产品说明 PROD_SM
     */
    private String prodSm;

    /**
     * 产品申请条件 PROD_TJ
     */
    private String prodTj;

    /**
     * 产品特点 PROD_TD
     */
    private String prodTd;

    /**
     * 产品所需资料 PROD_SXZL
     */
    private String prodSxzl;

    /**
     * 产品分类（01企业贷、02发票贷、03个人贷） PROD_FL
     */
    private String prodFl;

    /**
     * 最大贷款金额 MAX_JE
     */
    private String maxJe;

    /**
     * 件均额度 JJED
     */
    private String jjed;

    /**
     * 成功放款数 CGFKS
     */
    private String cgfks;

    /**
     * 最快放款时间 ZKFKSJ
     */
    private String zkfksj;

    /**
     * 贷款期数 DKQS
     */
    private String dkqs;

    /**
     * 贷款利率 DKLL
     */
    private String dkll;

    /**
     * 还款方式 HKFS
     */
    private String hkfs;

    /**
     * 地区 DQ
     */
    private String dq;

    /**
     * 白银返拥 BYFY
     */
    private String byfy;

    /**
     * 黄金返拥 HJFY
     */
    private String hjfy;

    /**
     * 钻石返拥 ZSFY
     */
    private String zsfy;

    /**
     * 结算周期 JSZQ
     */
    private String jszq;

    /**
     * 结算条件 JSTJ
     */
    private String jstj;

    /**
     * 结算说明 JSSM
     */
    private String jssm;

    /**
     * 流程PDF说明 LC_PDF
     */
    private String lcPdf;

    /**
     * 跳转银行地址 BANK_URL
     */
    private String bankUrl;

    /**
     * 推荐海报地址 TGHB_URL
     */
    private String tghbUrl;

    /**
     * 序号 XH
     */
    private int xh;

    /**
     * logo地址 LOGO_URL
     */
    private String logoUrl;

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
     * 预估每月还款 YGMYHK
     */
    private String ygmyhk;

    /**
     * 提款码链接地址 TKM_URL
     */
    private String tkmUrl;

    /**
     * 客服标志，当为Y时后端跳转客服URL KF_BZ
     */
    private String kfBz;

    /**
     * 客服跳转URL KF_URL
     */
    private String kfUrl;

    /**
     * 流程说明 PROD_LCSM
     */
    private String prodLcsm;

    /**
     * 热门标志 RMBZ
     */
    private String rmbz;

    /**
     * 渠道商 QDS
     */
    private String qds;

    /**
     * T_QDS_PROD
     */
    private static final long serialVersionUID = 1L;

    /**
     * 产品主键
     * @return PROD_UUID 产品主键
     */
    public String getProdUuid() {
        return prodUuid;
    }

    /**
     * 产品主键
     * @param prodUuid 产品主键
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
     * 产品状态
     * @return PROD_ZT 产品状态
     */
    public String getProdZt() {
        return prodZt;
    }

    /**
     * 产品状态
     * @param prodZt 产品状态
     */
    public void setProdZt(String prodZt) {
        this.prodZt = prodZt;
    }

    /**
     * 产品说明
     * @return PROD_SM 产品说明
     */
    public String getProdSm() {
        return prodSm;
    }

    /**
     * 产品说明
     * @param prodSm 产品说明
     */
    public void setProdSm(String prodSm) {
        this.prodSm = prodSm;
    }

    /**
     * 产品申请条件
     * @return PROD_TJ 产品申请条件
     */
    public String getProdTj() {
        return prodTj;
    }

    /**
     * 产品申请条件
     * @param prodTj 产品申请条件
     */
    public void setProdTj(String prodTj) {
        this.prodTj = prodTj;
    }

    /**
     * 产品特点
     * @return PROD_TD 产品特点
     */
    public String getProdTd() {
        return prodTd;
    }

    /**
     * 产品特点
     * @param prodTd 产品特点
     */
    public void setProdTd(String prodTd) {
        this.prodTd = prodTd;
    }

    /**
     * 产品所需资料
     * @return PROD_SXZL 产品所需资料
     */
    public String getProdSxzl() {
        return prodSxzl;
    }

    /**
     * 产品所需资料
     * @param prodSxzl 产品所需资料
     */
    public void setProdSxzl(String prodSxzl) {
        this.prodSxzl = prodSxzl;
    }

    /**
     * 产品分类（01企业贷、02发票贷、03个人贷）
     * @return PROD_FL 产品分类（01企业贷、02发票贷、03个人贷）
     */
    public String getProdFl() {
        return prodFl;
    }

    /**
     * 产品分类（01企业贷、02发票贷、03个人贷）
     * @param prodFl 产品分类（01企业贷、02发票贷、03个人贷）
     */
    public void setProdFl(String prodFl) {
        this.prodFl = prodFl;
    }

    /**
     * 最大贷款金额
     * @return MAX_JE 最大贷款金额
     */
    public String getMaxJe() {
        return maxJe;
    }

    /**
     * 最大贷款金额
     * @param maxJe 最大贷款金额
     */
    public void setMaxJe(String maxJe) {
        this.maxJe = maxJe;
    }

    /**
     * 件均额度
     * @return JJED 件均额度
     */
    public String getJjed() {
        return jjed;
    }

    /**
     * 件均额度
     * @param jjed 件均额度
     */
    public void setJjed(String jjed) {
        this.jjed = jjed;
    }

    /**
     * 成功放款数
     * @return CGFKS 成功放款数
     */
    public String getCgfks() {
        return cgfks;
    }

    /**
     * 成功放款数
     * @param cgfks 成功放款数
     */
    public void setCgfks(String cgfks) {
        this.cgfks = cgfks;
    }

    /**
     * 最快放款时间
     * @return ZKFKSJ 最快放款时间
     */
    public String getZkfksj() {
        return zkfksj;
    }

    /**
     * 最快放款时间
     * @param zkfksj 最快放款时间
     */
    public void setZkfksj(String zkfksj) {
        this.zkfksj = zkfksj;
    }

    /**
     * 贷款期数
     * @return DKQS 贷款期数
     */
    public String getDkqs() {
        return dkqs;
    }

    /**
     * 贷款期数
     * @param dkqs 贷款期数
     */
    public void setDkqs(String dkqs) {
        this.dkqs = dkqs;
    }

    /**
     * 贷款利率
     * @return DKLL 贷款利率
     */
    public String getDkll() {
        return dkll;
    }

    /**
     * 贷款利率
     * @param dkll 贷款利率
     */
    public void setDkll(String dkll) {
        this.dkll = dkll;
    }

    /**
     * 还款方式
     * @return HKFS 还款方式
     */
    public String getHkfs() {
        return hkfs;
    }

    /**
     * 还款方式
     * @param hkfs 还款方式
     */
    public void setHkfs(String hkfs) {
        this.hkfs = hkfs;
    }

    /**
     * 地区
     * @return DQ 地区
     */
    public String getDq() {
        return dq;
    }

    /**
     * 地区
     * @param dq 地区
     */
    public void setDq(String dq) {
        this.dq = dq;
    }

    /**
     * 白银返拥
     * @return BYFY 白银返拥
     */
    public String getByfy() {
        return byfy;
    }

    /**
     * 白银返拥
     * @param byfy 白银返拥
     */
    public void setByfy(String byfy) {
        this.byfy = byfy;
    }

    /**
     * 黄金返拥
     * @return HJFY 黄金返拥
     */
    public String getHjfy() {
        return hjfy;
    }

    /**
     * 黄金返拥
     * @param hjfy 黄金返拥
     */
    public void setHjfy(String hjfy) {
        this.hjfy = hjfy;
    }

    /**
     * 钻石返拥
     * @return ZSFY 钻石返拥
     */
    public String getZsfy() {
        return zsfy;
    }

    /**
     * 钻石返拥
     * @param zsfy 钻石返拥
     */
    public void setZsfy(String zsfy) {
        this.zsfy = zsfy;
    }

    /**
     * 结算周期
     * @return JSZQ 结算周期
     */
    public String getJszq() {
        return jszq;
    }

    /**
     * 结算周期
     * @param jszq 结算周期
     */
    public void setJszq(String jszq) {
        this.jszq = jszq;
    }

    /**
     * 结算条件
     * @return JSTJ 结算条件
     */
    public String getJstj() {
        return jstj;
    }

    /**
     * 结算条件
     * @param jstj 结算条件
     */
    public void setJstj(String jstj) {
        this.jstj = jstj;
    }

    /**
     * 结算说明
     * @return JSSM 结算说明
     */
    public String getJssm() {
        return jssm;
    }

    /**
     * 结算说明
     * @param jssm 结算说明
     */
    public void setJssm(String jssm) {
        this.jssm = jssm;
    }

    /**
     * 流程PDF说明
     * @return LC_PDF 流程PDF说明
     */
    public String getLcPdf() {
        return lcPdf;
    }

    /**
     * 流程PDF说明
     * @param lcPdf 流程PDF说明
     */
    public void setLcPdf(String lcPdf) {
        this.lcPdf = lcPdf;
    }

    /**
     * 跳转银行地址
     * @return BANK_URL 跳转银行地址
     */
    public String getBankUrl() {
        return bankUrl;
    }

    /**
     * 跳转银行地址
     * @param bankUrl 跳转银行地址
     */
    public void setBankUrl(String bankUrl) {
        this.bankUrl = bankUrl;
    }

    /**
     * 推荐海报地址
     * @return TGHB_URL 推荐海报地址
     */
    public String getTghbUrl() {
        return tghbUrl;
    }

    /**
     * 推荐海报地址
     * @param tghbUrl 推荐海报地址
     */
    public void setTghbUrl(String tghbUrl) {
        this.tghbUrl = tghbUrl;
    }

    /**
     * 序号
     * @return XH 序号
     */
    public int getXh() {
        return xh;
    }

    /**
     * 序号
     * @param xh 序号
     */
    public void setXh(int xh) {
        this.xh = xh;
    }

    /**
     * logo地址
     * @return LOGO_URL logo地址
     */
    public String getLogoUrl() {
        return logoUrl;
    }

    /**
     * logo地址
     * @param logoUrl logo地址
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
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
     * 预估每月还款
     * @return YGMYHK 预估每月还款
     */
    public String getYgmyhk() {
        return ygmyhk;
    }

    /**
     * 预估每月还款
     * @param ygmyhk 预估每月还款
     */
    public void setYgmyhk(String ygmyhk) {
        this.ygmyhk = ygmyhk;
    }

    /**
     * 提款码链接地址
     * @return TKM_URL 提款码链接地址
     */
    public String getTkmUrl() {
        return tkmUrl;
    }

    /**
     * 提款码链接地址
     * @param tkmUrl 提款码链接地址
     */
    public void setTkmUrl(String tkmUrl) {
        this.tkmUrl = tkmUrl;
    }

    /**
     * 客服标志，当为Y时后端跳转客服URL
     * @return KF_BZ 客服标志，当为Y时后端跳转客服URL
     */
    public String getKfBz() {
        return kfBz;
    }

    /**
     * 客服标志，当为Y时后端跳转客服URL
     * @param kfBz 客服标志，当为Y时后端跳转客服URL
     */
    public void setKfBz(String kfBz) {
        this.kfBz = kfBz;
    }

    /**
     * 客服跳转URL
     * @return KF_URL 客服跳转URL
     */
    public String getKfUrl() {
        return kfUrl;
    }

    /**
     * 客服跳转URL
     * @param kfUrl 客服跳转URL
     */
    public void setKfUrl(String kfUrl) {
        this.kfUrl = kfUrl;
    }

    /**
     * 流程说明
     * @return PROD_LCSM 流程说明
     */
    public String getProdLcsm() {
        return prodLcsm;
    }

    /**
     * 流程说明
     * @param prodLcsm 流程说明
     */
    public void setProdLcsm(String prodLcsm) {
        this.prodLcsm = prodLcsm;
    }

    /**
     * 热门标志
     * @return RMBZ 热门标志
     */
    public String getRmbz() {
        return rmbz;
    }

    /**
     * 热门标志
     * @param rmbz 热门标志
     */
    public void setRmbz(String rmbz) {
        this.rmbz = rmbz;
    }

    /**
     * 渠道商
     * @return QDS 渠道商
     */
    public String getQds() {
        return qds;
    }

    /**
     * 渠道商
     * @param qds 渠道商
     */
    public void setQds(String qds) {
        this.qds = qds;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", prodUuid=").append(prodUuid);
        sb.append(", prodName=").append(prodName);
        sb.append(", prodZt=").append(prodZt);
        sb.append(", prodSm=").append(prodSm);
        sb.append(", prodTj=").append(prodTj);
        sb.append(", prodTd=").append(prodTd);
        sb.append(", prodSxzl=").append(prodSxzl);
        sb.append(", prodFl=").append(prodFl);
        sb.append(", maxJe=").append(maxJe);
        sb.append(", jjed=").append(jjed);
        sb.append(", cgfks=").append(cgfks);
        sb.append(", zkfksj=").append(zkfksj);
        sb.append(", dkqs=").append(dkqs);
        sb.append(", dkll=").append(dkll);
        sb.append(", hkfs=").append(hkfs);
        sb.append(", dq=").append(dq);
        sb.append(", byfy=").append(byfy);
        sb.append(", hjfy=").append(hjfy);
        sb.append(", zsfy=").append(zsfy);
        sb.append(", jszq=").append(jszq);
        sb.append(", jstj=").append(jstj);
        sb.append(", jssm=").append(jssm);
        sb.append(", lcPdf=").append(lcPdf);
        sb.append(", bankUrl=").append(bankUrl);
        sb.append(", tghbUrl=").append(tghbUrl);
        sb.append(", xh=").append(xh);
        sb.append(", logoUrl=").append(logoUrl);
        sb.append(", lrsj=").append(lrsj);
        sb.append(", lrry=").append(lrry);
        sb.append(", xgsj=").append(xgsj);
        sb.append(", xgry=").append(xgry);
        sb.append(", ygmyhk=").append(ygmyhk);
        sb.append(", tkmUrl=").append(tkmUrl);
        sb.append(", kfBz=").append(kfBz);
        sb.append(", kfUrl=").append(kfUrl);
        sb.append(", prodLcsm=").append(prodLcsm);
        sb.append(", rmbz=").append(rmbz);
        sb.append(", qds=").append(qds);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}