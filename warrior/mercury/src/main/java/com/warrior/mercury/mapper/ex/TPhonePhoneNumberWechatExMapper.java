package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TPhonePhoneNumberWechatMapper;
import com.warrior.mercury.model.dto.Bind;
import com.warrior.mercury.model.param.bind.BindQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/19 17:07
 */
public interface TPhonePhoneNumberWechatExMapper extends TPhonePhoneNumberWechatMapper {


    /**
     * 查询绑定信息
     *
     * @param page
     * @return
     */
    List<Bind> pageList(BindQueryPage page);
}
