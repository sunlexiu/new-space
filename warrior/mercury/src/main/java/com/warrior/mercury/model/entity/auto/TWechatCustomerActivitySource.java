package com.warrior.mercury.model.entity.auto;

import java.io.Serializable;

public class TWechatCustomerActivitySource implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_customer_activity_source.WeChatCustomerActivitySourceID
     *
     * @mbg.generated
     */
    private Integer weChatCustomerActivitySourceID;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_wechat_customer_activity_source.Source
     *
     * @mbg.generated
     */
    private String source;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_wechat_customer_activity_source
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_customer_activity_source.WeChatCustomerActivitySourceID
     *
     * @return the value of t_wechat_customer_activity_source.WeChatCustomerActivitySourceID
     *
     * @mbg.generated
     */
    public Integer getWeChatCustomerActivitySourceID() {
        return weChatCustomerActivitySourceID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_customer_activity_source.WeChatCustomerActivitySourceID
     *
     * @param weChatCustomerActivitySourceID the value for t_wechat_customer_activity_source.WeChatCustomerActivitySourceID
     *
     * @mbg.generated
     */
    public void setWeChatCustomerActivitySourceID(Integer weChatCustomerActivitySourceID) {
        this.weChatCustomerActivitySourceID = weChatCustomerActivitySourceID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_wechat_customer_activity_source.Source
     *
     * @return the value of t_wechat_customer_activity_source.Source
     *
     * @mbg.generated
     */
    public String getSource() {
        return source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_wechat_customer_activity_source.Source
     *
     * @param source the value for t_wechat_customer_activity_source.Source
     *
     * @mbg.generated
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_activity_source
     *
     * @mbg.generated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", weChatCustomerActivitySourceID=").append(weChatCustomerActivitySourceID);
        sb.append(", source=").append(source);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}