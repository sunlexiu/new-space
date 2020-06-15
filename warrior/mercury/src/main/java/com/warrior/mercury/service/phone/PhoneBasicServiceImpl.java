package com.warrior.mercury.service.phone;

import com.warrior.mercury.mapper.ex.TPhoneExMapper;
import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.param.query.PhoneBasicQueryPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:17
 */
@Service
public class PhoneBasicServiceImpl implements IPhoneBasicService {

    @Resource
    private TPhoneExMapper phoneExMapper;

    @Override
    public List<PhoneBasic> listBasicPhoneInfo(PhoneBasicQueryPage page) {
        return phoneExMapper.listBasicPhoneInfo(page);
    }
}
