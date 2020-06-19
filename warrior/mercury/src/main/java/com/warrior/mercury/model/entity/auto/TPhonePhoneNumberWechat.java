package com.warrior.mercury.model.entity.auto;

import java.io.Serializable;

public class TPhonePhoneNumberWechat implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_phone_phone_number_wechat.PhonePhoneNumberWechatID
     *
     * @mbg.generated
     */
    private Integer phonePhoneNumberWechatID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_phone_phone_number_wechat.PhoneID
     *
     * @mbg.generated
     */
    private Integer phoneID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_phone_phone_number_wechat.PhoneNumberID
     *
     * @mbg.generated
     */
    private Integer phoneNumberID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_phone_phone_number_wechat.OperationWechatID
     *
     * @mbg.generated
     */
    private Integer operationWechatID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_phone_phone_number_wechat.CreatedDateTime
     *
     * @mbg.generated
     */
    private String createdDateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_phone_phone_number_wechat.PhonePhoneNumberWechatID
     *
     * @return the value of t_phone_phone_number_wechat.PhonePhoneNumberWechatID
     *
     * @mbg.generated
     */
    public Integer getPhonePhoneNumberWechatID() {
        return phonePhoneNumberWechatID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_phone_phone_number_wechat.PhonePhoneNumberWechatID
     *
     * @param phonePhoneNumberWechatID the value for t_phone_phone_number_wechat.PhonePhoneNumberWechatID
     *
     * @mbg.generated
     */
    public void setPhonePhoneNumberWechatID(Integer phonePhoneNumberWechatID) {
        this.phonePhoneNumberWechatID = phonePhoneNumberWechatID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_phone_phone_number_wechat.PhoneID
     *
     * @return the value of t_phone_phone_number_wechat.PhoneID
     *
     * @mbg.generated
     */
    public Integer getPhoneID() {
        return phoneID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_phone_phone_number_wechat.PhoneID
     *
     * @param phoneID the value for t_phone_phone_number_wechat.PhoneID
     *
     * @mbg.generated
     */
    public void setPhoneID(Integer phoneID) {
        this.phoneID = phoneID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_phone_phone_number_wechat.PhoneNumberID
     *
     * @return the value of t_phone_phone_number_wechat.PhoneNumberID
     *
     * @mbg.generated
     */
    public Integer getPhoneNumberID() {
        return phoneNumberID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_phone_phone_number_wechat.PhoneNumberID
     *
     * @param phoneNumberID the value for t_phone_phone_number_wechat.PhoneNumberID
     *
     * @mbg.generated
     */
    public void setPhoneNumberID(Integer phoneNumberID) {
        this.phoneNumberID = phoneNumberID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_phone_phone_number_wechat.OperationWechatID
     *
     * @return the value of t_phone_phone_number_wechat.OperationWechatID
     *
     * @mbg.generated
     */
    public Integer getOperationWechatID() {
        return operationWechatID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_phone_phone_number_wechat.OperationWechatID
     *
     * @param operationWechatID the value for t_phone_phone_number_wechat.OperationWechatID
     *
     * @mbg.generated
     */
    public void setOperationWechatID(Integer operationWechatID) {
        this.operationWechatID = operationWechatID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_phone_phone_number_wechat.CreatedDateTime
     *
     * @return the value of t_phone_phone_number_wechat.CreatedDateTime
     *
     * @mbg.generated
     */
    public String getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_phone_phone_number_wechat.CreatedDateTime
     *
     * @param createdDateTime the value for t_phone_phone_number_wechat.CreatedDateTime
     *
     * @mbg.generated
     */
    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone_phone_number_wechat
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phonePhoneNumberWechatID=").append(phonePhoneNumberWechatID);
        sb.append(", phoneID=").append(phoneID);
        sb.append(", phoneNumberID=").append(phoneNumberID);
        sb.append(", operationWechatID=").append(operationWechatID);
        sb.append(", createdDateTime=").append(createdDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}