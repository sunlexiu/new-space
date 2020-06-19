package com.warrior.mercury.model.entity.auto;

import java.io.Serializable;

public class TWeChatCustomerEvaluation implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_we_chat_customer_evaluation.WeChatCustomerEvaluationID
     *
     * @mbg.generated
     */
    private Integer weChatCustomerEvaluationID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_we_chat_customer_evaluation.Evaluation
     *
     * @mbg.generated
     */
    private String evaluation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_we_chat_customer_evaluation.WeChatCustomerEvaluationID
     *
     * @return the value of t_we_chat_customer_evaluation.WeChatCustomerEvaluationID
     *
     * @mbg.generated
     */
    public Integer getWeChatCustomerEvaluationID() {
        return weChatCustomerEvaluationID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_we_chat_customer_evaluation.WeChatCustomerEvaluationID
     *
     * @param weChatCustomerEvaluationID the value for t_we_chat_customer_evaluation.WeChatCustomerEvaluationID
     *
     * @mbg.generated
     */
    public void setWeChatCustomerEvaluationID(Integer weChatCustomerEvaluationID) {
        this.weChatCustomerEvaluationID = weChatCustomerEvaluationID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_we_chat_customer_evaluation.Evaluation
     *
     * @return the value of t_we_chat_customer_evaluation.Evaluation
     *
     * @mbg.generated
     */
    public String getEvaluation() {
        return evaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_we_chat_customer_evaluation.Evaluation
     *
     * @param evaluation the value for t_we_chat_customer_evaluation.Evaluation
     *
     * @mbg.generated
     */
    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", weChatCustomerEvaluationID=").append(weChatCustomerEvaluationID);
        sb.append(", evaluation=").append(evaluation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}