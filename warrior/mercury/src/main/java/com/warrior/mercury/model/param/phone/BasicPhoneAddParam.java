package com.warrior.mercury.model.param.phone;

import com.warrior.mercury.model.entity.auto.TPhone;

/**
 * @author:       Charon
 * @create:       2020/6/15 20:12
 */
public class BasicPhoneAddParam {

    private String phoneNo;

    private String boughtDateTime;

    private Integer phoneBrandId;

    private Integer phoneOperatingSystemId;

    private String memorySize;

    private String remark;

    public TPhone convertToPhone() {
        TPhone phone = new TPhone();
        phone.setBoughtDateTime(boughtDateTime);
        phone.setMemorySize(memorySize);
        phone.setPhoneBrandID(phoneBrandId);
        phone.setPhoneNo(phoneNo);
        phone.setPhoneOperatingSystemID(phoneOperatingSystemId);
        phone.setRemark(remark);
        return phone;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getBoughtDateTime() {
        return boughtDateTime;
    }

    public void setBoughtDateTime(String boughtDateTime) {
        this.boughtDateTime = boughtDateTime;
    }

    public Integer getPhoneBrandId() {
        return phoneBrandId;
    }

    public void setPhoneBrandId(Integer phoneBrandId) {
        this.phoneBrandId = phoneBrandId;
    }

    public Integer getPhoneOperatingSystemId() {
        return phoneOperatingSystemId;
    }

    public void setPhoneOperatingSystemId(Integer phoneOperatingSystemId) {
        this.phoneOperatingSystemId = phoneOperatingSystemId;
    }

    public String getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(String memorySize) {
        this.memorySize = memorySize;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
