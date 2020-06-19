package com.warrior.mercury.model.entity.auto;

import java.io.Serializable;

public class TTitle implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_title.TitleID
     *
     * @mbg.generated
     */
    private Integer titleID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_title.Title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_title.TitleCN
     *
     * @mbg.generated
     */
    private String titleCN;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_title.OrderID
     *
     * @mbg.generated
     */
    private Short orderID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_title
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_title.TitleID
     *
     * @return the value of t_title.TitleID
     *
     * @mbg.generated
     */
    public Integer getTitleID() {
        return titleID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_title.TitleID
     *
     * @param titleID the value for t_title.TitleID
     *
     * @mbg.generated
     */
    public void setTitleID(Integer titleID) {
        this.titleID = titleID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_title.Title
     *
     * @return the value of t_title.Title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_title.Title
     *
     * @param title the value for t_title.Title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_title.TitleCN
     *
     * @return the value of t_title.TitleCN
     *
     * @mbg.generated
     */
    public String getTitleCN() {
        return titleCN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_title.TitleCN
     *
     * @param titleCN the value for t_title.TitleCN
     *
     * @mbg.generated
     */
    public void setTitleCN(String titleCN) {
        this.titleCN = titleCN;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_title.OrderID
     *
     * @return the value of t_title.OrderID
     *
     * @mbg.generated
     */
    public Short getOrderID() {
        return orderID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_title.OrderID
     *
     * @param orderID the value for t_title.OrderID
     *
     * @mbg.generated
     */
    public void setOrderID(Short orderID) {
        this.orderID = orderID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_title
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", titleID=").append(titleID);
        sb.append(", title=").append(title);
        sb.append(", titleCN=").append(titleCN);
        sb.append(", orderID=").append(orderID);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}