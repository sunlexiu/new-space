package com.warrior.mercury.model.entity.auto;

import java.io.Serializable;

public class TPhonestate implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_phonestate.PhoneStateID
     *
     * @mbg.generated
     */
    private Integer phoneStateID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_phonestate.State
     *
     * @mbg.generated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_phonestate
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_phonestate.PhoneStateID
     *
     * @return the value of t_phonestate.PhoneStateID
     *
     * @mbg.generated
     */
    public Integer getPhoneStateID() {
        return phoneStateID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_phonestate.PhoneStateID
     *
     * @param phoneStateID the value for t_phonestate.PhoneStateID
     *
     * @mbg.generated
     */
    public void setPhoneStateID(Integer phoneStateID) {
        this.phoneStateID = phoneStateID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_phonestate.State
     *
     * @return the value of t_phonestate.State
     *
     * @mbg.generated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_phonestate.State
     *
     * @param state the value for t_phonestate.State
     *
     * @mbg.generated
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonestate
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", phoneStateID=").append(phoneStateID);
        sb.append(", state=").append(state);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}