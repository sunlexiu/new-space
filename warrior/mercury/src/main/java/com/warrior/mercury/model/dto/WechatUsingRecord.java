package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TOperationWechatUsingLog;

/**
 * @author:       Charon
 * @create:       2020/6/18 14:30
 */
public class WechatUsingRecord extends TOperationWechatUsingLog {

    private CommonSimpleDto wechat;

    private CommonSimpleDto wechatState;

    private CommonSimpleDto wechatPurpose;

    private CommonSimpleDto user;

    public CommonSimpleDto getWechat() {
        return wechat;
    }

    public void setWechat(CommonSimpleDto wechat) {
        this.wechat = wechat;
    }

    public CommonSimpleDto getWechatState() {
        return wechatState;
    }

    public void setWechatState(CommonSimpleDto wechatState) {
        this.wechatState = wechatState;
    }

    public CommonSimpleDto getWechatPurpose() {
        return wechatPurpose;
    }

    public void setWechatPurpose(CommonSimpleDto wechatPurpose) {
        this.wechatPurpose = wechatPurpose;
    }

    public CommonSimpleDto getUser() {
        return user;
    }

    public void setUser(CommonSimpleDto user) {
        this.user = user;
    }
}
