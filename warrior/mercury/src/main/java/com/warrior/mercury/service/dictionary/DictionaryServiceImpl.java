package com.warrior.mercury.service.dictionary;

import com.warrior.mercury.mapper.auto.TOperationWechatStateMapper;
import com.warrior.mercury.mapper.auto.TPhonebrandMapper;
import com.warrior.mercury.mapper.auto.TPhonenumberpurposeMapper;
import com.warrior.mercury.mapper.auto.TPhonenumberstateMapper;
import com.warrior.mercury.mapper.auto.TPhoneoperatingsystemMapper;
import com.warrior.mercury.mapper.auto.TPhonestateMapper;
import com.warrior.mercury.mapper.auto.TTitleMapper;
import com.warrior.mercury.mapper.auto.TWeChatCustomerEvaluationMapper;
import com.warrior.mercury.mapper.auto.TWechatCustomerActivitySourceMapper;
import com.warrior.mercury.mapper.auto.TWechatCustomerAddingSourceMapper;
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
import com.warrior.mercury.model.entity.auto.TTitle;
import com.warrior.mercury.model.entity.auto.TTitleExample;
import com.warrior.mercury.model.entity.auto.TWeChatCustomerEvaluation;
import com.warrior.mercury.model.entity.auto.TWeChatCustomerEvaluationExample;
import com.warrior.mercury.model.entity.auto.TWechatCustomerActivitySource;
import com.warrior.mercury.model.entity.auto.TWechatCustomerActivitySourceExample;
import com.warrior.mercury.model.entity.auto.TWechatCustomerAddingSource;
import com.warrior.mercury.model.entity.auto.TWechatCustomerAddingSourceExample;
import com.warrior.mercury.model.entity.auto.TWechatPurpose;
import com.warrior.mercury.model.entity.auto.TWechatPurposeExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

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

    @Resource
    private TWechatCustomerActivitySourceMapper wechatCustomerActivitySourceMapper;

    @Resource
    private TWechatCustomerAddingSourceMapper wechatCustomerAddingSourceMapper;

    @Resource
    private TTitleMapper titleMapper;

    @Resource
    private TWeChatCustomerEvaluationMapper weChatCustomerEvaluationMapper;

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

    @Override
    public List<TWechatCustomerActivitySource> listAllActivitySource() {
        return wechatCustomerActivitySourceMapper.selectByExample(new TWechatCustomerActivitySourceExample());
    }

    @Override
    public List<TWechatCustomerAddingSource> listAllAddingSource() {
        return wechatCustomerAddingSourceMapper.selectByExample(new TWechatCustomerAddingSourceExample());
    }

    @Override
    public List<CommonSimpleDto> listAllTitle() {
        return titleMapper.selectByExample(new TTitleExample())
                .stream().map(this::convert).collect(Collectors.toList());
    }

    @Override
    public List<TWeChatCustomerEvaluation> listAllEvaluation() {
        return weChatCustomerEvaluationMapper.selectByExample(new TWeChatCustomerEvaluationExample());
    }

    private CommonSimpleDto convert(TTitle title) {
        CommonSimpleDto dto = new CommonSimpleDto();
        dto.setId(title.getTitleID());
        dto.setName(title.getTitle());
        return dto;
    }
}
