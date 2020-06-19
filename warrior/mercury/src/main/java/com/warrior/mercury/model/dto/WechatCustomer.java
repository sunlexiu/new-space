package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TWeChatCustomer;

/**
 * @author:       Charon
 * @create:       2020/6/18 17:29
 */
public class WechatCustomer extends TWeChatCustomer {

    private CommonSimpleDto recorder;

    private CommonSimpleDto activitySource;

    private CommonSimpleDto addingSource;

    private CommonSimpleDto title;

    private CommonSimpleDto evaluation;

    private CommonSimpleDto operationWechat;

    public CommonSimpleDto getRecorder() {
        return recorder;
    }

    public void setRecorder(CommonSimpleDto recorder) {
        this.recorder = recorder;
    }

    public CommonSimpleDto getActivitySource() {
        return activitySource;
    }

    public void setActivitySource(CommonSimpleDto activitySource) {
        this.activitySource = activitySource;
    }

    public CommonSimpleDto getAddingSource() {
        return addingSource;
    }

    public void setAddingSource(CommonSimpleDto addingSource) {
        this.addingSource = addingSource;
    }

    public CommonSimpleDto getTitle() {
        return title;
    }

    public void setTitle(CommonSimpleDto title) {
        this.title = title;
    }

    public CommonSimpleDto getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(CommonSimpleDto evaluation) {
        this.evaluation = evaluation;
    }

    public CommonSimpleDto getOperationWechat() {
        return operationWechat;
    }

    public void setOperationWechat(CommonSimpleDto operationWechat) {
        this.operationWechat = operationWechat;
    }
}
