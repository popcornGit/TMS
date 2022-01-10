package com.runone.pinda.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PdTruck implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 车辆类型id
     *
     * @mbg.generated
     */
    private String truckTypeId;

    /**
     * 所属车队id
     *
     * @mbg.generated
     */
    private String fleetId;

    /**
     * 品牌
     *
     * @mbg.generated
     */
    private String brand;

    /**
     * 车牌号码
     *
     * @mbg.generated
     */
    private String licensePlate;

    /**
     * GPS设备id
     *
     * @mbg.generated
     */
    private String deviceGpsId;

    /**
     * 准载重量
     *
     * @mbg.generated
     */
    private BigDecimal allowableLoad;

    /**
     * 准载体积
     *
     * @mbg.generated
     */
    private BigDecimal allowableVolume;

    /**
     * 车辆行驶证信息id
     *
     * @mbg.generated
     */
    private String truckLicenseId;

    /**
     * 状态 0：禁用 1：正常
     *
     * @mbg.generated
     */
    private Byte status;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTruckTypeId() {
        return truckTypeId;
    }

    public void setTruckTypeId(String truckTypeId) {
        this.truckTypeId = truckTypeId;
    }

    public String getFleetId() {
        return fleetId;
    }

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getDeviceGpsId() {
        return deviceGpsId;
    }

    public void setDeviceGpsId(String deviceGpsId) {
        this.deviceGpsId = deviceGpsId;
    }

    public BigDecimal getAllowableLoad() {
        return allowableLoad;
    }

    public void setAllowableLoad(BigDecimal allowableLoad) {
        this.allowableLoad = allowableLoad;
    }

    public BigDecimal getAllowableVolume() {
        return allowableVolume;
    }

    public void setAllowableVolume(BigDecimal allowableVolume) {
        this.allowableVolume = allowableVolume;
    }

    public String getTruckLicenseId() {
        return truckLicenseId;
    }

    public void setTruckLicenseId(String truckLicenseId) {
        this.truckLicenseId = truckLicenseId;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", truckTypeId=").append(truckTypeId);
        sb.append(", fleetId=").append(fleetId);
        sb.append(", brand=").append(brand);
        sb.append(", licensePlate=").append(licensePlate);
        sb.append(", deviceGpsId=").append(deviceGpsId);
        sb.append(", allowableLoad=").append(allowableLoad);
        sb.append(", allowableVolume=").append(allowableVolume);
        sb.append(", truckLicenseId=").append(truckLicenseId);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}