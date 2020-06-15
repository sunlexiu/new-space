package com.warrior.mercury.service.phone;

import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.auto.TPhonebrandMapper;
import com.warrior.mercury.mapper.auto.TPhoneoperatingsystemMapper;
import com.warrior.mercury.mapper.ex.TPhoneExMapper;
import com.warrior.mercury.model.dto.PhoneBasic;
import com.warrior.mercury.model.entity.auto.TPhone;
import com.warrior.mercury.model.entity.auto.TPhoneExample;
import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;
import com.warrior.mercury.model.param.phone.BasicPhoneAddParam;
import com.warrior.mercury.model.param.phone.BasicPhoneUpdateParam;
import com.warrior.mercury.model.param.query.PhoneBasicQueryPage;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

import static com.warrior.mercury.common.exception.BusinessCode.DATA_NOT_EXIST;
import static com.warrior.mercury.common.exception.BusinessCode.DATA_REPEAT;

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
        checkDataEffective(param, null);
        phoneExMapper.insertSelective(param.convertToPhone());
    }

    @Override
    public void updateBasicPhone(BasicPhoneUpdateParam param) {
        TPhone phoneDB = phoneExMapper.selectByPrimaryKey(param.getId());
        if (Objects.isNull(phoneDB)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }

        checkDataEffective(param, param.getId());
        phoneExMapper.updateByPrimaryKeySelective(param.convertToPhone());
    }

    private void checkDataEffective(BasicPhoneAddParam param, Integer id) {
        TPhoneExample example = new TPhoneExample();
        example.createCriteria().andPhoneNoEqualTo(param.getPhoneNo());
        List<TPhone> phoneList = phoneExMapper.selectByExample(example);
        if (!phoneList.isEmpty()) {
            phoneList.forEach(v -> {
                if (!v.getPhoneID().equals(id)) {
                    throw new BusinessException(DATA_REPEAT);
                }
            });

        }

        TPhonebrand brand = phoneBrandMapper.selectByPrimaryKey(param.getPhoneBrandId());
        if (Objects.isNull(brand)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }

        TPhoneoperatingsystem system = phoneSystemMapper.selectByPrimaryKey(param.getPhoneOperatingSystemId());
        if (Objects.isNull(system)) {
            throw new BusinessException(DATA_NOT_EXIST);
        }
    }
}
