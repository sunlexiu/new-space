package com.warrior.mercury.service.phone;

import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.auto.TPhonebrandMapper;
import com.warrior.mercury.mapper.auto.TPhoneoperatingsystemMapper;
import com.warrior.mercury.mapper.ex.TPhoneExMapper;
import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;
import com.warrior.mercury.model.param.phone.BasicPhoneAddParam;
import com.warrior.mercury.model.param.query.PhoneBasicQueryPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

import static com.warrior.mercury.common.exception.BusinessCode.DATA_NOT_EXIST;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:17
 */
@Service
public class PhoneBasicServiceImpl implements IPhoneBasicService {

    @Resource
    private TPhoneExMapper phoneExMapper;

    @Resource
    private TPhonebrandMapper phoneBrandMapper;

    @Resource
    private TPhoneoperatingsystemMapper phoneSystemMapper;

    @Override
    public List<PhoneBasic> listBasicPhoneInfo(PhoneBasicQueryPage page) {
        return phoneExMapper.listBasicPhoneInfo(page);
    }

    @Override
    public void addBasicPhone(BasicPhoneAddParam param) {
        TPhonebrand brand = phoneBrandMapper.selectByPrimaryKey(param.getPhoneBrandId());
        if (Objects.isNull(brand)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }

        TPhoneoperatingsystem system = phoneSystemMapper.selectByPrimaryKey(param.getPhoneOperatingSystemId());
        if (Objects.isNull(system)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }

        phoneExMapper.insertSelective(param.convertToPhone());
    }
}
