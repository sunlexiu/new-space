package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TOperationWechat;

/**
 * @author:       Charon
 * @create:       2020/6/17 20:05
 */
public class OperatorWechat extends TOperationWechat {

    private Integer phonePhoneNumberWechatID;

    private CommonSimpleDto phone;

    private CommonSimpleDto phoneNumber;

    public Integer getPhonePhoneNumberWechatID() {
        return phonePhoneNumberWechatID;
    }

    public void setPhonePhoneNumberWechatID(Integer phonePhoneNumberWechatID) {
        this.phonePhoneNumberWechatID = phonePhoneNumberWechatID;
    }

    public CommonSimpleDto getPhone() {
        return phone;
    }

    public void setPhone(CommonSimpleDto phone) {
        this.phone = phone;
    }

    public CommonSimpleDto getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(CommonSimpleDto phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
