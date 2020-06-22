package com.warrior.mercury.service.phone;

import com.github.pagehelper.Page;
import com.warrior.mercury.model.dto.PhoneNumberInfo;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoAddParam;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoQuery;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoUpdateParam;

/**
 * @author:       Charon
 * @create:       2020/6/17 11:50
 */
public interface IPhoneNumberInfoService {

    /**
     * 分页查询手机号码信息
     *
     * @param page
     * @return
     */
    Page<PhoneNumberInfo> listPhoneNumberInfo(PhoneNumberInfoQuery page);


    /**
     * 增加手机信息
     *
     * @param param
     */
    void addPhoneNumber(PhoneNumberInfoAddParam param);


    /**
     * 修改手机信息
     *
     * @param param
     */
    void updatePhoneNumber(PhoneNumberInfoUpdateParam param);


    /**
     * 删除phone
     *
     * @param id
     */
    void deletePhoneNumber(Integer id);
}
