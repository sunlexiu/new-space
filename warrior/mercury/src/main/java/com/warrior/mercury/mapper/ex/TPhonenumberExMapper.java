package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TPhonenumberMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.dto.PhoneNumberInfo;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoQuery;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 16:27
 */
public interface TPhonenumberExMapper extends TPhonenumberMapper {

    /**
     * 查询所有的手机号
     *
     * @return
     */
    List<CommonSimpleDto> listAllPhoneNumber();


    /**
     * 分页查询手机号码信息
     *
     * @param page
     * @return
     */
    List<PhoneNumberInfo> listPhoneNumberInfo(PhoneNumberInfoQuery page);
}
