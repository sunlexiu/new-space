package com.warrior.mercury.mapper.auto;

import com.warrior.mercury.model.entity.auto.TPhonenumber;
import com.warrior.mercury.model.entity.auto.TPhonenumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPhonenumberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    long countByExample(TPhonenumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    int deleteByExample(TPhonenumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer phoneNumberID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    int insert(TPhonenumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    int insertSelective(TPhonenumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    List<TPhonenumber> selectByExample(TPhonenumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    TPhonenumber selectByPrimaryKey(Integer phoneNumberID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") TPhonenumber record, @Param("example") TPhonenumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") TPhonenumber record, @Param("example") TPhonenumberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(TPhonenumber record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_phonenumber
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(TPhonenumber record);
}