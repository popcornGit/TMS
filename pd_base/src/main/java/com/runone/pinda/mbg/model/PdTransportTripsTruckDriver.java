package com.runone.pinda.mbg.model;

import java.io.Serializable;

public class PdTransportTripsTruckDriver implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 车辆id
     *
     * @mbg.generated
     */
    private String truckId;

    /**
     * 车次id
     *
     * @mbg.generated
     */
    private String transportTripsId;

    /**
     * 司机id
     *
     * @mbg.generated
     */
    private String userId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTruckId() {
        return truckId;
    }

    public void setTruckId(String truckId) {
        this.truckId = truckId;
    }

    public String getTransportTripsId() {
        return transportTripsId;
    }

    public void setTransportTripsId(String transportTripsId) {
        this.transportTripsId = transportTripsId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", truckId=").append(truckId);
        sb.append(", transportTripsId=").append(transportTripsId);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}