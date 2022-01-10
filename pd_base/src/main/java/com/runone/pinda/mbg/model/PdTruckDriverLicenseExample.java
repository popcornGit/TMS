package com.runone.pinda.mbg.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PdTruckDriverLicenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PdTruckDriverLicenseExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeIsNull() {
            addCriterion("allowable_type is null");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeIsNotNull() {
            addCriterion("allowable_type is not null");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeEqualTo(String value) {
            addCriterion("allowable_type =", value, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeNotEqualTo(String value) {
            addCriterion("allowable_type <>", value, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeGreaterThan(String value) {
            addCriterion("allowable_type >", value, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeGreaterThanOrEqualTo(String value) {
            addCriterion("allowable_type >=", value, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeLessThan(String value) {
            addCriterion("allowable_type <", value, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeLessThanOrEqualTo(String value) {
            addCriterion("allowable_type <=", value, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeLike(String value) {
            addCriterion("allowable_type like", value, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeNotLike(String value) {
            addCriterion("allowable_type not like", value, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeIn(List<String> values) {
            addCriterion("allowable_type in", values, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeNotIn(List<String> values) {
            addCriterion("allowable_type not in", values, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeBetween(String value1, String value2) {
            addCriterion("allowable_type between", value1, value2, "allowableType");
            return (Criteria) this;
        }

        public Criteria andAllowableTypeNotBetween(String value1, String value2) {
            addCriterion("allowable_type not between", value1, value2, "allowableType");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateIsNull() {
            addCriterion("initial_certificate_date is null");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateIsNotNull() {
            addCriterion("initial_certificate_date is not null");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateEqualTo(Date value) {
            addCriterionForJDBCDate("initial_certificate_date =", value, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("initial_certificate_date <>", value, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateGreaterThan(Date value) {
            addCriterionForJDBCDate("initial_certificate_date >", value, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("initial_certificate_date >=", value, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateLessThan(Date value) {
            addCriterionForJDBCDate("initial_certificate_date <", value, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("initial_certificate_date <=", value, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateIn(List<Date> values) {
            addCriterionForJDBCDate("initial_certificate_date in", values, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("initial_certificate_date not in", values, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("initial_certificate_date between", value1, value2, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andInitialCertificateDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("initial_certificate_date not between", value1, value2, "initialCertificateDate");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIsNull() {
            addCriterion("valid_period is null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIsNotNull() {
            addCriterion("valid_period is not null");
            return (Criteria) this;
        }

        public Criteria andValidPeriodEqualTo(String value) {
            addCriterion("valid_period =", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotEqualTo(String value) {
            addCriterion("valid_period <>", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodGreaterThan(String value) {
            addCriterion("valid_period >", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("valid_period >=", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLessThan(String value) {
            addCriterion("valid_period <", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLessThanOrEqualTo(String value) {
            addCriterion("valid_period <=", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodLike(String value) {
            addCriterion("valid_period like", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotLike(String value) {
            addCriterion("valid_period not like", value, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodIn(List<String> values) {
            addCriterion("valid_period in", values, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotIn(List<String> values) {
            addCriterion("valid_period not in", values, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodBetween(String value1, String value2) {
            addCriterion("valid_period between", value1, value2, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andValidPeriodNotBetween(String value1, String value2) {
            addCriterion("valid_period not between", value1, value2, "validPeriod");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNull() {
            addCriterion("license_number is null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIsNotNull() {
            addCriterion("license_number is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberEqualTo(String value) {
            addCriterion("license_number =", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotEqualTo(String value) {
            addCriterion("license_number <>", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThan(String value) {
            addCriterion("license_number >", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberGreaterThanOrEqualTo(String value) {
            addCriterion("license_number >=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThan(String value) {
            addCriterion("license_number <", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLessThanOrEqualTo(String value) {
            addCriterion("license_number <=", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberLike(String value) {
            addCriterion("license_number like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotLike(String value) {
            addCriterion("license_number not like", value, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberIn(List<String> values) {
            addCriterion("license_number in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotIn(List<String> values) {
            addCriterion("license_number not in", values, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberBetween(String value1, String value2) {
            addCriterion("license_number between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andLicenseNumberNotBetween(String value1, String value2) {
            addCriterion("license_number not between", value1, value2, "licenseNumber");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIsNull() {
            addCriterion("driver_age is null");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIsNotNull() {
            addCriterion("driver_age is not null");
            return (Criteria) this;
        }

        public Criteria andDriverAgeEqualTo(Integer value) {
            addCriterion("driver_age =", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotEqualTo(Integer value) {
            addCriterion("driver_age <>", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeGreaterThan(Integer value) {
            addCriterion("driver_age >", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_age >=", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeLessThan(Integer value) {
            addCriterion("driver_age <", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeLessThanOrEqualTo(Integer value) {
            addCriterion("driver_age <=", value, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeIn(List<Integer> values) {
            addCriterion("driver_age in", values, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotIn(List<Integer> values) {
            addCriterion("driver_age not in", values, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeBetween(Integer value1, Integer value2) {
            addCriterion("driver_age between", value1, value2, "driverAge");
            return (Criteria) this;
        }

        public Criteria andDriverAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_age not between", value1, value2, "driverAge");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNull() {
            addCriterion("license_type is null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIsNotNull() {
            addCriterion("license_type is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeEqualTo(String value) {
            addCriterion("license_type =", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotEqualTo(String value) {
            addCriterion("license_type <>", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThan(String value) {
            addCriterion("license_type >", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("license_type >=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThan(String value) {
            addCriterion("license_type <", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLessThanOrEqualTo(String value) {
            addCriterion("license_type <=", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeLike(String value) {
            addCriterion("license_type like", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotLike(String value) {
            addCriterion("license_type not like", value, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeIn(List<String> values) {
            addCriterion("license_type in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotIn(List<String> values) {
            addCriterion("license_type not in", values, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeBetween(String value1, String value2) {
            addCriterion("license_type between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andLicenseTypeNotBetween(String value1, String value2) {
            addCriterion("license_type not between", value1, value2, "licenseType");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateIsNull() {
            addCriterion("qualification_certificate is null");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateIsNotNull() {
            addCriterion("qualification_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateEqualTo(String value) {
            addCriterion("qualification_certificate =", value, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateNotEqualTo(String value) {
            addCriterion("qualification_certificate <>", value, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateGreaterThan(String value) {
            addCriterion("qualification_certificate >", value, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_certificate >=", value, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateLessThan(String value) {
            addCriterion("qualification_certificate <", value, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateLessThanOrEqualTo(String value) {
            addCriterion("qualification_certificate <=", value, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateLike(String value) {
            addCriterion("qualification_certificate like", value, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateNotLike(String value) {
            addCriterion("qualification_certificate not like", value, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateIn(List<String> values) {
            addCriterion("qualification_certificate in", values, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateNotIn(List<String> values) {
            addCriterion("qualification_certificate not in", values, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateBetween(String value1, String value2) {
            addCriterion("qualification_certificate between", value1, value2, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andQualificationCertificateNotBetween(String value1, String value2) {
            addCriterion("qualification_certificate not between", value1, value2, "qualificationCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateIsNull() {
            addCriterion("pass_certificate is null");
            return (Criteria) this;
        }

        public Criteria andPassCertificateIsNotNull() {
            addCriterion("pass_certificate is not null");
            return (Criteria) this;
        }

        public Criteria andPassCertificateEqualTo(String value) {
            addCriterion("pass_certificate =", value, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateNotEqualTo(String value) {
            addCriterion("pass_certificate <>", value, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateGreaterThan(String value) {
            addCriterion("pass_certificate >", value, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateGreaterThanOrEqualTo(String value) {
            addCriterion("pass_certificate >=", value, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateLessThan(String value) {
            addCriterion("pass_certificate <", value, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateLessThanOrEqualTo(String value) {
            addCriterion("pass_certificate <=", value, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateLike(String value) {
            addCriterion("pass_certificate like", value, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateNotLike(String value) {
            addCriterion("pass_certificate not like", value, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateIn(List<String> values) {
            addCriterion("pass_certificate in", values, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateNotIn(List<String> values) {
            addCriterion("pass_certificate not in", values, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateBetween(String value1, String value2) {
            addCriterion("pass_certificate between", value1, value2, "passCertificate");
            return (Criteria) this;
        }

        public Criteria andPassCertificateNotBetween(String value1, String value2) {
            addCriterion("pass_certificate not between", value1, value2, "passCertificate");
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