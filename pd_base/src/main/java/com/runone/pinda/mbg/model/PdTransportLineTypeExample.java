package com.runone.pinda.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PdTransportLineTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdTransportLineTypeExample() {
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

        public Criteria andTypeNumberIsNull() {
            addCriterion("type_number is null");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIsNotNull() {
            addCriterion("type_number is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNumberEqualTo(String value) {
            addCriterion("type_number =", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotEqualTo(String value) {
            addCriterion("type_number <>", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberGreaterThan(String value) {
            addCriterion("type_number >", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("type_number >=", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLessThan(String value) {
            addCriterion("type_number <", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLessThanOrEqualTo(String value) {
            addCriterion("type_number <=", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberLike(String value) {
            addCriterion("type_number like", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotLike(String value) {
            addCriterion("type_number not like", value, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberIn(List<String> values) {
            addCriterion("type_number in", values, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotIn(List<String> values) {
            addCriterion("type_number not in", values, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberBetween(String value1, String value2) {
            addCriterion("type_number between", value1, value2, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andTypeNumberNotBetween(String value1, String value2) {
            addCriterion("type_number not between", value1, value2, "typeNumber");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeIsNull() {
            addCriterion("start_agency_type is null");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeIsNotNull() {
            addCriterion("start_agency_type is not null");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeEqualTo(Integer value) {
            addCriterion("start_agency_type =", value, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeNotEqualTo(Integer value) {
            addCriterion("start_agency_type <>", value, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeGreaterThan(Integer value) {
            addCriterion("start_agency_type >", value, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_agency_type >=", value, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeLessThan(Integer value) {
            addCriterion("start_agency_type <", value, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("start_agency_type <=", value, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeIn(List<Integer> values) {
            addCriterion("start_agency_type in", values, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeNotIn(List<Integer> values) {
            addCriterion("start_agency_type not in", values, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeBetween(Integer value1, Integer value2) {
            addCriterion("start_agency_type between", value1, value2, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andStartAgencyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("start_agency_type not between", value1, value2, "startAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeIsNull() {
            addCriterion("end_agency_type is null");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeIsNotNull() {
            addCriterion("end_agency_type is not null");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeEqualTo(Integer value) {
            addCriterion("end_agency_type =", value, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeNotEqualTo(Integer value) {
            addCriterion("end_agency_type <>", value, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeGreaterThan(Integer value) {
            addCriterion("end_agency_type >", value, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_agency_type >=", value, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeLessThan(Integer value) {
            addCriterion("end_agency_type <", value, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("end_agency_type <=", value, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeIn(List<Integer> values) {
            addCriterion("end_agency_type in", values, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeNotIn(List<Integer> values) {
            addCriterion("end_agency_type not in", values, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeBetween(Integer value1, Integer value2) {
            addCriterion("end_agency_type between", value1, value2, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andEndAgencyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_agency_type not between", value1, value2, "endAgencyType");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNull() {
            addCriterion("updater is null");
            return (Criteria) this;
        }

        public Criteria andUpdaterIsNotNull() {
            addCriterion("updater is not null");
            return (Criteria) this;
        }

        public Criteria andUpdaterEqualTo(String value) {
            addCriterion("updater =", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotEqualTo(String value) {
            addCriterion("updater <>", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThan(String value) {
            addCriterion("updater >", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterGreaterThanOrEqualTo(String value) {
            addCriterion("updater >=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThan(String value) {
            addCriterion("updater <", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLessThanOrEqualTo(String value) {
            addCriterion("updater <=", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterLike(String value) {
            addCriterion("updater like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotLike(String value) {
            addCriterion("updater not like", value, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterIn(List<String> values) {
            addCriterion("updater in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotIn(List<String> values) {
            addCriterion("updater not in", values, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterBetween(String value1, String value2) {
            addCriterion("updater between", value1, value2, "updater");
            return (Criteria) this;
        }

        public Criteria andUpdaterNotBetween(String value1, String value2) {
            addCriterion("updater not between", value1, value2, "updater");
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