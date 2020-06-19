package com.warrior.mercury.service.phone;

import com.warrior.mercury.model.dto.Bind;
import com.warrior.mercury.model.param.bind.BindQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/19 13:42
 */
public interface IBindService {

    /**
     * 绑定手机, 手机号, 微信号
     *
     * @param id
     * @param phoneId
     * @param phoneNumberId
     * @param wechatId
     */
    void bind(Integer id, Integer phoneId, Integer phoneNumberId, Integer wechatId);


    /**
     * 查询绑定信息
     *
     * @param page
     * @return
     */
    List<Bind> pageList(BindQueryPage page);


    /**
     * 解除绑定
     *
     * @param id
     */
    void delete(Integer id);
}
