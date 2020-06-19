package com.warrior.mercury.service.customer;

import com.warrior.mercury.model.dto.WechatCustomer;
import com.warrior.mercury.model.param.customer.WechatCustomerAlterParam;
import com.warrior.mercury.model.param.customer.WechatCustomerQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/18 17:36
 */
public interface IWechatCustomerService {

    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    List<WechatCustomer> pageList(WechatCustomerQueryPage page);


    /**
     * 增加
     *
     * @param param
     */
    void add(WechatCustomerAlterParam param);


    /**
     * 修改
     *
     * @param param
     */
    void update(WechatCustomerAlterParam param);


    /**
     * 删除
     *
     * @param id
     */
    void delete(Integer id);

}
