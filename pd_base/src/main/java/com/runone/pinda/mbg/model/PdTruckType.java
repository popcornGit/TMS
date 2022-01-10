package com.runone.pinda.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PdTruckType implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 车辆类型名称
     *
     * @mbg.generated
     */
    private String name;

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
     * 长
     *
     * @mbg.generated
     */
    private BigDecimal measureLong;

    /**
     * 宽
     *
     * @mbg.generated
     */
    private BigDecimal measureWidth;

    /**
     * 高
     *
     * @mbg.generated
     */
    private BigDecimal measureHigh;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public BigDecimal getMeasureLong() {
        return measureLong;
    }

    public void setMeasureLong(BigDecimal measureLong) {
        this.measureLong = measureLong;
    }

    public BigDecimal getMeasureWidth() {
        return measureWidth;
    }

    public void setMeasureWidth(BigDecimal measureWidth) {
        this.measureWidth = measureWidth;
    }

    public BigDecimal getMeasureHigh() {
        return measureHigh;
    }

    public void setMeasureHigh(BigDecimal measureHigh) {
        this.measureHigh = measureHigh;
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
        sb.append(", name=").append(name);
        sb.append(", allowableLoad=").append(allowableLoad);
        sb.append(", allowableVolume=").append(allowableVolume);
        sb.append(", measureLong=").append(measureLong);
        sb.append(", measureWidth=").append(measureWidth);
        sb.append(", measureHigh=").append(measureHigh);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}