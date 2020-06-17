package com.warrior.mercury.service.phone;

import com.warrior.mercury.common.exception.BusinessCode;
import com.warrior.mercury.common.exception.BusinessException;
import com.warrior.mercury.mapper.auto.TPhonenumberpurposeMapper;
import com.warrior.mercury.mapper.auto.TPhonenumberstateMapper;
import com.warrior.mercury.mapper.ex.TPhonenumberExMapper;
import com.warrior.mercury.mapper.ex.TPhonenumberusinglogExMapper;
import com.warrior.mercury.mapper.ex.TSignupExMapper;
import com.warrior.mercury.model.dto.PhoneNumberRecord;
import com.warrior.mercury.model.entity.auto.TPhonenumber;
import com.warrior.mercury.model.entity.auto.TPhonenumberpurpose;
import com.warrior.mercury.model.entity.auto.TPhonenumberstate;
import com.warrior.mercury.model.entity.auto.TPhonenumberusinglog;
import com.warrior.mercury.model.entity.auto.TSignup;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordAddParam;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordQueryPage;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordUpdateParam;
import com.warrior.mercury.util.DateTimeFormatUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * @author:       Charon
 * @create:       2020/6/17 14:42
 */
@Service
public class PhoneNumberRecordServiceImpl implements IPhoneNumberRecordService {

    @Resource
    private TPhonenumberusinglogExMapper phoneNumberUsingLogExMapper;

    @Resource
    private TPhonenumberExMapper phoneNumberExMapper;

    @Resource
    private TPhonenumberpurposeMapper phoneNumberPurposeMapper;

    @Resource
    private TSignupExMapper signUpExMapper;

    @Resource
    private TPhonenumberstateMapper phoneNumberStateMapper;

    @Override
    public List<PhoneNumberRecord> listPhoneNumberUsingRecord(PhoneNumberRecordQueryPage page) {
        return phoneNumberUsingLogExMapper.listPhoneNumberUsingRecord(page);
    }

    @Override
    public void addPhoneUsingRecord(PhoneNumberRecordAddParam param) {
        checkLegality(param);
        TPhonenumberusinglog log = param.convertToDBType();
        // 更新当前手机号上一次记录的结束时间
        phoneNumberUsingLogExMapper.updateRecordEndDate(param.getPhoneNumberID());
        log.setCreatedDateTime(DateTimeFormatUtil.formatNow(DateTimeFormatUtil.FormatEnum.DATE_TIME));
        phoneNumberUsingLogExMapper.insertSelective(log);
    }

    @Override
    public void updatePhoneUsingRecord(PhoneNumberRecordUpdateParam param) {
        checkDataExist(param.getPhoneNumberUsingLogID());
        checkLegality(param);
        phoneNumberUsingLogExMapper.updateByPrimaryKeySelective(param.convertToDBType());
    }

    @Override
    public void deletePhoneUsingRecord(Integer id) {
        checkDataExist(id);
        phoneNumberUsingLogExMapper.deleteByPrimaryKey(id);
    }

    private void checkDataExist(Integer id) {
        TPhonenumberusinglog logDB = phoneNumberUsingLogExMapper.selectByPrimaryKey(id);
        if (Objects.isNull(logDB)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }
    }

    private void checkLegality(PhoneNumberRecordAddParam param) {
        TPhonenumber phoneNumber = phoneNumberExMapper.selectByPrimaryKey(param.getPhoneNumberID());
        if (Objects.isNull(phoneNumber)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        TPhonenumberpurpose purpose = phoneNumberPurposeMapper.selectByPrimaryKey(param.getPhoneNumberPurposeID());
        if (Objects.isNull(purpose)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        TSignup user = signUpExMapper.selectByPrimaryKey(param.getPhoneNumberUserPersonID());
        if (Objects.isNull(user)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        TPhonenumberstate state = phoneNumberStateMapper.selectByPrimaryKey(param.getPhoneNumberStateID());
        if (Objects.isNull(state)) {
            throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
        }

        if (!Objects.isNull(param.getParentPhoneNumberID())) {
            if (param.getParentPhoneNumberID().equals(param.getPhoneNumberID())) {
                throw new BusinessException(BusinessCode.DATA_REPEAT);
            }

            TPhonenumber parent = phoneNumberExMapper.selectByPrimaryKey(param.getParentPhoneNumberID());
            if (Objects.isNull(parent)) {
                throw new BusinessException(BusinessCode.DATA_NOT_EXIST);
            }
        }
    }

}
