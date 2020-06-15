package com.warrior.mercury.model.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class TPhoneExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    public TPhoneExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
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
     * This method corresponds to the database table t_phone
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
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
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
     * This class corresponds to the database table t_phone
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

        public Criteria andPhoneNoIsNull() {
            addCriterion("PhoneNo is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("PhoneNo is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("PhoneNo =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("PhoneNo <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("PhoneNo >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("PhoneNo >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("PhoneNo <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("PhoneNo <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("PhoneNo like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("PhoneNo not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("PhoneNo in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("PhoneNo not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("PhoneNo between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("PhoneNo not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeIsNull() {
            addCriterion("BoughtDateTime is null");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeIsNotNull() {
            addCriterion("BoughtDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeEqualTo(String value) {
            addCriterion("BoughtDateTime =", value, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeNotEqualTo(String value) {
            addCriterion("BoughtDateTime <>", value, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeGreaterThan(String value) {
            addCriterion("BoughtDateTime >", value, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BoughtDateTime >=", value, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeLessThan(String value) {
            addCriterion("BoughtDateTime <", value, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeLessThanOrEqualTo(String value) {
            addCriterion("BoughtDateTime <=", value, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeLike(String value) {
            addCriterion("BoughtDateTime like", value, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeNotLike(String value) {
            addCriterion("BoughtDateTime not like", value, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeIn(List<String> values) {
            addCriterion("BoughtDateTime in", values, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeNotIn(List<String> values) {
            addCriterion("BoughtDateTime not in", values, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeBetween(String value1, String value2) {
            addCriterion("BoughtDateTime between", value1, value2, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andBoughtDateTimeNotBetween(String value1, String value2) {
            addCriterion("BoughtDateTime not between", value1, value2, "boughtDateTime");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDIsNull() {
            addCriterion("PhoneBrandID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDIsNotNull() {
            addCriterion("PhoneBrandID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDEqualTo(Integer value) {
            addCriterion("PhoneBrandID =", value, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDNotEqualTo(Integer value) {
            addCriterion("PhoneBrandID <>", value, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDGreaterThan(Integer value) {
            addCriterion("PhoneBrandID >", value, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneBrandID >=", value, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDLessThan(Integer value) {
            addCriterion("PhoneBrandID <", value, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneBrandID <=", value, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDIn(List<Integer> values) {
            addCriterion("PhoneBrandID in", values, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDNotIn(List<Integer> values) {
            addCriterion("PhoneBrandID not in", values, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDBetween(Integer value1, Integer value2) {
            addCriterion("PhoneBrandID between", value1, value2, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneBrandIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneBrandID not between", value1, value2, "phoneBrandID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDIsNull() {
            addCriterion("PhoneOperatingSystemID is null");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDIsNotNull() {
            addCriterion("PhoneOperatingSystemID is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDEqualTo(Integer value) {
            addCriterion("PhoneOperatingSystemID =", value, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDNotEqualTo(Integer value) {
            addCriterion("PhoneOperatingSystemID <>", value, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDGreaterThan(Integer value) {
            addCriterion("PhoneOperatingSystemID >", value, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("PhoneOperatingSystemID >=", value, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDLessThan(Integer value) {
            addCriterion("PhoneOperatingSystemID <", value, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDLessThanOrEqualTo(Integer value) {
            addCriterion("PhoneOperatingSystemID <=", value, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDIn(List<Integer> values) {
            addCriterion("PhoneOperatingSystemID in", values, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDNotIn(List<Integer> values) {
            addCriterion("PhoneOperatingSystemID not in", values, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDBetween(Integer value1, Integer value2) {
            addCriterion("PhoneOperatingSystemID between", value1, value2, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andPhoneOperatingSystemIDNotBetween(Integer value1, Integer value2) {
            addCriterion("PhoneOperatingSystemID not between", value1, value2, "phoneOperatingSystemID");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIsNull() {
            addCriterion("MemorySize is null");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIsNotNull() {
            addCriterion("MemorySize is not null");
            return (Criteria) this;
        }

        public Criteria andMemorySizeEqualTo(String value) {
            addCriterion("MemorySize =", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotEqualTo(String value) {
            addCriterion("MemorySize <>", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeGreaterThan(String value) {
            addCriterion("MemorySize >", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeGreaterThanOrEqualTo(String value) {
            addCriterion("MemorySize >=", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLessThan(String value) {
            addCriterion("MemorySize <", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLessThanOrEqualTo(String value) {
            addCriterion("MemorySize <=", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeLike(String value) {
            addCriterion("MemorySize like", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotLike(String value) {
            addCriterion("MemorySize not like", value, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeIn(List<String> values) {
            addCriterion("MemorySize in", values, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotIn(List<String> values) {
            addCriterion("MemorySize not in", values, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeBetween(String value1, String value2) {
            addCriterion("MemorySize between", value1, value2, "memorySize");
            return (Criteria) this;
        }

        public Criteria andMemorySizeNotBetween(String value1, String value2) {
            addCriterion("MemorySize not between", value1, value2, "memorySize");
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
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_phone
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
     * This class corresponds to the database table t_phone
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