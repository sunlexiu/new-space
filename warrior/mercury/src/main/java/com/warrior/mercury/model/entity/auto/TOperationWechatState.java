package com.warrior.mercury.model.entity.auto;

import java.io.Serializable;

public class TOperationWechatState implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_wechat_state.OperationWechatStateID
     *
     * @mbg.generated
     */
    private Integer operationWechatStateID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_operation_wechat_state.State
     *
     * @mbg.generated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_operation_wechat_state
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_wechat_state.OperationWechatStateID
     *
     * @return the value of t_operation_wechat_state.OperationWechatStateID
     *
     * @mbg.generated
     */
    public Integer getOperationWechatStateID() {
        return operationWechatStateID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_wechat_state.OperationWechatStateID
     *
     * @param operationWechatStateID the value for t_operation_wechat_state.OperationWechatStateID
     *
     * @mbg.generated
     */
    public void setOperationWechatStateID(Integer operationWechatStateID) {
        this.operationWechatStateID = operationWechatStateID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_operation_wechat_state.State
     *
     * @return the value of t_operation_wechat_state.State
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_operation_wechat_state.State
     *
     * @param state the value for t_operation_wechat_state.State
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat_state
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", operationWechatStateID=").append(operationWechatStateID);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}