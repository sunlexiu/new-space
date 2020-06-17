package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TPhonenumber;
import org.springframework.beans.BeanUtils;

/**
 * @author:       Charon
 * @create:       2020/6/17 12:27
 */
public class PhoneNumberInfo extends TPhonenumber {

    public static PhoneNumberInfo convertFromTPhoneNumber(TPhonenumber phoneNumber) {
        PhoneNumberInfo info = new PhoneNumberInfo();
        BeanUtils.copyProperties(phoneNumber, info);
        return info;
    }
}
