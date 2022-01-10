package com.runone.pinda.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PdTransportLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdTransportLineExample() {
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

        public Criteria andLineNumberIsNull() {
            addCriterion("line_number is null");
            return (Criteria) this;
        }

        public Criteria andLineNumberIsNotNull() {
            addCriterion("line_number is not null");
            return (Criteria) this;
        }

        public Criteria andLineNumberEqualTo(String value) {
            addCriterion("line_number =", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotEqualTo(String value) {
            addCriterion("line_number <>", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberGreaterThan(String value) {
            addCriterion("line_number >", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("line_number >=", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLessThan(String value) {
            addCriterion("line_number <", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLessThanOrEqualTo(String value) {
            addCriterion("line_number <=", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberLike(String value) {
            addCriterion("line_number like", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotLike(String value) {
            addCriterion("line_number not like", value, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberIn(List<String> values) {
            addCriterion("line_number in", values, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotIn(List<String> values) {
            addCriterion("line_number not in", values, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberBetween(String value1, String value2) {
            addCriterion("line_number between", value1, value2, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andLineNumberNotBetween(String value1, String value2) {
            addCriterion("line_number not between", value1, value2, "lineNumber");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(String value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(String value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(String value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(String value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(String value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLike(String value) {
            addCriterion("agency_id like", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotLike(String value) {
            addCriterion("agency_id not like", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<String> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<String> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(String value1, String value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(String value1, String value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdIsNull() {
            addCriterion("transport_line_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdIsNotNull() {
            addCriterion("transport_line_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdEqualTo(String value) {
            addCriterion("transport_line_type_id =", value, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdNotEqualTo(String value) {
            addCriterion("transport_line_type_id <>", value, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdGreaterThan(String value) {
            addCriterion("transport_line_type_id >", value, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("transport_line_type_id >=", value, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdLessThan(String value) {
            addCriterion("transport_line_type_id <", value, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdLessThanOrEqualTo(String value) {
            addCriterion("transport_line_type_id <=", value, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdLike(String value) {
            addCriterion("transport_line_type_id like", value, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdNotLike(String value) {
            addCriterion("transport_line_type_id not like", value, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdIn(List<String> values) {
            addCriterion("transport_line_type_id in", values, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdNotIn(List<String> values) {
            addCriterion("transport_line_type_id not in", values, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdBetween(String value1, String value2) {
            addCriterion("transport_line_type_id between", value1, value2, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andTransportLineTypeIdNotBetween(String value1, String value2) {
            addCriterion("transport_line_type_id not between", value1, value2, "transportLineTypeId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdIsNull() {
            addCriterion("start_agency_id is null");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdIsNotNull() {
            addCriterion("start_agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdEqualTo(String value) {
            addCriterion("start_agency_id =", value, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdNotEqualTo(String value) {
            addCriterion("start_agency_id <>", value, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdGreaterThan(String value) {
            addCriterion("start_agency_id >", value, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("start_agency_id >=", value, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdLessThan(String value) {
            addCriterion("start_agency_id <", value, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdLessThanOrEqualTo(String value) {
            addCriterion("start_agency_id <=", value, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdLike(String value) {
            addCriterion("start_agency_id like", value, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdNotLike(String value) {
            addCriterion("start_agency_id not like", value, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdIn(List<String> values) {
            addCriterion("start_agency_id in", values, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdNotIn(List<String> values) {
            addCriterion("start_agency_id not in", values, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdBetween(String value1, String value2) {
            addCriterion("start_agency_id between", value1, value2, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andStartAgencyIdNotBetween(String value1, String value2) {
            addCriterion("start_agency_id not between", value1, value2, "startAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdIsNull() {
            addCriterion("end_agency_id is null");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdIsNotNull() {
            addCriterion("end_agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdEqualTo(String value) {
            addCriterion("end_agency_id =", value, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdNotEqualTo(String value) {
            addCriterion("end_agency_id <>", value, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdGreaterThan(String value) {
            addCriterion("end_agency_id >", value, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdGreaterThanOrEqualTo(String value) {
            addCriterion("end_agency_id >=", value, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdLessThan(String value) {
            addCriterion("end_agency_id <", value, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdLessThanOrEqualTo(String value) {
            addCriterion("end_agency_id <=", value, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdLike(String value) {
            addCriterion("end_agency_id like", value, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdNotLike(String value) {
            addCriterion("end_agency_id not like", value, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdIn(List<String> values) {
            addCriterion("end_agency_id in", values, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdNotIn(List<String> values) {
            addCriterion("end_agency_id not in", values, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdBetween(String value1, String value2) {
            addCriterion("end_agency_id between", value1, value2, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andEndAgencyIdNotBetween(String value1, String value2) {
            addCriterion("end_agency_id not between", value1, value2, "endAgencyId");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(BigDecimal value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(BigDecimal value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(BigDecimal value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(BigDecimal value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<BigDecimal> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<BigDecimal> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andCostIsNull() {
            addCriterion("cost is null");
            return (Criteria) this;
        }

        public Criteria andCostIsNotNull() {
            addCriterion("cost is not null");
            return (Criteria) this;
        }

        public Criteria andCostEqualTo(BigDecimal value) {
            addCriterion("cost =", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotEqualTo(BigDecimal value) {
            addCriterion("cost <>", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThan(BigDecimal value) {
            addCriterion("cost >", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost >=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThan(BigDecimal value) {
            addCriterion("cost <", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost <=", value, "cost");
            return (Criteria) this;
        }

        public Criteria andCostIn(List<BigDecimal> values) {
            addCriterion("cost in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotIn(List<BigDecimal> values) {
            addCriterion("cost not in", values, "cost");
            return (Criteria) this;
        }

        public Criteria andCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost not between", value1, value2, "cost");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeIsNull() {
            addCriterion("estimated_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeIsNotNull() {
            addCriterion("estimated_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeEqualTo(BigDecimal value) {
            addCriterion("estimated_time =", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotEqualTo(BigDecimal value) {
            addCriterion("estimated_time <>", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeGreaterThan(BigDecimal value) {
            addCriterion("estimated_time >", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("estimated_time >=", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeLessThan(BigDecimal value) {
            addCriterion("estimated_time <", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("estimated_time <=", value, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeIn(List<BigDecimal> values) {
            addCriterion("estimated_time in", values, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotIn(List<BigDecimal> values) {
            addCriterion("estimated_time not in", values, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimated_time between", value1, value2, "estimatedTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("estimated_time not between", value1, value2, "estimatedTime");
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