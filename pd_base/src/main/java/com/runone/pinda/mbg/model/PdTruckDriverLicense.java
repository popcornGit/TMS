package com.runone.pinda.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PdTruckDriverLicense implements Serializable {
    private String id;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 准驾车型
     *
     * @mbg.generated
     */
    private String allowableType;

    /**
     * 初次领证日期
     *
     * @mbg.generated
     */
    private Date initialCertificateDate;

    /**
     * 有效期限
     *
     * @mbg.generated
     */
    private String validPeriod;

    /**
     * 驾驶证号
     *
     * @mbg.generated
     */
    private String licenseNumber;

    /**
     * 驾龄
     *
     * @mbg.generated
     */
    private Integer driverAge;

    /**
     * 驾驶证类型
     *
     * @mbg.generated
     */
    private String licenseType;

    /**
     * 从业资格证信息
     *
     * @mbg.generated
     */
    private String qualificationCertificate;

    /**
     * 入场证信息
     *
     * @mbg.generated
     */
    private String passCertificate;

    /**
     * 图片
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAllowableType() {
        return allowableType;
    }

    public void setAllowableType(String allowableType) {
        this.allowableType = allowableType;
    }

    public Date getInitialCertificateDate() {
        return initialCertificateDate;
    }

    public void setInitialCertificateDate(Date initialCertificateDate) {
        this.initialCertificateDate = initialCertificateDate;
    }

    public String getValidPeriod() {
        return validPeriod;
    }

    public void setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Integer getDriverAge() {
        return driverAge;
    }

    public void setDriverAge(Integer driverAge) {
        this.driverAge = driverAge;
    }

    public String getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getQualificationCertificate() {
        return qualificationCertificate;
    }

    public void setQualificationCertificate(String qualificationCertificate) {
        this.qualificationCertificate = qualificationCertificate;
    }

    public String getPassCertificate() {
        return passCertificate;
    }

    public void setPassCertificate(String passCertificate) {
        this.passCertificate = passCertificate;
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
        sb.append(", userId=").append(userId);
        sb.append(", allowableType=").append(allowableType);
        sb.append(", initialCertificateDate=").append(initialCertificateDate);
        sb.append(", validPeriod=").append(validPeriod);
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append(", driverAge=").append(driverAge);
        sb.append(", licenseType=").append(licenseType);
        sb.append(", qualificationCertificate=").append(qualificationCertificate);
        sb.append(", passCertificate=").append(passCertificate);
        sb.append(", picture=").append(picture);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}