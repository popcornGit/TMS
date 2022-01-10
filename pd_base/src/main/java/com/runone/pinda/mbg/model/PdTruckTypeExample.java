package com.runone.pinda.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PdTruckTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdTruckTypeExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andMeasureLongIsNull() {
            addCriterion("measure_long is null");
            return (Criteria) this;
        }

        public Criteria andMeasureLongIsNotNull() {
            addCriterion("measure_long is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureLongEqualTo(BigDecimal value) {
            addCriterion("measure_long =", value, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongNotEqualTo(BigDecimal value) {
            addCriterion("measure_long <>", value, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongGreaterThan(BigDecimal value) {
            addCriterion("measure_long >", value, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("measure_long >=", value, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongLessThan(BigDecimal value) {
            addCriterion("measure_long <", value, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("measure_long <=", value, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongIn(List<BigDecimal> values) {
            addCriterion("measure_long in", values, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongNotIn(List<BigDecimal> values) {
            addCriterion("measure_long not in", values, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("measure_long between", value1, value2, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureLongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("measure_long not between", value1, value2, "measureLong");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthIsNull() {
            addCriterion("measure_width is null");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthIsNotNull() {
            addCriterion("measure_width is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthEqualTo(BigDecimal value) {
            addCriterion("measure_width =", value, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthNotEqualTo(BigDecimal value) {
            addCriterion("measure_width <>", value, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthGreaterThan(BigDecimal value) {
            addCriterion("measure_width >", value, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("measure_width >=", value, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthLessThan(BigDecimal value) {
            addCriterion("measure_width <", value, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("measure_width <=", value, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthIn(List<BigDecimal> values) {
            addCriterion("measure_width in", values, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthNotIn(List<BigDecimal> values) {
            addCriterion("measure_width not in", values, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("measure_width between", value1, value2, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureWidthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("measure_width not between", value1, value2, "measureWidth");
            return (Criteria) this;
        }

        public Criteria andMeasureHighIsNull() {
            addCriterion("measure_high is null");
            return (Criteria) this;
        }

        public Criteria andMeasureHighIsNotNull() {
            addCriterion("measure_high is not null");
            return (Criteria) this;
        }

        public Criteria andMeasureHighEqualTo(BigDecimal value) {
            addCriterion("measure_high =", value, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighNotEqualTo(BigDecimal value) {
            addCriterion("measure_high <>", value, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighGreaterThan(BigDecimal value) {
            addCriterion("measure_high >", value, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("measure_high >=", value, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighLessThan(BigDecimal value) {
            addCriterion("measure_high <", value, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighLessThanOrEqualTo(BigDecimal value) {
            addCriterion("measure_high <=", value, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighIn(List<BigDecimal> values) {
            addCriterion("measure_high in", values, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighNotIn(List<BigDecimal> values) {
            addCriterion("measure_high not in", values, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("measure_high between", value1, value2, "measureHigh");
            return (Criteria) this;
        }

        public Criteria andMeasureHighNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("measure_high not between", value1, value2, "measureHigh");
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