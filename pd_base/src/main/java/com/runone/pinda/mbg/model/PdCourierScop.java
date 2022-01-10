package com.runone.pinda.mbg.model;

import java.io.Serializable;

public class PdCourierScop implements Serializable {
    private String id;

    /**
     * 用户id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 行政区域id
     *
     * @mbg.generated
     */
    private String areaId;

    /**
     * 快递员作业范围
     *
     * @mbg.generated
     */
    private String mutiPoints;

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

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getMutiPoints() {
        return mutiPoints;
    }

    public void setMutiPoints(String mutiPoints) {
        this.mutiPoints = mutiPoints;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", areaId=").append(areaId);
        sb.append(", mutiPoints=").append(mutiPoints);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}