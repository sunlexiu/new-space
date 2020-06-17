package com.warrior.mercury.model.param.phone;

import com.warrior.mercury.model.entity.auto.TPhoneusinglog;
import org.springframework.beans.BeanUtils;

/**
 * @author:       Charon
 * @create:       2020/6/17 9:07
 */
public class PhoneRecordAddParam {

    private Integer phoneID;

    private String lockScreenPassword;

    private Integer phoneStateID;

    private Integer phoneUserPersonID;

    private String startedDateTime;

    private String endedDateTime;

    private String createdDateTime;

    public TPhoneusinglog convertToUsingLog() {
        TPhoneusinglog log = new TPhoneusinglog();
        BeanUtils.copyProperties(this, log);
        return log;
    }

    public Integer getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(Integer phoneID) {
        this.phoneID = phoneID;
    }

    public String getLockScreenPassword() {
        return lockScreenPassword;
    }

    public void setLockScreenPassword(String lockScreenPassword) {
        this.lockScreenPassword = lockScreenPassword;
    }

    public Integer getPhoneStateID() {
        return phoneStateID;
    }

    public void setPhoneStateID(Integer phoneStateID) {
        this.phoneStateID = phoneStateID;
    }

    public Integer getPhoneUserPersonID() {
        return phoneUserPersonID;
    }

    public void setPhoneUserPersonID(Integer phoneUserPersonID) {
        this.phoneUserPersonID = phoneUserPersonID;
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

    public String getCreatedDateTime() {
        return createdDateTime;
    }

    public void setCreatedDateTime(String createdDateTime) {
        this.createdDateTime = createdDateTime;
    }

}
