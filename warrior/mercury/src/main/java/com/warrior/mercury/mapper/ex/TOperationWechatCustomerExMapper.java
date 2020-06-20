package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TOperationWechatCustomerMapper;
import com.warrior.mercury.model.entity.auto.TOperationWechatCustomer;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/20 9:08
 */
public interface TOperationWechatCustomerExMapper extends TOperationWechatCustomerMapper {

    /**
     * 批量插入
     *
     * @param list
     */
    void insertBatch(List<TOperationWechatCustomer> list);
}
