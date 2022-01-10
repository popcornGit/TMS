package com.runone.pinda.mbg.model;

import java.io.Serializable;

public class PdTransportTrips implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 车次名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 发车时间
     *
     * @mbg.generated
     */
    private String departureTime;

    /**
     * 所属线路id
     *
     * @mbg.generated
     */
    private String transportLineId;

    /**
     * 周期，1为天，2为周，3为月
     *
     * @mbg.generated
     */
    private Byte period;

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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getTransportLineId() {
        return transportLineId;
    }

    public void setTransportLineId(String transportLineId) {
        this.transportLineId = transportLineId;
    }

    public Byte getPeriod() {
        return period;
    }

    public void setPeriod(Byte period) {
        this.period = period;
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
        sb.append(", departureTime=").append(departureTime);
        sb.append(", transportLineId=").append(transportLineId);
        sb.append(", period=").append(period);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}