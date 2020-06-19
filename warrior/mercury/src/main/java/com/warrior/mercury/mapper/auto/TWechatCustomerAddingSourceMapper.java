package com.warrior.mercury.mapper.auto;

import com.warrior.mercury.model.entity.auto.TWechatCustomerAddingSource;
import com.warrior.mercury.model.entity.auto.TWechatCustomerAddingSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWechatCustomerAddingSourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    long countByExample(TWechatCustomerAddingSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    int deleteByExample(TWechatCustomerAddingSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer weChatCustomerAddingSourceID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    int insert(TWechatCustomerAddingSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    int insertSelective(TWechatCustomerAddingSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    List<TWechatCustomerAddingSource> selectByExample(TWechatCustomerAddingSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    TWechatCustomerAddingSource selectByPrimaryKey(Integer weChatCustomerAddingSourceID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TWechatCustomerAddingSource record, @Param("example") TWechatCustomerAddingSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TWechatCustomerAddingSource record, @Param("example") TWechatCustomerAddingSourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TWechatCustomerAddingSource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_wechat_customer_adding_source
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TWechatCustomerAddingSource record);
}