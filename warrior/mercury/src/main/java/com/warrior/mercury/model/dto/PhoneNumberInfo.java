package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TPhonenumber;

/**
 * @author:       Charon
 * @create:       2020/6/17 12:27
 */
public class PhoneNumberInfo extends TPhonenumber {

    private Integer phonePhoneNumberWechatID;

    private CommonSimpleDto phone;

    private CommonSimpleDto wechat;

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

    public CommonSimpleDto getWechat() {
        return wechat;
    }

    public void setWechat(CommonSimpleDto wechat) {
        this.wechat = wechat;
    }
}
