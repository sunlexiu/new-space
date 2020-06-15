package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TPhone;
import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:42
 */
public class PhoneBasic extends TPhone {

    private TPhonebrand brand;

    private TPhoneoperatingsystem operatingSystem;

    public TPhonebrand getBrand() {
        return brand;
    }

    public void setBrand(TPhonebrand brand) {
        this.brand = brand;
    }

    public TPhoneoperatingsystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(TPhoneoperatingsystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
