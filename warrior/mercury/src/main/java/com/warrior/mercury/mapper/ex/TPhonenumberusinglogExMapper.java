package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TPhonenumberusinglogMapper;
import com.warrior.mercury.model.dto.PhoneNumberRecord;
import com.warrior.mercury.model.param.phone.PhoneNumberRecordQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 14:45
 */
public interface TPhonenumberusinglogExMapper extends TPhonenumberusinglogMapper {


    /**
     * 分页查询手机使用记录
     *
     * @param page
     * @return
     */
    List<PhoneNumberRecord > listPhoneNumberUsingRecord(PhoneNumberRecordQueryPage page);


    /**
     * 更新当前手机号上一次记录的结束时间
     *
     * @param phoneNumId
     */
    void updateRecordEndDate(Integer phoneNumId);
}
