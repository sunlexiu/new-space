package com.warrior.mercury.model.param.phone;

import com.warrior.mercury.model.entity.auto.TPhonenumberusinglog;
import org.springframework.beans.BeanUtils;

/**
 * @author:       Charon
 * @create:       2020/6/17 16:48
 */
public class PhoneNumberRecordAddParam {

    private Integer phoneNumberID;

    private Integer phoneNumberPurposeID;

    private Integer phoneNumberUserPersonID;

    private String packageType;

    private Integer phoneNumberStateID;

    private String createdDateTime;

    private String startedDateTime;

    private String endedDateTime;

    private String remark;

    private Integer parentPhoneNumberID;

    public TPhonenumberusinglog convertToDBType() {
        TPhonenumberusinglog log = new TPhonenumberusinglog();
        BeanUtils.copyProperties(this, log);
        return log;
    }

    public Integer getPhoneNumberID() {
        return phoneNumberID;
    }

    public void setPhoneNumberID(Integer phoneNumberID) {
        this.phoneNumberID = phoneNumberID;
    }

    public Integer getPhoneNumberPurposeID() {
        return phoneNumberPurposeID;
    }

    public void setPhoneNumberPurposeID(Integer phoneNumberPurposeID) {
        this.phoneNumberPurposeID = phoneNumberPurposeID;
    }

    public Integer getPhoneNumberUserPersonID() {
        return phoneNumberUserPersonID;
    }

    public void setPhoneNumberUserPersonID(Integer phoneNumberUserPersonID) {
        this.phoneNumberUserPersonID = phoneNumberUserPersonID;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public Integer getPhoneNumberStateID() {
        return phoneNumberStateID;
    }

    public void setPhoneNumberStateID(Integer phoneNumberStateID) {
        this.phoneNumberStateID = phoneNumberStateID;
    }

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

    public String getStartedDateTime() {
        return startedDateTime;
    }

    public void setStartedDateTime(String startedDateTime) {
        this.startedDateTime = startedDateTime;
    }

    public String getEndedDateTime() {
        return endedDateTime;
    }

    public void setEndedDateTime(String endedDateTime) {
        this.endedDateTime = endedDateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getParentPhoneNumberID() {
        return parentPhoneNumberID;
    }

    public void setParentPhoneNumberID(Integer parentPhoneNumberID) {
        this.parentPhoneNumberID = parentPhoneNumberID;
    }
}
