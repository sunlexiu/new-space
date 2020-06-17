package com.warrior.mercury.service.phone;

import com.warrior.mercury.model.entity.auto.TPhonenumber;
import org.springframework.beans.BeanUtils;

/**
 * @author:       Charon
 * @create:       2020/6/17 14:04
 */
public class PhoneNumberInfoUpdateParam extends PhoneNumberInfoAddParam {

    private Integer phoneNumberID;

    @Override
    public TPhonenumber convertToDBType() {
        TPhonenumber number = new TPhonenumber();
        BeanUtils.copyProperties(this, number);
        return number;
    }

    public Integer getPhoneNumberID() {
        return phoneNumberID;
    }

    public void setPhoneNumberID(Integer phoneNumberID) {
        this.phoneNumberID = phoneNumberID;
    }
}
