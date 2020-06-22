package com.warrior.mercury.service.phone;

import com.github.pagehelper.Page;
import com.warrior.mercury.common.exception.BusinessCode;
import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.auto.TPhonestateMapper;
import com.warrior.mercury.mapper.ex.TPhoneExMapper;
import com.warrior.mercury.mapper.ex.TPhoneusinglogExMapper;
import com.warrior.mercury.mapper.ex.TSignupExMapper;
import com.warrior.mercury.model.dto.PhoneRecord;
import com.warrior.mercury.model.entity.auto.TPhone;
import com.warrior.mercury.model.entity.auto.TPhonestate;
import com.warrior.mercury.model.entity.auto.TPhoneusinglog;
import com.warrior.mercury.model.entity.auto.TSignup;
import com.warrior.mercury.model.param.phone.PhoneRecordAddParam;
import com.warrior.mercury.model.param.phone.PhoneRecordQueryPage;
import com.warrior.mercury.model.param.phone.PhoneRecordUpdateParam;
import com.warrior.mercury.util.DateTimeFormatUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:17
 */
@Service
public class PhoneRecordServiceImpl implements IPhoneRecordService {

    @Resource
    private TPhoneusinglogExMapper phoneUsingLogExMapper;

    @Resource
    private TSignupExMapper signUpExMapper;

    @Resource
    private TPhonestateMapper phoneStateMapper;

    @Resource
    private TPhoneExMapper phoneExMapper;

    @Override
    public Page<PhoneRecord> listPhoneUsingRecord(PhoneRecordQueryPage page) {
        return phoneUsingLogExMapper.listPhoneUsingRecord(page);
    }

    @Override
    public void addPhoneUsingRecord(PhoneRecordAddParam param) {
        checkLegality(param);
        // 将该手机上一次的使用记录结束时间设置为now
        phoneUsingLogExMapper.updateRecordEndDate(param.getPhoneID());
        TPhoneusinglog log = param.convertToUsingLog();
        log.setCreatedDateTime(DateTimeFormatUtil.format(new Date(), DateTimeFormatUtil.FormatEnum.DATE_TIME));
        phoneUsingLogExMapper.insertSelective(log);
    }

    @Override
    public void updatePhoneUsingRecord(PhoneRecordUpdateParam param) {

    }

    @Override
    public void deletePhoneUsingRecord(Integer id) {
        checkExist(id);
        phoneUsingLogExMapper.deleteByPrimaryKey(id);
    }

    private void checkExist(Integer id) {
        TPhoneusinglog log = phoneUsingLogExMapper.selectByPrimaryKey(id);
        if (Objects.isNull(log)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }
    }

    private void checkLegality(PhoneRecordAddParam param) {
        TPhone phone = phoneExMapper.selectByPrimaryKey(param.getPhoneID());
        if (Objects.isNull(phone)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        TPhonestate state = phoneStateMapper.selectByPrimaryKey(param.getPhoneStateID());
        if (Objects.isNull(state)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        TSignup person = signUpExMapper.selectByPrimaryKey(param.getPhoneUserPersonID());
        if (Objects.isNull(person)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }
    }
}
