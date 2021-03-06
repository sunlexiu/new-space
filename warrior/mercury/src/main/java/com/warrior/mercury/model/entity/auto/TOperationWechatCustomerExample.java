package com.warrior.mercury.model.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class TOperationWechatCustomerExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    public TOperationWechatCustomerExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
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
     * This method corresponds to the database table t_operation_wechat_customer
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
     * This method corresponds to the database table t_operation_wechat_customer
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_customer
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
     * This class corresponds to the database table t_operation_wechat_customer
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

        public Criteria andOperationWechatCustomerIDIsNull() {
            addCriterion("OperationWechatCustomerID is null");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDIsNotNull() {
            addCriterion("OperationWechatCustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDEqualTo(Integer value) {
            addCriterion("OperationWechatCustomerID =", value, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDNotEqualTo(Integer value) {
            addCriterion("OperationWechatCustomerID <>", value, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDGreaterThan(Integer value) {
            addCriterion("OperationWechatCustomerID >", value, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("OperationWechatCustomerID >=", value, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDLessThan(Integer value) {
            addCriterion("OperationWechatCustomerID <", value, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDLessThanOrEqualTo(Integer value) {
            addCriterion("OperationWechatCustomerID <=", value, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDIn(List<Integer> values) {
            addCriterion("OperationWechatCustomerID in", values, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDNotIn(List<Integer> values) {
            addCriterion("OperationWechatCustomerID not in", values, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDBetween(Integer value1, Integer value2) {
            addCriterion("OperationWechatCustomerID between", value1, value2, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andOperationWechatCustomerIDNotBetween(Integer value1, Integer value2) {
            addCriterion("OperationWechatCustomerID not between", value1, value2, "operationWechatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDIsNull() {
            addCriterion("WeChatCustomerID is null");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDIsNotNull() {
            addCriterion("WeChatCustomerID is not null");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDEqualTo(Integer value) {
            addCriterion("WeChatCustomerID =", value, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDNotEqualTo(Integer value) {
            addCriterion("WeChatCustomerID <>", value, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDGreaterThan(Integer value) {
            addCriterion("WeChatCustomerID >", value, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("WeChatCustomerID >=", value, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDLessThan(Integer value) {
            addCriterion("WeChatCustomerID <", value, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDLessThanOrEqualTo(Integer value) {
            addCriterion("WeChatCustomerID <=", value, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDIn(List<Integer> values) {
            addCriterion("WeChatCustomerID in", values, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDNotIn(List<Integer> values) {
            addCriterion("WeChatCustomerID not in", values, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDBetween(Integer value1, Integer value2) {
            addCriterion("WeChatCustomerID between", value1, value2, "weChatCustomerID");
            return (Criteria) this;
        }

        public Criteria andWeChatCustomerIDNotBetween(Integer value1, Integer value2) {
            addCriterion("WeChatCustomerID not between", value1, value2, "weChatCustomerID");
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

        public Criteria andOrderIDIsNull() {
            addCriterion("OrderID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIDIsNotNull() {
            addCriterion("OrderID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIDEqualTo(Short value) {
            addCriterion("OrderID =", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotEqualTo(Short value) {
            addCriterion("OrderID <>", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDGreaterThan(Short value) {
            addCriterion("OrderID >", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDGreaterThanOrEqualTo(Short value) {
            addCriterion("OrderID >=", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLessThan(Short value) {
            addCriterion("OrderID <", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDLessThanOrEqualTo(Short value) {
            addCriterion("OrderID <=", value, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDIn(List<Short> values) {
            addCriterion("OrderID in", values, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotIn(List<Short> values) {
            addCriterion("OrderID not in", values, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDBetween(Short value1, Short value2) {
            addCriterion("OrderID between", value1, value2, "orderID");
            return (Criteria) this;
        }

        public Criteria andOrderIDNotBetween(Short value1, Short value2) {
            addCriterion("OrderID not between", value1, value2, "orderID");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_operation_wechat_customer
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
     * This class corresponds to the database table t_operation_wechat_customer
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