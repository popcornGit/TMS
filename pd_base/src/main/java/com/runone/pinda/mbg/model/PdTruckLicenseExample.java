package com.runone.pinda.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PdTruckLicenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdTruckLicenseExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andTruckIdIsNull() {
            addCriterion("truck_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNotNull() {
            addCriterion("truck_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckIdEqualTo(String value) {
            addCriterion("truck_id =", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotEqualTo(String value) {
            addCriterion("truck_id <>", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThan(String value) {
            addCriterion("truck_id >", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThanOrEqualTo(String value) {
            addCriterion("truck_id >=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThan(String value) {
            addCriterion("truck_id <", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThanOrEqualTo(String value) {
            addCriterion("truck_id <=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLike(String value) {
            addCriterion("truck_id like", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotLike(String value) {
            addCriterion("truck_id not like", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdIn(List<String> values) {
            addCriterion("truck_id in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotIn(List<String> values) {
            addCriterion("truck_id not in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdBetween(String value1, String value2) {
            addCriterion("truck_id between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotBetween(String value1, String value2) {
            addCriterion("truck_id not between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNull() {
            addCriterion("engine_number is null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIsNotNull() {
            addCriterion("engine_number is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNumberEqualTo(String value) {
            addCriterion("engine_number =", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotEqualTo(String value) {
            addCriterion("engine_number <>", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThan(String value) {
            addCriterion("engine_number >", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberGreaterThanOrEqualTo(String value) {
            addCriterion("engine_number >=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThan(String value) {
            addCriterion("engine_number <", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLessThanOrEqualTo(String value) {
            addCriterion("engine_number <=", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberLike(String value) {
            addCriterion("engine_number like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotLike(String value) {
            addCriterion("engine_number not like", value, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberIn(List<String> values) {
            addCriterion("engine_number in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotIn(List<String> values) {
            addCriterion("engine_number not in", values, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberBetween(String value1, String value2) {
            addCriterion("engine_number between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andEngineNumberNotBetween(String value1, String value2) {
            addCriterion("engine_number not between", value1, value2, "engineNumber");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNull() {
            addCriterion("registration_date is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIsNotNull() {
            addCriterion("registration_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateEqualTo(Date value) {
            addCriterionForJDBCDate("registration_date =", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("registration_date <>", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("registration_date >", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registration_date >=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThan(Date value) {
            addCriterionForJDBCDate("registration_date <", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registration_date <=", value, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateIn(List<Date> values) {
            addCriterionForJDBCDate("registration_date in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("registration_date not in", values, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registration_date between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andRegistrationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registration_date not between", value1, value2, "registrationDate");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapIsNull() {
            addCriterion("mandatory_scrap is null");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapIsNotNull() {
            addCriterion("mandatory_scrap is not null");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapEqualTo(Date value) {
            addCriterionForJDBCDate("mandatory_scrap =", value, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapNotEqualTo(Date value) {
            addCriterionForJDBCDate("mandatory_scrap <>", value, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapGreaterThan(Date value) {
            addCriterionForJDBCDate("mandatory_scrap >", value, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mandatory_scrap >=", value, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapLessThan(Date value) {
            addCriterionForJDBCDate("mandatory_scrap <", value, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mandatory_scrap <=", value, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapIn(List<Date> values) {
            addCriterionForJDBCDate("mandatory_scrap in", values, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapNotIn(List<Date> values) {
            addCriterionForJDBCDate("mandatory_scrap not in", values, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mandatory_scrap between", value1, value2, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andMandatoryScrapNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mandatory_scrap not between", value1, value2, "mandatoryScrap");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNull() {
            addCriterion("expiration_date is null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIsNotNull() {
            addCriterion("expiration_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpirationDateEqualTo(Date value) {
            addCriterionForJDBCDate("expiration_date =", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expiration_date <>", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expiration_date >", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiration_date >=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThan(Date value) {
            addCriterionForJDBCDate("expiration_date <", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expiration_date <=", value, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateIn(List<Date> values) {
            addCriterionForJDBCDate("expiration_date in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expiration_date not in", values, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiration_date between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andExpirationDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expiration_date not between", value1, value2, "expirationDate");
            return (Criteria) this;
        }

        public Criteria andOverallQualityIsNull() {
            addCriterion("overall_quality is null");
            return (Criteria) this;
        }

        public Criteria andOverallQualityIsNotNull() {
            addCriterion("overall_quality is not null");
            return (Criteria) this;
        }

        public Criteria andOverallQualityEqualTo(BigDecimal value) {
            addCriterion("overall_quality =", value, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityNotEqualTo(BigDecimal value) {
            addCriterion("overall_quality <>", value, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityGreaterThan(BigDecimal value) {
            addCriterion("overall_quality >", value, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("overall_quality >=", value, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityLessThan(BigDecimal value) {
            addCriterion("overall_quality <", value, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("overall_quality <=", value, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityIn(List<BigDecimal> values) {
            addCriterion("overall_quality in", values, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityNotIn(List<BigDecimal> values) {
            addCriterion("overall_quality not in", values, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overall_quality between", value1, value2, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andOverallQualityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("overall_quality not between", value1, value2, "overallQuality");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightIsNull() {
            addCriterion("allowable_weight is null");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightIsNotNull() {
            addCriterion("allowable_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightEqualTo(BigDecimal value) {
            addCriterion("allowable_weight =", value, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightNotEqualTo(BigDecimal value) {
            addCriterion("allowable_weight <>", value, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightGreaterThan(BigDecimal value) {
            addCriterion("allowable_weight >", value, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("allowable_weight >=", value, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightLessThan(BigDecimal value) {
            addCriterion("allowable_weight <", value, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("allowable_weight <=", value, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightIn(List<BigDecimal> values) {
            addCriterion("allowable_weight in", values, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightNotIn(List<BigDecimal> values) {
            addCriterion("allowable_weight not in", values, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allowable_weight between", value1, value2, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andAllowableWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("allowable_weight not between", value1, value2, "allowableWeight");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsIsNull() {
            addCriterion("outside_dimensions is null");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsIsNotNull() {
            addCriterion("outside_dimensions is not null");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsEqualTo(String value) {
            addCriterion("outside_dimensions =", value, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsNotEqualTo(String value) {
            addCriterion("outside_dimensions <>", value, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsGreaterThan(String value) {
            addCriterion("outside_dimensions >", value, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsGreaterThanOrEqualTo(String value) {
            addCriterion("outside_dimensions >=", value, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsLessThan(String value) {
            addCriterion("outside_dimensions <", value, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsLessThanOrEqualTo(String value) {
            addCriterion("outside_dimensions <=", value, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsLike(String value) {
            addCriterion("outside_dimensions like", value, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsNotLike(String value) {
            addCriterion("outside_dimensions not like", value, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsIn(List<String> values) {
            addCriterion("outside_dimensions in", values, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsNotIn(List<String> values) {
            addCriterion("outside_dimensions not in", values, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsBetween(String value1, String value2) {
            addCriterion("outside_dimensions between", value1, value2, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andOutsideDimensionsNotBetween(String value1, String value2) {
            addCriterion("outside_dimensions not between", value1, value2, "outsideDimensions");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNull() {
            addCriterion("validity_period is null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIsNotNull() {
            addCriterion("validity_period is not null");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodEqualTo(Date value) {
            addCriterionForJDBCDate("validity_period =", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotEqualTo(Date value) {
            addCriterionForJDBCDate("validity_period <>", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThan(Date value) {
            addCriterionForJDBCDate("validity_period >", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validity_period >=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThan(Date value) {
            addCriterionForJDBCDate("validity_period <", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("validity_period <=", value, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodIn(List<Date> values) {
            addCriterionForJDBCDate("validity_period in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotIn(List<Date> values) {
            addCriterionForJDBCDate("validity_period not in", values, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validity_period between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andValidityPeriodNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("validity_period not between", value1, value2, "validityPeriod");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberIsNull() {
            addCriterion("transport_certificate_number is null");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberIsNotNull() {
            addCriterion("transport_certificate_number is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberEqualTo(String value) {
            addCriterion("transport_certificate_number =", value, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberNotEqualTo(String value) {
            addCriterion("transport_certificate_number <>", value, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberGreaterThan(String value) {
            addCriterion("transport_certificate_number >", value, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("transport_certificate_number >=", value, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberLessThan(String value) {
            addCriterion("transport_certificate_number <", value, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberLessThanOrEqualTo(String value) {
            addCriterion("transport_certificate_number <=", value, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberLike(String value) {
            addCriterion("transport_certificate_number like", value, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberNotLike(String value) {
            addCriterion("transport_certificate_number not like", value, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberIn(List<String> values) {
            addCriterion("transport_certificate_number in", values, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberNotIn(List<String> values) {
            addCriterion("transport_certificate_number not in", values, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberBetween(String value1, String value2) {
            addCriterion("transport_certificate_number between", value1, value2, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andTransportCertificateNumberNotBetween(String value1, String value2) {
            addCriterion("transport_certificate_number not between", value1, value2, "transportCertificateNumber");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
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