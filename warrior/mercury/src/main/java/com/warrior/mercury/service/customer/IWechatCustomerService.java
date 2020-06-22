package com.warrior.mercury.service.customer;

import com.github.pagehelper.Page;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.dto.WechatCustomer;
import com.warrior.mercury.model.param.customer.OperatorCustomer;
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
    Page<WechatCustomer> pageList(WechatCustomerQueryPage page);


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


    /**
     * 根据顾客id查询所有的运营微信
     *
     * @param customerId
     * @return
     */
    List<CommonSimpleDto> listWechatOperatorByCustomerId(Integer customerId);


    /**
     * 调整顾客运营微信
     *
     * @param operatorCustomer
     */
    void adjustOperationWechat(OperatorCustomer operatorCustomer);

}
