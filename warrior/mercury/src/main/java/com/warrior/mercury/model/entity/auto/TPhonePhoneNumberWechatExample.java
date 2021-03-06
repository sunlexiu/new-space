package com.warrior.mercury.model.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class TPhonePhoneNumberWechatExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    public TPhonePhoneNumberWechatExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
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
     * This method corresponds to the database table t_phone_phone_number_wechat
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
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
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
     * This class corresponds to the database table t_phone_phone_number_wechat
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

        public Criteria andPhonePhoneNumberWechatIDIsNull() {
            addCriterion("PhonePhoneNumberWechatID is null");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDIsNotNull() {
            addCriterion("PhonePhoneNumberWechatID is not null");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDEqualTo(Integer value) {
            addCriterion("PhonePhoneNumberWechatID =", value, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDNotEqualTo(Integer value) {
            addCriterion("PhonePhoneNumberWechatID <>", value, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDGreaterThan(Integer value) {
            addCriterion("PhonePhoneNumberWechatID >", value, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhonePhoneNumberWechatID >=", value, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDLessThan(Integer value) {
            addCriterion("PhonePhoneNumberWechatID <", value, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhonePhoneNumberWechatID <=", value, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDIn(List<Integer> values) {
            addCriterion("PhonePhoneNumberWechatID in", values, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDNotIn(List<Integer> values) {
            addCriterion("PhonePhoneNumberWechatID not in", values, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDBetween(Integer value1, Integer value2) {
            addCriterion("PhonePhoneNumberWechatID between", value1, value2, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhonePhoneNumberWechatIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhonePhoneNumberWechatID not between", value1, value2, "phonePhoneNumberWechatID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDIsNull() {
            addCriterion("PhoneID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIDIsNotNull() {
            addCriterion("PhoneID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneIDEqualTo(Integer value) {
            addCriterion("PhoneID =", value, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDNotEqualTo(Integer value) {
            addCriterion("PhoneID <>", value, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDGreaterThan(Integer value) {
            addCriterion("PhoneID >", value, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneID >=", value, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDLessThan(Integer value) {
            addCriterion("PhoneID <", value, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneID <=", value, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDIn(List<Integer> values) {
            addCriterion("PhoneID in", values, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDNotIn(List<Integer> values) {
            addCriterion("PhoneID not in", values, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDBetween(Integer value1, Integer value2) {
            addCriterion("PhoneID between", value1, value2, "phoneID");
            return (Criteria) this;
        }

        public Criteria andPhoneIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneID not between", value1, value2, "phoneID");
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

        public Criteria andOperationWechatIDIsNull() {
            addCriterion("OperationWechatID is null");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDIsNotNull() {
            addCriterion("OperationWechatID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDEqualTo(Integer value) {
            addCriterion("OperationWechatID =", value, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDNotEqualTo(Integer value) {
            addCriterion("OperationWechatID <>", value, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDGreaterThan(Integer value) {
            addCriterion("OperationWechatID >", value, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperationWechatID >=", value, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDLessThan(Integer value) {
            addCriterion("OperationWechatID <", value, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDLessThanOrEqualTo(Integer value) {
            addCriterion("OperationWechatID <=", value, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDIn(List<Integer> values) {
            addCriterion("OperationWechatID in", values, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDNotIn(List<Integer> values) {
            addCriterion("OperationWechatID not in", values, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDBetween(Integer value1, Integer value2) {
            addCriterion("OperationWechatID between", value1, value2, "operationWechatID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatIDNotBetween(Integer value1, Integer value2) {
            addCriterion("OperationWechatID not between", value1, value2, "operationWechatID");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_phone_phone_number_wechat
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
     * This class corresponds to the database table t_phone_phone_number_wechat
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