package com.warrior.mercury.service.phone;

import com.warrior.mercury.common.exception.BusinessCode;
import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.ex.TPhonenumberExMapper;
import com.warrior.mercury.model.entity.auto.TPhonenumber;
import com.warrior.mercury.model.entity.auto.TPhonenumberExample;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoAddParam;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoQuery;
import com.warrior.mercury.model.param.phone.PhoneNumberInfoUpdateParam;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/17 11:51
 */
@Service
public class PhoneNumberInfoServiceImpl implements IPhoneNumberInfoService {

    @Resource
    private TPhonenumberExMapper phoneNumberMapper;

    @Override
    public List<TPhonenumber> listPhoneNumberInfo(PhoneNumberInfoQuery page) {
        TPhonenumberExample example = new TPhonenumberExample();
        example.createCriteria();
        return phoneNumberMapper.selectByExample(example);
    }

    @Override
    public void addPhoneNumber(PhoneNumberInfoAddParam param) {
        checkDataLegality(param.getPhoneNumber(), null);
        phoneNumberMapper.insertSelective(param.convertToDBType());
    }

    @Override
    public void updatePhoneNumber(PhoneNumberInfoUpdateParam param) {
        checkDataExist(param.getPhoneNumberID());
        checkDataLegality(param.getPhoneNumber(), param.getPhoneNumberID());
        phoneNumberMapper.updateByPrimaryKey(param.convertToDBType());
    }

    @Override
    public void deletePhoneNumber(Integer id) {
        checkDataExist(id);
        phoneNumberMapper.deleteByPrimaryKey(id);
    }

    private void checkDataExist(Integer id) {
        TPhonenumber number = phoneNumberMapper.selectByPrimaryKey(id);
        if (Objects.isNull(number)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }
    }

    private void checkDataLegality(String phoneNum, Integer id) {
        TPhonenumberExample example = new TPhonenumberExample();
        example.createCriteria().andPhoneNumberEqualTo(phoneNum);
        List<TPhonenumber> list = phoneNumberMapper.selectByExample(example);
        list.forEach(v -> {
            if (!v.getPhoneNumberID().equals(id)) {
                throw new BusinessException(BusinessCode.DATA_REPEAT);
            }
        });
    }
}
