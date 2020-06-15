package com.warrior.mercury.model.param.phone;

import com.warrior.mercury.model.entity.auto.TPhone;

/**
 * @author:       Charon
 * @create:       2020/6/15 21:48
 */
public class BasicPhoneUpdateParam extends BasicPhoneAddParam {

    private Integer id;

    @Override
    public TPhone convertToPhone() {
        TPhone phone = super.convertToPhone();
        phone.setPhoneID(id);
        return phone;
    }

    public Integer getId() {
        return id;
    }

    public BasicPhoneUpdateParam setId(Integer id) {
        this.id = id;
        return this;
    }
}
