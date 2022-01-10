package com.runone.pinda.mbg.model;

import java.io.Serializable;
import java.util.Date;

public class PdTransportLineType implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 线路类型名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 线路类型编号
     *
     * @mbg.generated
     */
    private String typeNumber;

    /**
     * 起始地机构类型
     *
     * @mbg.generated
     */
    private Integer startAgencyType;

    /**
     * 目的地机构类型
     *
     * @mbg.generated
     */
    private Integer endAgencyType;

    /**
     * 最后更新时间
     *
     * @mbg.generated
     */
    private Date lastUpdateTime;

    /**
     * 最后更新人
     *
     * @mbg.generated
     */
    private String updater;

    /**
     * 状态  0：禁用   1：正常
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

    public String getTypeNumber() {
        return typeNumber;
    }

    public void setTypeNumber(String typeNumber) {
        this.typeNumber = typeNumber;
    }

    public Integer getStartAgencyType() {
        return startAgencyType;
    }

    public void setStartAgencyType(Integer startAgencyType) {
        this.startAgencyType = startAgencyType;
    }

    public Integer getEndAgencyType() {
        return endAgencyType;
    }

    public void setEndAgencyType(Integer endAgencyType) {
        this.endAgencyType = endAgencyType;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
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
        sb.append(", typeNumber=").append(typeNumber);
        sb.append(", startAgencyType=").append(startAgencyType);
        sb.append(", endAgencyType=").append(endAgencyType);
        sb.append(", lastUpdateTime=").append(lastUpdateTime);
        sb.append(", updater=").append(updater);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}