package com.runone.pinda.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PdTruckLicense implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 车辆id
     *
     * @mbg.generated
     */
    private String truckId;

    /**
     * 发动机编号
     *
     * @mbg.generated
     */
    private String engineNumber;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    private Date registrationDate;

    /**
     * 国家强制报废日期
     *
     * @mbg.generated
     */
    private Date mandatoryScrap;

    /**
     * 检验有效期
     *
     * @mbg.generated
     */
    private Date expirationDate;

    /**
     * 整备质量
     *
     * @mbg.generated
     */
    private BigDecimal overallQuality;

    /**
     * 核定载质量
     *
     * @mbg.generated
     */
    private BigDecimal allowableWeight;

    /**
     * 外廓尺寸
     *
     * @mbg.generated
     */
    private String outsideDimensions;

    /**
     * 行驶证有效期
     *
     * @mbg.generated
     */
    private Date validityPeriod;

    /**
     * 道路运输证号
     *
     * @mbg.generated
     */
    private String transportCertificateNumber;

    /**
     * 图片信息
     *
     * @mbg.generated
     */
    private String picture;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getMandatoryScrap() {
        return mandatoryScrap;
    }

    public void setMandatoryScrap(Date mandatoryScrap) {
        this.mandatoryScrap = mandatoryScrap;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getOverallQuality() {
        return overallQuality;
    }

    public void setOverallQuality(BigDecimal overallQuality) {
        this.overallQuality = overallQuality;
    }

    public BigDecimal getAllowableWeight() {
        return allowableWeight;
    }

    public void setAllowableWeight(BigDecimal allowableWeight) {
        this.allowableWeight = allowableWeight;
    }

    public String getOutsideDimensions() {
        return outsideDimensions;
    }

    public void setOutsideDimensions(String outsideDimensions) {
        this.outsideDimensions = outsideDimensions;
    }

    public Date getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(Date validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public String getTransportCertificateNumber() {
        return transportCertificateNumber;
    }

    public void setTransportCertificateNumber(String transportCertificateNumber) {
        this.transportCertificateNumber = transportCertificateNumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", truckId=").append(truckId);
        sb.append(", engineNumber=").append(engineNumber);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", mandatoryScrap=").append(mandatoryScrap);
        sb.append(", expirationDate=").append(expirationDate);
        sb.append(", overallQuality=").append(overallQuality);
        sb.append(", allowableWeight=").append(allowableWeight);
        sb.append(", outsideDimensions=").append(outsideDimensions);
        sb.append(", validityPeriod=").append(validityPeriod);
        sb.append(", transportCertificateNumber=").append(transportCertificateNumber);
        sb.append(", picture=").append(picture);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}