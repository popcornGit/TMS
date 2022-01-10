package com.runone.pinda.mbg.model;

import java.io.Serializable;

public class PdAreaBoundaries implements Serializable {
    /**
     * is
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 行政区域id
     *
     * @mbg.generated
     */
    private String areaId;

    /**
     * 边界-面坐标点
     *
     * @mbg.generated
     */
    private String boundaries;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getBoundaries() {
        return boundaries;
    }

    public void setBoundaries(String boundaries) {
        this.boundaries = boundaries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", areaId=").append(areaId);
        sb.append(", boundaries=").append(boundaries);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}