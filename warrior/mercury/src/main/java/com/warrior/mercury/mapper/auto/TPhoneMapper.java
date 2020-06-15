package com.warrior.mercury.mapper.auto;

import com.warrior.mercury.model.entity.auto.TPhone;
import com.warrior.mercury.model.entity.auto.TPhoneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TPhoneMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    long countByExample(TPhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    int deleteByExample(TPhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer phoneID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    int insert(TPhone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    int insertSelective(TPhone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    List<TPhone> selectByExample(TPhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    TPhone selectByPrimaryKey(Integer phoneID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TPhone record, @Param("example") TPhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TPhone record, @Param("example") TPhoneExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TPhone record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phone
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TPhone record);
}