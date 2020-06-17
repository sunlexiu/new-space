package com.warrior.mercury.service.phone;

import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.param.phone.BasicPhoneAddParam;
import com.warrior.mercury.model.param.phone.BasicPhoneUpdateParam;
import com.warrior.mercury.model.param.phone.PhoneBasicQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:16
 */
public interface IPhoneBasicService {

    /**
     * 分页查询手机使用信息
     *
     * @param page
     * @return
     */
    List<PhoneBasic> listBasicPhoneInfo(PhoneBasicQueryPage page);


    /**
     * 增加手机信息
     *
     * @param param
     */
    void addBasicPhone(BasicPhoneAddParam param);


    /**
     * 修改手机信息
     *
     * @param param
     */
    void updateBasicPhone(BasicPhoneUpdateParam param);


    /**
     * 删除phone
     *
     * @param id
     */
    void deletePhone(Integer id);

}
