package com.warrior.mercury.service.dictionary;

import com.warrior.mercury.mapper.auto.TPhonebrandMapper;
import com.warrior.mercury.mapper.auto.TPhoneoperatingsystemMapper;
import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhonebrandExample;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystemExample;
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
    private TPhonebrandMapper phoneBrandMapper;

    @Resource
    private TPhoneoperatingsystemMapper phoneOperatingSystemMapper;

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
}
