package com.warrior.mercury.service.user;

import com.warrior.mercury.model.entity.auto.TSignup;
import com.warrior.mercury.model.param.user.ManagerUserQueryPage;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/11 11:49
 */
public interface IUserService {


    /**
     * 分页查询管理员用户
     *
     * @param page
     * @return
     */
    List<TSignup> pageListSignUp(ManagerUserQueryPage page);


    /**
     * 根据id查询数据
     *
     * @param id
     * @return
     */
    TSignup selectSignUpById(Integer id);


    /**
     * 修改管理员账户
     *
     * @param manager
     */
    void updateSignUp(TSignup manager);


    /**
     * 添加管理员账户
     *
     * @param manager
     */
    void insertSignUp(TSignup manager);


    /**
     * 删除管理员账户
     *
     * @param id
     */
    void deleteSignUp(Integer id);

    /**
     * 根据用户名查询
     *
     * @param username
     * @return
     */
    TSignup getSignUpDetail(String username);
}
