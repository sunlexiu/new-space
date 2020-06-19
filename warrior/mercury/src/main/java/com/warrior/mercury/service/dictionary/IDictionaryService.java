package com.warrior.mercury.service.dictionary;

import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.entity.auto.TOperationWechatState;
import com.warrior.mercury.model.entity.auto.TPhonebrand;
import com.warrior.mercury.model.entity.auto.TPhonenumberpurpose;
import com.warrior.mercury.model.entity.auto.TPhonenumberstate;
import com.warrior.mercury.model.entity.auto.TPhoneoperatingsystem;
import com.warrior.mercury.model.entity.auto.TPhonestate;
import com.warrior.mercury.model.entity.auto.TWeChatCustomerEvaluation;
import com.warrior.mercury.model.entity.auto.TWechatCustomerActivitySource;
import com.warrior.mercury.model.entity.auto.TWechatCustomerAddingSource;
import com.warrior.mercury.model.entity.auto.TWechatPurpose;

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

    /**
     * 查找所有的手机
     *
     * @return
     */
    List<CommonSimpleDto> listAllPhone();

    /**
     * 查找所有的手机使用人
     *
     * @return
     */
    List<CommonSimpleDto> listAllPhoneUser();

    /**
     * 查找所有的手机状态
     *
     * @return
     */
    List<TPhonestate> listAllPhoneState();

    /**
     * 查询所有的手机号
     *
     * @return
     */
    List<CommonSimpleDto> listAllPhoneNumber();

    /**
     * 查找所有手机号码用途
     *
     */
    List<TPhonenumberpurpose> listAllPhoneNumberPurpose();

    /**
     * 查找所有的手机号码状态
     *
     * @return
     */
    List<TPhonenumberstate> listAllPhoneNumberState();


    /**
     * 查找所有的微信状态
     *
     * @return
     */
    List<TOperationWechatState> listAllWechatState();


    /**
     * 查找所有的微信使用用途
     *
     * @return
     */
    List<TWechatPurpose> listAllWechatPurpose();

    /**
     * 查找所有的运营微信
     *
     * @return
     */
    List<CommonSimpleDto> listAllOperationWechat();

    /**
     * 查找所有业务来源
     *
     * @return
     */
    List<TWechatCustomerActivitySource> listAllActivitySource();

    /**
     * 查找所有的用户来源
     *
     * @return
     */
    List<TWechatCustomerAddingSource> listAllAddingSource();

    /**
     * 查找所有的用户头衔
     *
     * @return
     */
    List<CommonSimpleDto> listAllTitle();

    /**
     * 查找所有的评价登记
     *
     * @return
     */
    List<TWeChatCustomerEvaluation> listAllEvaluation();
}
