package com.warrior.mercury.service.user;

import com.warrior.mercury.model.entity.auto.TSignup;
import com.warrior.mercury.model.vo.query.page.BasePage;

import java.util.List;
import java.util.Map;

/**
 * @author:       Charon
 * @create:       2020/6/11 11:49
 */
public interface IUserService {


    /**
     * 分页查询管理员用户
     *
     * @param page
     * @param conditionMap
     * @return
     */
    List<TSignup> pageListSignUp(BasePage page, Map<String, Object> conditionMap);


    /**
     * 添加管理员账户
     *
     * @param manager
     */
    void insertSignUp(TSignup manager);


    /**
     * 修改管理员账户
     *
     * @param manager
     * @return
     */
    TSignup updateSignUp(TSignup manager);


    /**
     * 删除管理员账户
     *
     * @param id
     */
    void deleteSignUp(Integer id);
}
