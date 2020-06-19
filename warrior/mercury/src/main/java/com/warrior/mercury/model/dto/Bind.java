package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TPhonePhoneNumberWechat;

/**
 * @author:       Charon
 * @create:       2020/6/19 17:04
 */
public class Bind extends TPhonePhoneNumberWechat {

    private CommonSimpleDto phone;

    private CommonSimpleDto phoneNumber;

    private CommonSimpleDto wechat;

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

    public CommonSimpleDto getWechat() {
        return wechat;
    }

    public void setWechat(CommonSimpleDto wechat) {
        this.wechat = wechat;
    }
}
