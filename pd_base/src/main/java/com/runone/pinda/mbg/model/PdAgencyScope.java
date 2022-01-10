package com.runone.pinda.mbg.model;

import java.io.Serializable;

public class PdAgencyScope implements Serializable {
    private String id;

    /**
     * 机构id
     *
     * @mbg.generated
     */
    private String agencyId;

    /**
     * 行政区域id
     *
     * @mbg.generated
     */
    private String areaId;

    /**
     * 机构作业范围
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

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
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
        sb.append(", agencyId=").append(agencyId);
        sb.append(", areaId=").append(areaId);
        sb.append(", mutiPoints=").append(mutiPoints);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}