package com.warrior.mercury.mapper.auto;

import com.warrior.mercury.model.entity.auto.TWeChatCustomerEvaluation;
import com.warrior.mercury.model.entity.auto.TWeChatCustomerEvaluationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TWeChatCustomerEvaluationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    long countByExample(TWeChatCustomerEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    int deleteByExample(TWeChatCustomerEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer weChatCustomerEvaluationID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    int insert(TWeChatCustomerEvaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    int insertSelective(TWeChatCustomerEvaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    List<TWeChatCustomerEvaluation> selectByExample(TWeChatCustomerEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    TWeChatCustomerEvaluation selectByPrimaryKey(Integer weChatCustomerEvaluationID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TWeChatCustomerEvaluation record, @Param("example") TWeChatCustomerEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TWeChatCustomerEvaluation record, @Param("example") TWeChatCustomerEvaluationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TWeChatCustomerEvaluation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_we_chat_customer_evaluation
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TWeChatCustomerEvaluation record);
}