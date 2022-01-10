package com.runone.pinda.mbg.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class PdGoodsType implements Serializable {
    /**
     * id
     *
     * @mbg.generated
     */
    private String id;

    /**
     * 货物类型名称
     *
     * @mbg.generated
     */
    private String name;

    /**
     * 默认重量，单位：千克
     *
     * @mbg.generated
     */
    private BigDecimal defaultWeight;

    /**
     * 默认体积，单位：方
     *
     * @mbg.generated
     */
    private BigDecimal defaultVolume;

    /**
     * 状态 0：禁用 1：正常
     *
     * @mbg.generated
     */
    private Byte status;

    /**
     * 说明
     *
     * @mbg.generated
     */
    private String remark;

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

    public BigDecimal getDefaultWeight() {
        return defaultWeight;
    }

    public void setDefaultWeight(BigDecimal defaultWeight) {
        this.defaultWeight = defaultWeight;
    }

    public BigDecimal getDefaultVolume() {
        return defaultVolume;
    }

    public void setDefaultVolume(BigDecimal defaultVolume) {
        this.defaultVolume = defaultVolume;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", defaultWeight=").append(defaultWeight);
        sb.append(", defaultVolume=").append(defaultVolume);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}