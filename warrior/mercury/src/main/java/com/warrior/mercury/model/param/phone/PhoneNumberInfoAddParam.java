package com.warrior.mercury.model.param.phone;

import com.warrior.mercury.model.entity.auto.TPhonenumber;
import org.springframework.beans.BeanUtils;

/**
 * @author:       Charon
 * @create:       2020/6/17 12:37
 */
public class PhoneNumberInfoAddParam {

    private String phoneNumber;

    private String location;

    private String appliedDateTime;

    private String owner;

    public TPhonenumber convertToDBType() {
        TPhonenumber phoneNumber = new TPhonenumber();
        BeanUtils.copyProperties(this, phoneNumber);
        return phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAppliedDateTime() {
        return appliedDateTime;
    }

    public void setAppliedDateTime(String appliedDateTime) {
        this.appliedDateTime = appliedDateTime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
