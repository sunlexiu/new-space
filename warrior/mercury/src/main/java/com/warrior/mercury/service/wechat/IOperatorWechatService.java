package com.warrior.mercury.service.wechat;

import com.warrior.mercury.model.dto.OperatorWechat;
import com.warrior.mercury.model.param.wechat.OperatorWechatAlterParam;
import com.warrior.mercury.model.param.wechat.OperatorWechatQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 20:05
 */
public interface IOperatorWechatService {

    /**
     * 分页查询手机使用信息
     *
     * @param page
     * @return
     */
    List<OperatorWechat> pageListOperateWechat(OperatorWechatQueryPage page);


    /**
     * 增加手机信息
     *
     * @param param
     */
    void addOperateWechat(OperatorWechatAlterParam param);


    /**
     * 修改手机信息
     *
     * @param param
     */
    void updateOperateWechat(OperatorWechatAlterParam param);


    /**
     * 删除phone
     *
     * @param id
     */
    void deleteOperateWechat(Integer id);

}
