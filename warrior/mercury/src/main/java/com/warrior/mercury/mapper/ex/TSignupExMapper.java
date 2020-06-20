package com.warrior.mercury.mapper.ex;

import com.github.pagehelper.Page;
import com.warrior.mercury.mapper.auto.TSignupMapper;
import com.warrior.mercury.model.dto.CommonSimpleDto;
import com.warrior.mercury.model.entity.auto.TSignup;
import com.warrior.mercury.model.param.user.ManagerUserQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/17 10:10
 */
public interface TSignupExMapper extends TSignupMapper {


    /**
     * 列出所有的手机使用者
     *
     * @return
     */
    List<CommonSimpleDto> listAllPhoneUser();


    /**
     * 分页查询
     *
     * @param page
     * @return
     */
    Page<TSignup> pageListSignUp(ManagerUserQueryPage page);
}
