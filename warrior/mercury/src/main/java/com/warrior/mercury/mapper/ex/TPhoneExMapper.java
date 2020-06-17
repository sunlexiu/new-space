package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TPhoneMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.param.phone.PhoneBasicQueryPage;

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


    /**
     * 查找所有的手机, 供下拉框选择
     *
     * @return
     */
    List<CommonSimpleDto> listAllPhone();
}
