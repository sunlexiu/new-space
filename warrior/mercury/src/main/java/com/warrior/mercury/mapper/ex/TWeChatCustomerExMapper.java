package com.warrior.mercury.mapper.ex;

import com.github.pagehelper.Page;
import com.warrior.mercury.mapper.auto.TWeChatCustomerMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.dto.WechatCustomer;
import com.warrior.mercury.model.param.customer.WechatCustomerQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/18 17:40
 */
public interface TWeChatCustomerExMapper extends TWeChatCustomerMapper {


    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    Page<WechatCustomer> pageList(WechatCustomerQueryPage page);

    /**
     * 根据顾客id查询所有的运营微信
     *
     * @param customerId
     * @return
     */
    List<CommonSimpleDto> listWechatOperatorByCustomerId(Integer customerId);
}
