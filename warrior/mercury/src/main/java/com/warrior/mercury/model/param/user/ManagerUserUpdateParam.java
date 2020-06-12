package com.warrior.mercury.model.param.user;

import com.warrior.mercury.model.entity.auto.TSignup;

/**
 * @author:       Charon
 * @create:       2020/6/12 14:19
 */
public class ManagerUserUpdateParam extends ManagerUserAddParam {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public TSignup convertToSignUp() {
        TSignup user = convertToSignUp();
        user.setSignupid(id);
        return user;
    }
}
