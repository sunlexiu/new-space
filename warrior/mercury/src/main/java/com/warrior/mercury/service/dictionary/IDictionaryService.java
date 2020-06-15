package com.warrior.mercury.service.dictionary;

import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/15 17:38
 */
public interface IDictionaryService {

    /**
     * 查找所有手机品牌
     *
     * @return
     */
    List<TPhonebrand> listAllPhoneBrand();


    /**
     * 查找所有手机系统
     *
     * @return
     */
    List<TPhoneoperatingsystem> listAllPhoneOperatingSystem();
}
