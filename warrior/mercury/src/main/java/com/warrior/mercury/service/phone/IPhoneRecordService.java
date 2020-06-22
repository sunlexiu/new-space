package com.warrior.mercury.service.phone;

import com.github.pagehelper.Page;
import com.warrior.mercury.model.dto.PhoneRecord;
import com.warrior.mercury.model.param.phone.PhoneRecordAddParam;
import com.warrior.mercury.model.param.phone.PhoneRecordQueryPage;
import com.warrior.mercury.model.param.phone.PhoneRecordUpdateParam;

/**
 * @author:       Charon
 * @create:       2020/6/15 16:17
 */
public interface IPhoneRecordService {

    /**
     * 分页查询手机使用记录
     *
     * @param page
     * @return
     */
    Page<PhoneRecord> listPhoneUsingRecord(PhoneRecordQueryPage page);


    /**
     * 增加手机使用记录
     *
     * @param param
     */
    void addPhoneUsingRecord(PhoneRecordAddParam param);


    /**
     * 修改手机使用记录
     *
     * @param param
     */
    void updatePhoneUsingRecord(PhoneRecordUpdateParam param);


    /**
     * 删除手机使用记录
     *
     * @param id
     */
    void deletePhoneUsingRecord(Integer id);
}
