package com.runone.pinda.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PdTransportLine implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 线路名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 线路编号
     *
     * @mbg.generated
     */
    private String lineNumber;

    /**
     * 所属机构
     *
     * @mbg.generated
     */
    private String agencyId;

    /**
     * 线路类型
     *
     * @mbg.generated
     */
    private String transportLineTypeId;

    /**
     * 起始地机构id
     *
     * @mbg.generated
     */
    private String startAgencyId;

    /**
     * 目的地机构id
     *
     * @mbg.generated
     */
    private String endAgencyId;

    /**
     * 距离
     *
     * @mbg.generated
     */
    private BigDecimal distance;

    /**
     * 成本
     *
     * @mbg.generated
     */
    private BigDecimal cost;

    /**
     * 预计时间（分钟）
     *
     * @mbg.generated
     */
    private BigDecimal estimatedTime;

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

    public String getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(String lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getTransportLineTypeId() {
        return transportLineTypeId;
    }

    public void setTransportLineTypeId(String transportLineTypeId) {
        this.transportLineTypeId = transportLineTypeId;
    }

    public String getStartAgencyId() {
        return startAgencyId;
    }

    public void setStartAgencyId(String startAgencyId) {
        this.startAgencyId = startAgencyId;
    }

    public String getEndAgencyId() {
        return endAgencyId;
    }

    public void setEndAgencyId(String endAgencyId) {
        this.endAgencyId = endAgencyId;
    }

    public BigDecimal getDistance() {
        return distance;
    }

    public void setDistance(BigDecimal distance) {
        this.distance = distance;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public BigDecimal getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(BigDecimal estimatedTime) {
        this.estimatedTime = estimatedTime;
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
        sb.append(", lineNumber=").append(lineNumber);
        sb.append(", agencyId=").append(agencyId);
        sb.append(", transportLineTypeId=").append(transportLineTypeId);
        sb.append(", startAgencyId=").append(startAgencyId);
        sb.append(", endAgencyId=").append(endAgencyId);
        sb.append(", distance=").append(distance);
        sb.append(", cost=").append(cost);
        sb.append(", estimatedTime=").append(estimatedTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}