package com.warrior.mercury.model.entity.auto;

import java.io.Serializable;

public class TSignup implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_signup.SignUpID
     *
     * @mbg.generated
     */
    private Integer signupid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_signup.PersonID
     *
     * @mbg.generated
     */
    private Integer personid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_signup.LoginName
     *
     * @mbg.generated
     */
    private String loginname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_signup.Password
     *
     * @mbg.generated
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_signup.Disabled
     *
     * @mbg.generated
     */
    private Byte disabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_signup
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_signup.SignUpID
     *
     * @return the value of t_signup.SignUpID
     *
     * @mbg.generated
     */
    public Integer getSignupid() {
        return signupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_signup.SignUpID
     *
     * @param signupid the value for t_signup.SignUpID
     *
     * @mbg.generated
     */
    public void setSignupid(Integer signupid) {
        this.signupid = signupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_signup.PersonID
     *
     * @return the value of t_signup.PersonID
     *
     * @mbg.generated
     */
    public Integer getPersonid() {
        return personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_signup.PersonID
     *
     * @param personid the value for t_signup.PersonID
     *
     * @mbg.generated
     */
    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_signup.LoginName
     *
     * @return the value of t_signup.LoginName
     *
     * @mbg.generated
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_signup.LoginName
     *
     * @param loginname the value for t_signup.LoginName
     *
     * @mbg.generated
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_signup.Password
     *
     * @return the value of t_signup.Password
     *
     * @mbg.generated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_signup.Password
     *
     * @param password the value for t_signup.Password
     *
     * @mbg.generated
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_signup.Disabled
     *
     * @return the value of t_signup.Disabled
     *
     * @mbg.generated
     */
    public Byte getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_signup.Disabled
     *
     * @param disabled the value for t_signup.Disabled
     *
     * @mbg.generated
     */
    public void setDisabled(Byte disabled) {
        this.disabled = disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_signup
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", signupid=").append(signupid);
        sb.append(", personid=").append(personid);
        sb.append(", loginname=").append(loginname);
        sb.append(", password=").append(password);
        sb.append(", disabled=").append(disabled);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}