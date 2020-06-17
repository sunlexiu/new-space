package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TPerson;
import com.warrior.mercury.model.entity.auto.TPhone;
import com.warrior.mercury.model.entity.auto.TPhonestate;
import com.warrior.mercury.model.entity.auto.TPhoneusinglog;

/**
 * @author:       Charon
 * @create:       2020/6/17 9:09
 */
public class PhoneRecord extends TPhoneusinglog {

    private TPhone phone;

    private TPhonestate phoneState;

    private TPerson person;

    public TPhone getPhone() {
        return phone;
    }

    public void setPhone(TPhone phone) {
        this.phone = phone;
    }

    public TPhonestate getPhoneState() {
        return phoneState;
    }

    public void setPhoneState(TPhonestate phoneState) {
        this.phoneState = phoneState;
    }

    public TPerson getPerson() {
        return person;
    }

    public void setPerson(TPerson person) {
        this.person = person;
    }
}
