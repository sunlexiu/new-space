package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TOperationWechatUsingLogMapper;
import com.warrior.mercury.model.dto.WechatUsingRecord;
import com.warrior.mercury.model.param.wechat.WechatUsingRecordQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/18 14:39
 */
public interface TOperationWechatUsingLogExMapper extends TOperationWechatUsingLogMapper {

    /**
     * 分页查询微信使用记录
     *
     * @param page
     * @return
     */
    List<WechatUsingRecord> pageList(WechatUsingRecordQueryPage page);

    /**
     * 更新该微信上一次的使用记录结束时间
     *
     * @param wechatId
     */
    void updateRecordEndDate(Integer wechatId);
}
