package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TPhoneusinglogMapper;
import com.warrior.mercury.model.dto.PhoneRecord;
import com.warrior.mercury.model.param.phone.PhoneRecordQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 9:16
 */
public interface TPhoneusinglogExMapper extends TPhoneusinglogMapper {


    /**
     * 分页查询手机使用记录
     *
     * @param page
     * @return
     */
    List<PhoneRecord> listPhoneUsingRecord(PhoneRecordQueryPage page);


    /**
     * 更新手机使用记录的结束时间
     *
     */
    void updateRecordEndDate(Integer phoneId);
}
