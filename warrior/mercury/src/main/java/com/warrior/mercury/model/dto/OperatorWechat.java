package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TOperationWechat;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/17 20:05
 */
public class OperatorWechat extends TOperationWechat {

    public static OperatorWechat convertFromDBType(TOperationWechat chat) {
        if (Objects.isNull(chat)) {
            return null;
        }
        OperatorWechat c = new OperatorWechat();
        BeanUtils.copyProperties(chat, c);
        return c;
    }
}
