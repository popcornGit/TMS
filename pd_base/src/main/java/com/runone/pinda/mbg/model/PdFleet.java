package com.runone.pinda.mbg.model;

import java.io.Serializable;

public class PdFleet implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 车队名称
     *
     * @mbg.generated
     */
    private String name;

    private String fleetNumber;

    /**
     * 所属机构
     *
     * @mbg.generated
     */
    private String agencyId;

    /**
     * 负责人
     *
     * @mbg.generated
     */
    private String manager;

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

    public String getFleetNumber() {
        return fleetNumber;
    }

    public void setFleetNumber(String fleetNumber) {
        this.fleetNumber = fleetNumber;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
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
        sb.append(", fleetNumber=").append(fleetNumber);
        sb.append(", agencyId=").append(agencyId);
        sb.append(", manager=").append(manager);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}