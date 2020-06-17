package com.warrior.mercury.model.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class TPhonenumberusinglogExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public TPhonenumberusinglogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andPhoneNumberUsingLogIDIsNull() {
            addCriterion("PhoneNumberUsingLogID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDIsNotNull() {
            addCriterion("PhoneNumberUsingLogID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDEqualTo(Integer value) {
            addCriterion("PhoneNumberUsingLogID =", value, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDNotEqualTo(Integer value) {
            addCriterion("PhoneNumberUsingLogID <>", value, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDGreaterThan(Integer value) {
            addCriterion("PhoneNumberUsingLogID >", value, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberUsingLogID >=", value, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDLessThan(Integer value) {
            addCriterion("PhoneNumberUsingLogID <", value, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberUsingLogID <=", value, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDIn(List<Integer> values) {
            addCriterion("PhoneNumberUsingLogID in", values, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDNotIn(List<Integer> values) {
            addCriterion("PhoneNumberUsingLogID not in", values, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberUsingLogID between", value1, value2, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUsingLogIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberUsingLogID not between", value1, value2, "phoneNumberUsingLogID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDIsNull() {
            addCriterion("PhoneNumberID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDIsNotNull() {
            addCriterion("PhoneNumberID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDEqualTo(Integer value) {
            addCriterion("PhoneNumberID =", value, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDNotEqualTo(Integer value) {
            addCriterion("PhoneNumberID <>", value, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDGreaterThan(Integer value) {
            addCriterion("PhoneNumberID >", value, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberID >=", value, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDLessThan(Integer value) {
            addCriterion("PhoneNumberID <", value, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberID <=", value, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDIn(List<Integer> values) {
            addCriterion("PhoneNumberID in", values, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDNotIn(List<Integer> values) {
            addCriterion("PhoneNumberID not in", values, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberID between", value1, value2, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberID not between", value1, value2, "phoneNumberID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDIsNull() {
            addCriterion("PhoneNumberPurposeID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDIsNotNull() {
            addCriterion("PhoneNumberPurposeID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDEqualTo(Integer value) {
            addCriterion("PhoneNumberPurposeID =", value, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDNotEqualTo(Integer value) {
            addCriterion("PhoneNumberPurposeID <>", value, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDGreaterThan(Integer value) {
            addCriterion("PhoneNumberPurposeID >", value, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberPurposeID >=", value, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDLessThan(Integer value) {
            addCriterion("PhoneNumberPurposeID <", value, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberPurposeID <=", value, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDIn(List<Integer> values) {
            addCriterion("PhoneNumberPurposeID in", values, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDNotIn(List<Integer> values) {
            addCriterion("PhoneNumberPurposeID not in", values, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberPurposeID between", value1, value2, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberPurposeIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberPurposeID not between", value1, value2, "phoneNumberPurposeID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDIsNull() {
            addCriterion("PhoneNumberUserPersonID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDIsNotNull() {
            addCriterion("PhoneNumberUserPersonID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDEqualTo(Integer value) {
            addCriterion("PhoneNumberUserPersonID =", value, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDNotEqualTo(Integer value) {
            addCriterion("PhoneNumberUserPersonID <>", value, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDGreaterThan(Integer value) {
            addCriterion("PhoneNumberUserPersonID >", value, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberUserPersonID >=", value, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDLessThan(Integer value) {
            addCriterion("PhoneNumberUserPersonID <", value, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberUserPersonID <=", value, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDIn(List<Integer> values) {
            addCriterion("PhoneNumberUserPersonID in", values, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDNotIn(List<Integer> values) {
            addCriterion("PhoneNumberUserPersonID not in", values, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberUserPersonID between", value1, value2, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberUserPersonIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberUserPersonID not between", value1, value2, "phoneNumberUserPersonID");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNull() {
            addCriterion("PackageType is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNotNull() {
            addCriterion("PackageType is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeEqualTo(String value) {
            addCriterion("PackageType =", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotEqualTo(String value) {
            addCriterion("PackageType <>", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThan(String value) {
            addCriterion("PackageType >", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PackageType >=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThan(String value) {
            addCriterion("PackageType <", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThanOrEqualTo(String value) {
            addCriterion("PackageType <=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLike(String value) {
            addCriterion("PackageType like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotLike(String value) {
            addCriterion("PackageType not like", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIn(List<String> values) {
            addCriterion("PackageType in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotIn(List<String> values) {
            addCriterion("PackageType not in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeBetween(String value1, String value2) {
            addCriterion("PackageType between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotBetween(String value1, String value2) {
            addCriterion("PackageType not between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDIsNull() {
            addCriterion("PhoneNumberStateID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDIsNotNull() {
            addCriterion("PhoneNumberStateID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDEqualTo(Integer value) {
            addCriterion("PhoneNumberStateID =", value, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDNotEqualTo(Integer value) {
            addCriterion("PhoneNumberStateID <>", value, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDGreaterThan(Integer value) {
            addCriterion("PhoneNumberStateID >", value, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberStateID >=", value, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDLessThan(Integer value) {
            addCriterion("PhoneNumberStateID <", value, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneNumberStateID <=", value, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDIn(List<Integer> values) {
            addCriterion("PhoneNumberStateID in", values, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDNotIn(List<Integer> values) {
            addCriterion("PhoneNumberStateID not in", values, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberStateID between", value1, value2, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andPhoneNumberStateIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneNumberStateID not between", value1, value2, "phoneNumberStateID");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeIsNull() {
            addCriterion("CreatedDateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeIsNotNull() {
            addCriterion("CreatedDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeEqualTo(String value) {
            addCriterion("CreatedDateTime =", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeNotEqualTo(String value) {
            addCriterion("CreatedDateTime <>", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeGreaterThan(String value) {
            addCriterion("CreatedDateTime >", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CreatedDateTime >=", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeLessThan(String value) {
            addCriterion("CreatedDateTime <", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeLessThanOrEqualTo(String value) {
            addCriterion("CreatedDateTime <=", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeLike(String value) {
            addCriterion("CreatedDateTime like", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeNotLike(String value) {
            addCriterion("CreatedDateTime not like", value, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeIn(List<String> values) {
            addCriterion("CreatedDateTime in", values, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeNotIn(List<String> values) {
            addCriterion("CreatedDateTime not in", values, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeBetween(String value1, String value2) {
            addCriterion("CreatedDateTime between", value1, value2, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andCreatedDateTimeNotBetween(String value1, String value2) {
            addCriterion("CreatedDateTime not between", value1, value2, "createdDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeIsNull() {
            addCriterion("StartedDateTime is null");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeIsNotNull() {
            addCriterion("StartedDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeEqualTo(String value) {
            addCriterion("StartedDateTime =", value, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeNotEqualTo(String value) {
            addCriterion("StartedDateTime <>", value, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeGreaterThan(String value) {
            addCriterion("StartedDateTime >", value, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("StartedDateTime >=", value, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeLessThan(String value) {
            addCriterion("StartedDateTime <", value, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeLessThanOrEqualTo(String value) {
            addCriterion("StartedDateTime <=", value, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeLike(String value) {
            addCriterion("StartedDateTime like", value, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeNotLike(String value) {
            addCriterion("StartedDateTime not like", value, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeIn(List<String> values) {
            addCriterion("StartedDateTime in", values, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeNotIn(List<String> values) {
            addCriterion("StartedDateTime not in", values, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeBetween(String value1, String value2) {
            addCriterion("StartedDateTime between", value1, value2, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andStartedDateTimeNotBetween(String value1, String value2) {
            addCriterion("StartedDateTime not between", value1, value2, "startedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeIsNull() {
            addCriterion("EndedDateTime is null");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeIsNotNull() {
            addCriterion("EndedDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeEqualTo(String value) {
            addCriterion("EndedDateTime =", value, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeNotEqualTo(String value) {
            addCriterion("EndedDateTime <>", value, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeGreaterThan(String value) {
            addCriterion("EndedDateTime >", value, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EndedDateTime >=", value, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeLessThan(String value) {
            addCriterion("EndedDateTime <", value, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeLessThanOrEqualTo(String value) {
            addCriterion("EndedDateTime <=", value, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeLike(String value) {
            addCriterion("EndedDateTime like", value, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeNotLike(String value) {
            addCriterion("EndedDateTime not like", value, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeIn(List<String> values) {
            addCriterion("EndedDateTime in", values, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeNotIn(List<String> values) {
            addCriterion("EndedDateTime not in", values, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeBetween(String value1, String value2) {
            addCriterion("EndedDateTime between", value1, value2, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andEndedDateTimeNotBetween(String value1, String value2) {
            addCriterion("EndedDateTime not between", value1, value2, "endedDateTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("Remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("Remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("Remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("Remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("Remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("Remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("Remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("Remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("Remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("Remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("Remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("Remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("Remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDIsNull() {
            addCriterion("ParentPhoneNumberID is null");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDIsNotNull() {
            addCriterion("ParentPhoneNumberID is not null");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDEqualTo(Integer value) {
            addCriterion("ParentPhoneNumberID =", value, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDNotEqualTo(Integer value) {
            addCriterion("ParentPhoneNumberID <>", value, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDGreaterThan(Integer value) {
            addCriterion("ParentPhoneNumberID >", value, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ParentPhoneNumberID >=", value, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDLessThan(Integer value) {
            addCriterion("ParentPhoneNumberID <", value, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDLessThanOrEqualTo(Integer value) {
            addCriterion("ParentPhoneNumberID <=", value, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDIn(List<Integer> values) {
            addCriterion("ParentPhoneNumberID in", values, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDNotIn(List<Integer> values) {
            addCriterion("ParentPhoneNumberID not in", values, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDBetween(Integer value1, Integer value2) {
            addCriterion("ParentPhoneNumberID between", value1, value2, "parentPhoneNumberID");
            return (Criteria) this;
        }

        public Criteria andParentPhoneNumberIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ParentPhoneNumberID not between", value1, value2, "parentPhoneNumberID");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_phonenumberusinglog
     *
     * @mbg.generated
     */
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