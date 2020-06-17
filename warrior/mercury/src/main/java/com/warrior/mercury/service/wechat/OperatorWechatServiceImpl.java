package com.warrior.mercury.service.wechat;

import com.warrior.mercury.model.dto.OperatorWechat;
import com.warrior.mercury.model.param.wechat.OperatorWechatAlterParam;
import com.warrior.mercury.model.param.wechat.OperatorWechatQueryPage;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 20:12
 */
@Service
public class OperatorWechatServiceImpl implements IOperatorWechatService {

    @Override
    public List<OperatorWechat> listBasicPhoneInfo(OperatorWechatQueryPage page) {
        return null;
    }

    @Override
    public void addBasicPhone(OperatorWechatAlterParam param) {

    }

    @Override
    public void updateBasicPhone(OperatorWechatAlterParam param) {

    }

    @Override
    public void deletePhone(Integer id) {

    }
}
