package com.runone.pinda.mbg.model;

import java.io.Serializable;

public class PdTruckDriver implements Serializable {
    private String id;

    /**
     * 用户id，来自用户表
     *
     * @mbg.generated
     */
    private String userId;

    /**
     * 所属车队id
     *
     * @mbg.generated
     */
    private String fleetId;

    /**
     * 年龄
     *
     * @mbg.generated
     */
    private Integer age;

    /**
     * 图片
     *
     * @mbg.generated
     */
    private String picture;

    /**
     * 驾龄
     *
     * @mbg.generated
     */
    private Integer drivingAge;

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

    public String getFleetId() {
        return fleetId;
    }

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getDrivingAge() {
        return drivingAge;
    }

    public void setDrivingAge(Integer drivingAge) {
        this.drivingAge = drivingAge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", fleetId=").append(fleetId);
        sb.append(", age=").append(age);
        sb.append(", picture=").append(picture);
        sb.append(", drivingAge=").append(drivingAge);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}