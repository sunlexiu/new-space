package com.warrior.mercury.service.dictionary;

import com.warrior.mercury.mapper.auto.TPhonebrandMapper;
import com.warrior.mercury.mapper.auto.TPhoneoperatingsystemMapper;
import com.warrior.mercury.mapper.auto.TPhonestateMapper;
import com.warrior.mercury.mapper.ex.TPhoneExMapper;
import com.warrior.mercury.mapper.ex.TSignupExMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhonebrandExample;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystemExample;
import com.warrior.mercury.model.entity.auto.TPhonestate;
import com.warrior.mercury.model.entity.auto.TPhonestateExample;
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

    @Override
    public List<TPhonebrand> listAllPhoneBrand() {
        TPhonebrandExample example = new TPhonebrandExample();
        return phoneBrandMapper.selectByExample(example);
    }

    @Override
    public List<TPhoneoperatingsystem> listAllPhoneOperatingSystem() {
        TPhoneoperatingsystemExample example = new TPhoneoperatingsystemExample();
        return phoneOperatingSystemMapper.selectByExample(example);
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
        TPhonestateExample example = new TPhonestateExample();
        return phonestateMapper.selectByExample(example);
    }
}
