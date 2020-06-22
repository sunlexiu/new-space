package com.warrior.mercury.service.phone;

import com.github.pagehelper.Page;
import com.warrior.mercury.model.dto.PhoneNumberRecord;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordAddParam;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordQueryPage;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordUpdateParam;

/**
 * @author:       Charon
 * @create:       2020/6/17 11:51
 */
public interface IPhoneNumberRecordService {

    /**
     * 分页查询手机使用记录
     *
     * @param page
     * @return
     */
    Page<PhoneNumberRecord > listPhoneNumberUsingRecord(PhoneNumberRecordQueryPage page);


    /**
     * 增加手机使用记录
     *
     * @param param
     */
    void addPhoneUsingRecord(PhoneNumberRecordAddParam param);


    /**
     * 修改手机使用记录
     *
     * @param param
     */
    void updatePhoneUsingRecord(PhoneNumberRecordUpdateParam param);


    /**
     * 删除手机使用记录
     *
     * @param id
     */
    void deletePhoneUsingRecord(Integer id);

}
