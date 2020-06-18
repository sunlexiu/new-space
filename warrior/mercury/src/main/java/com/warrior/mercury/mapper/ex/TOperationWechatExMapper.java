package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TOperationWechatMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/18 15:59
 */
public interface TOperationWechatExMapper extends TOperationWechatMapper {

    /**
     * 查找所有的运营微信
     *
     * @return
     */
    List<CommonSimpleDto> listAllOperationWechat();

}
