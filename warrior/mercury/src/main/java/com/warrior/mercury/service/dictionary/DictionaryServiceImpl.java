package com.warrior.mercury.service.dictionary;

import com.warrior.mercury.mapper.auto.TOperationWechatStateMapper;
import com.warrior.mercury.mapper.auto.TPhonebrandMapper;
import com.warrior.mercury.mapper.auto.TPhonenumberpurposeMapper;
import com.warrior.mercury.mapper.auto.TPhonenumberstateMapper;
import com.warrior.mercury.mapper.auto.TPhoneoperatingsystemMapper;
import com.warrior.mercury.mapper.auto.TPhonestateMapper;
import com.warrior.mercury.mapper.auto.TWechatPurposeMapper;
import com.warrior.mercury.mapper.ex.TOperationWechatExMapper;
import com.warrior.mercury.mapper.ex.TPhoneExMapper;
import com.warrior.mercury.mapper.ex.TPhonenumberExMapper;
import com.warrior.mercury.mapper.ex.TSignupExMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.entity.auto.TOperationWechatState;
import com.warrior.mercury.model.entity.auto.TOperationWechatStateExample;
import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhonebrandExample;
import com.warrior.mercury.model.entity.auto.TPhonenumberpurpose;
import com.warrior.mercury.model.entity.auto.TPhonenumberpurposeExample;
import com.warrior.mercury.model.entity.auto.TPhonenumberstate;
import com.warrior.mercury.model.entity.auto.TPhonenumberstateExample;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystemExample;
import com.warrior.mercury.model.entity.auto.TPhonestate;
import com.warrior.mercury.model.entity.auto.TPhonestateExample;
import com.warrior.mercury.model.entity.auto.TWechatPurpose;
import com.warrior.mercury.model.entity.auto.TWechatPurposeExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/15 17:38
 */
@Service
public class DictionaryServiceImpl implements IDictionaryService {

    @Resource
    private TPhoneExMapper phoneExMapper;

    @Resource
    private TSignupExMapper signupExMapper;

    @Resource
    private TPhonebrandMapper phoneBrandMapper;

    @Resource
    private TPhoneoperatingsystemMapper phoneOperatingSystemMapper;

    @Resource
    private TPhonestateMapper phonestateMapper;

    @Resource
    private TPhonenumberpurposeMapper phoneNumberPurposeMapper;

    @Resource
    private TPhonenumberExMapper phoneNumberExMapper;

    @Resource
    private TPhonenumberstateMapper phoneNumberStateMapper;

    @Resource
    private TWechatPurposeMapper wechatPurposeMapper;

    @Resource
    private TOperationWechatStateMapper operationWechatStateMapper;

    @Resource
    private TOperationWechatExMapper operationWechatExMapper;

    @Override
    public List<TPhonebrand> listAllPhoneBrand() {
        return phoneBrandMapper.selectByExample(new TPhonebrandExample());
    }

    @Override
    public List<TPhoneoperatingsystem> listAllPhoneOperatingSystem() {
        return phoneOperatingSystemMapper.selectByExample(new TPhoneoperatingsystemExample());
    }

    @Override
    public List<CommonSimpleDto> listAllPhone() {
        return phoneExMapper.listAllPhone();
    }

    @Override
    public List<CommonSimpleDto> listAllPhoneUser() {
        return signupExMapper.listAllPhoneUser();
    }

    @Override
    public List<TPhonestate> listAllPhoneState() {
        return phonestateMapper.selectByExample(new TPhonestateExample());
    }

    @Override
    public List<TPhonenumberpurpose> listAllPhoneNumberPurpose() {
        return phoneNumberPurposeMapper.selectByExample(new TPhonenumberpurposeExample());
    }

    @Override
    public List<CommonSimpleDto> listAllPhoneNumber() {
        return phoneNumberExMapper.listAllPhoneNumber();
    }

    @Override
    public List<TPhonenumberstate> listAllPhoneNumberState() {
        return phoneNumberStateMapper.selectByExample(new TPhonenumberstateExample());
    }

    @Override
    public List<TOperationWechatState> listAllWechatState() {
        return operationWechatStateMapper.selectByExample(new TOperationWechatStateExample());
    }

    @Override
    public List<TWechatPurpose> listAllWechatPurpose() {
        return wechatPurposeMapper.selectByExample(new TWechatPurposeExample());
    }

    @Override
    public List<CommonSimpleDto> listAllOperationWechat() {
        return operationWechatExMapper.listAllOperationWechat();
    }
}
