package com.warrior.mercury.mapper.ex;

import com.warrior.mercury.mapper.auto.TPhonenumberMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 16:27
 */
public interface TPhonenumberExMapper extends TPhonenumberMapper {

    /**
     * 查询所有的手机号
     *
     * @return
     */
    List<CommonSimpleDto> listAllPhoneNumber();

}
