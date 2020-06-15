package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TPhoneMapper;
import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.param.query.PhoneBasicQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:41
 */
public interface TPhoneExMapper extends TPhoneMapper {

    /**
     * 分页查询管理员用户
     *
     * @param page
     * @return
     */
    List<PhoneBasic> listBasicPhoneInfo(PhoneBasicQueryPage page);
}
