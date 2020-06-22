package com.warrior.mercury.service.wechat;

import com.github.pagehelper.Page;
import com.warrior.mercury.model.dto.WechatUsingRecord;
import com.warrior.mercury.model.param.wechat.WechatUsingRecordAlterParam;
import com.warrior.mercury.model.param.wechat.WechatUsingRecordQueryPage;

/**
 * @author:       Charon
 * @create:       2020/6/18 14:33
 */
public interface IWechatUsingRecordService {

    /**
     * 分页查询微信使用记录
     *
     * @param page
     * @return
     */
    Page<WechatUsingRecord> pageList(WechatUsingRecordQueryPage page);


    /**
     * 增加微信使用记录
     *
     * @param param
     */
    void add(WechatUsingRecordAlterParam param);


    /**
     * 删除记录
     *
     * @param id
     */
    void delete(Integer id);

}
