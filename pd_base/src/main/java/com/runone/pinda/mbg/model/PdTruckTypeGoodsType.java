package com.runone.pinda.mbg.model;

import java.io.Serializable;

public class PdTruckTypeGoodsType implements Serializable {
    private String id;

    /**
     * 车辆类型id
     *
     * @mbg.generated
     */
    private String truckTypeId;

    /**
     * 货物类型id
     *
     * @mbg.generated
     */
    private String goodsTypeId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTruckTypeId() {
        return truckTypeId;
    }

    public void setTruckTypeId(String truckTypeId) {
        this.truckTypeId = truckTypeId;
    }

    public String getGoodsTypeId() {
        return goodsTypeId;
    }

    public void setGoodsTypeId(String goodsTypeId) {
        this.goodsTypeId = goodsTypeId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", truckTypeId=").append(truckTypeId);
        sb.append(", goodsTypeId=").append(goodsTypeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}