package com.warrior.mercury.model.param.customer;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/20 8:58
 */
public class OperatorCustomer {

    private Integer weChatCustomerID;

    private List<Integer> operatorWechatList;

    public Integer getWeChatCustomerID() {
        return weChatCustomerID;
    }

    public void setWeChatCustomerID(Integer weChatCustomerID) {
        this.weChatCustomerID = weChatCustomerID;
    }

    public List<Integer> getOperatorWechatList() {
        return operatorWechatList;
    }

    public void setOperatorWechatList(List<Integer> operatorWechatList) {
        this.operatorWechatList = operatorWechatList;
    }
}
