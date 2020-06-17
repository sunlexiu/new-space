package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TPhonenumberusinglog;

/**
 * @author:       Charon
 * @create:       2020/6/17 14:53
 */
public class PhoneNumberRecord extends TPhonenumberusinglog {

    private CommonSimpleDto phone;

    private CommonSimpleDto purpose;

    private CommonSimpleDto user;

    private CommonSimpleDto numberState;

    private CommonSimpleDto parentNumber;

    public CommonSimpleDto getPhone() {
        return phone;
    }

    public void setPhone(CommonSimpleDto phone) {
        this.phone = phone;
    }

    public CommonSimpleDto getPurpose() {
        return purpose;
    }

    public void setPurpose(CommonSimpleDto purpose) {
        this.purpose = purpose;
    }

    public CommonSimpleDto getUser() {
        return user;
    }

    public void setUser(CommonSimpleDto user) {
        this.user = user;
    }

    public CommonSimpleDto getNumberState() {
        return numberState;
    }

    public void setNumberState(CommonSimpleDto numberState) {
        this.numberState = numberState;
    }

    public CommonSimpleDto getParentNumber() {
        return parentNumber;
    }

    public void setParentNumber(CommonSimpleDto parentNumber) {
        this.parentNumber = parentNumber;
    }
}
