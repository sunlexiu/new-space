package com.warrior.mercury.service.phone;

import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.param.query.PhoneBasicQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:16
 */
public interface IPhoneBasicService {

    /**
     * 分页查询管理员用户
     *
     * @param page
     * @return
     */
    List<PhoneBasic> listBasicPhoneInfo(PhoneBasicQueryPage page);



}
