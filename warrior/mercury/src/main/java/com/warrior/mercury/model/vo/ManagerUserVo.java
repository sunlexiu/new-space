package com.warrior.mercury.model.vo;

import com.warrior.mercury.model.entity.auto.TSignup;

/**
 * @author:       Charon
 * @create:       2020/6/11 22:55
 */
public class ManagerUserVo {

    private String username;

    private String password;

    private Integer disable;

    public TSignup convertToSignUp() {
        TSignup up = new TSignup();
        up.setLoginname(username);
        up.setPassword(password);
        up.setDisabled(disable.byteValue());
        return up;
    }

    public String getUsername() {
        return username;
    }

    public ManagerUserVo setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ManagerUserVo setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getDisable() {
        return disable;
    }

    public ManagerUserVo setDisable(Integer disable) {
        this.disable = disable;
        return this;
    }
}
