package com.warrior.mercury.model.param.phone;

import com.warrior.mercury.model.entity.auto.TPhonenumberusinglog;
import org.springframework.beans.BeanUtils;

/**
 * @author:       Charon
 * @create:       2020/6/17 19:09
 */
public class PhoneNumberRecordUpdateParam extends PhoneNumberRecordAddParam {

    private Integer phoneNumberUsingLogID;

    @Override
    public TPhonenumberusinglog convertToDBType() {
        TPhonenumberusinglog log = new TPhonenumberusinglog();
        BeanUtils.copyProperties(this, log);
        return log;
    }

    public Integer getPhoneNumberUsingLogID() {
        return phoneNumberUsingLogID;
    }

    public void setPhoneNumberUsingLogID(Integer phoneNumberUsingLogID) {
        this.phoneNumberUsingLogID = phoneNumberUsingLogID;
    }
}
