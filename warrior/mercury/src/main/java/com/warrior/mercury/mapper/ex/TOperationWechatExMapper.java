package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TOperationWechatMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.dto.OperatorWechat;
import com.warrior.mercury.model.param.wechat.OperatorWechatQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/18 15:59
 */
public interface TOperationWechatExMapper extends TOperationWechatMapper {


    /**
     * 分页查询列表
     *
     * @param page
     * @return
     */
    List<OperatorWechat> pageList(OperatorWechatQueryPage page);

    /**
     * 查找所有的运营微信
     *
     * @return
     */
    List<CommonSimpleDto> listAllOperationWechat();

}
