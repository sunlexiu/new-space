package com.warrior.mercury.mapper.auto;

import com.warrior.mercury.model.entity.auto.TOperationWechat;
import com.warrior.mercury.model.entity.auto.TOperationWechatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOperationWechatMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    long countByExample(TOperationWechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    int deleteByExample(TOperationWechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer operationWechatID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    int insert(TOperationWechat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    int insertSelective(TOperationWechat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    List<TOperationWechat> selectByExample(TOperationWechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    TOperationWechat selectByPrimaryKey(Integer operationWechatID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TOperationWechat record, @Param("example") TOperationWechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TOperationWechat record, @Param("example") TOperationWechatExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TOperationWechat record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_operation_wechat
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TOperationWechat record);
}