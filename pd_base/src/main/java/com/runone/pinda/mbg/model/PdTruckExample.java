package com.runone.pinda.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PdTruckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdTruckExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdIsNull() {
            addCriterion("truck_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdIsNotNull() {
            addCriterion("truck_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdEqualTo(String value) {
            addCriterion("truck_type_id =", value, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdNotEqualTo(String value) {
            addCriterion("truck_type_id <>", value, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdGreaterThan(String value) {
            addCriterion("truck_type_id >", value, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("truck_type_id >=", value, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdLessThan(String value) {
            addCriterion("truck_type_id <", value, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdLessThanOrEqualTo(String value) {
            addCriterion("truck_type_id <=", value, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdLike(String value) {
            addCriterion("truck_type_id like", value, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdNotLike(String value) {
            addCriterion("truck_type_id not like", value, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdIn(List<String> values) {
            addCriterion("truck_type_id in", values, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdNotIn(List<String> values) {
            addCriterion("truck_type_id not in", values, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdBetween(String value1, String value2) {
            addCriterion("truck_type_id between", value1, value2, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andTruckTypeIdNotBetween(String value1, String value2) {
            addCriterion("truck_type_id not between", value1, value2, "truckTypeId");
            return (Criteria) this;
        }

        public Criteria andFleetIdIsNull() {
            addCriterion("fleet_id is null");
            return (Criteria) this;
        }

        public Criteria andFleetIdIsNotNull() {
            addCriterion("fleet_id is not null");
            return (Criteria) this;
        }

        public Criteria andFleetIdEqualTo(String value) {
            addCriterion("fleet_id =", value, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdNotEqualTo(String value) {
            addCriterion("fleet_id <>", value, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdGreaterThan(String value) {
            addCriterion("fleet_id >", value, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdGreaterThanOrEqualTo(String value) {
            addCriterion("fleet_id >=", value, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdLessThan(String value) {
            addCriterion("fleet_id <", value, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdLessThanOrEqualTo(String value) {
            addCriterion("fleet_id <=", value, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdLike(String value) {
            addCriterion("fleet_id like", value, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdNotLike(String value) {
            addCriterion("fleet_id not like", value, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdIn(List<String> values) {
            addCriterion("fleet_id in", values, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdNotIn(List<String> values) {
            addCriterion("fleet_id not in", values, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdBetween(String value1, String value2) {
            addCriterion("fleet_id between", value1, value2, "fleetId");
            return (Criteria) this;
        }

        public Criteria andFleetIdNotBetween(String value1, String value2) {
            addCriterion("fleet_id not between", value1, value2, "fleetId");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIsNull() {
            addCriterion("license_plate is null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIsNotNull() {
            addCriterion("license_plate is not null");
            return (Criteria) this;
        }

        public Criteria andLicensePlateEqualTo(String value) {
            addCriterion("license_plate =", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotEqualTo(String value) {
            addCriterion("license_plate <>", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateGreaterThan(String value) {
            addCriterion("license_plate >", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateGreaterThanOrEqualTo(String value) {
            addCriterion("license_plate >=", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLessThan(String value) {
            addCriterion("license_plate <", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLessThanOrEqualTo(String value) {
            addCriterion("license_plate <=", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateLike(String value) {
            addCriterion("license_plate like", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotLike(String value) {
            addCriterion("license_plate not like", value, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateIn(List<String> values) {
            addCriterion("license_plate in", values, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotIn(List<String> values) {
            addCriterion("license_plate not in", values, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateBetween(String value1, String value2) {
            addCriterion("license_plate between", value1, value2, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andLicensePlateNotBetween(String value1, String value2) {
            addCriterion("license_plate not between", value1, value2, "licensePlate");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdIsNull() {
            addCriterion("device_gps_id is null");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdIsNotNull() {
            addCriterion("device_gps_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdEqualTo(String value) {
            addCriterion("device_gps_id =", value, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdNotEqualTo(String value) {
            addCriterion("device_gps_id <>", value, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdGreaterThan(String value) {
            addCriterion("device_gps_id >", value, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdGreaterThanOrEqualTo(String value) {
            addCriterion("device_gps_id >=", value, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdLessThan(String value) {
            addCriterion("device_gps_id <", value, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdLessThanOrEqualTo(String value) {
            addCriterion("device_gps_id <=", value, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdLike(String value) {
            addCriterion("device_gps_id like", value, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdNotLike(String value) {
            addCriterion("device_gps_id not like", value, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdIn(List<String> values) {
            addCriterion("device_gps_id in", values, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdNotIn(List<String> values) {
            addCriterion("device_gps_id not in", values, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdBetween(String value1, String value2) {
            addCriterion("device_gps_id between", value1, value2, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andDeviceGpsIdNotBetween(String value1, String value2) {
            addCriterion("device_gps_id not between", value1, value2, "deviceGpsId");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadIsNull() {
            addCriterion("allowable_load is null");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadIsNotNull() {
            addCriterion("allowable_load is not null");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadEqualTo(BigDecimal value) {
            addCriterion("allowable_load =", value, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadNotEqualTo(BigDecimal value) {
            addCriterion("allowable_load <>", value, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadGreaterThan(BigDecimal value) {
            addCriterion("allowable_load >", value, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allowable_load >=", value, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadLessThan(BigDecimal value) {
            addCriterion("allowable_load <", value, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allowable_load <=", value, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadIn(List<BigDecimal> values) {
            addCriterion("allowable_load in", values, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadNotIn(List<BigDecimal> values) {
            addCriterion("allowable_load not in", values, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allowable_load between", value1, value2, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableLoadNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allowable_load not between", value1, value2, "allowableLoad");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeIsNull() {
            addCriterion("allowable_volume is null");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeIsNotNull() {
            addCriterion("allowable_volume is not null");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeEqualTo(BigDecimal value) {
            addCriterion("allowable_volume =", value, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeNotEqualTo(BigDecimal value) {
            addCriterion("allowable_volume <>", value, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeGreaterThan(BigDecimal value) {
            addCriterion("allowable_volume >", value, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allowable_volume >=", value, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeLessThan(BigDecimal value) {
            addCriterion("allowable_volume <", value, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allowable_volume <=", value, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeIn(List<BigDecimal> values) {
            addCriterion("allowable_volume in", values, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeNotIn(List<BigDecimal> values) {
            addCriterion("allowable_volume not in", values, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allowable_volume between", value1, value2, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andAllowableVolumeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allowable_volume not between", value1, value2, "allowableVolume");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdIsNull() {
            addCriterion("truck_license_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdIsNotNull() {
            addCriterion("truck_license_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdEqualTo(String value) {
            addCriterion("truck_license_id =", value, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdNotEqualTo(String value) {
            addCriterion("truck_license_id <>", value, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdGreaterThan(String value) {
            addCriterion("truck_license_id >", value, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdGreaterThanOrEqualTo(String value) {
            addCriterion("truck_license_id >=", value, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdLessThan(String value) {
            addCriterion("truck_license_id <", value, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdLessThanOrEqualTo(String value) {
            addCriterion("truck_license_id <=", value, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdLike(String value) {
            addCriterion("truck_license_id like", value, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdNotLike(String value) {
            addCriterion("truck_license_id not like", value, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdIn(List<String> values) {
            addCriterion("truck_license_id in", values, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdNotIn(List<String> values) {
            addCriterion("truck_license_id not in", values, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdBetween(String value1, String value2) {
            addCriterion("truck_license_id between", value1, value2, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andTruckLicenseIdNotBetween(String value1, String value2) {
            addCriterion("truck_license_id not between", value1, value2, "truckLicenseId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}