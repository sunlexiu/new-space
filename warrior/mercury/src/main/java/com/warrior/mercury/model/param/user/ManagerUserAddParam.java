package com.warrior.mercury.model.param.user;

import com.warrior.mercury.model.entity.auto.TSignup;

/**
 * @author:       Charon
 * @create:       2020/6/11 22:55
 */
public class ManagerUserAddParam {

    private String username;

    private String password;

    private Integer disabled;

    public TSignup convertToSignUp() {
        TSignup up = new TSignup();
        up.setLoginname(username);
        up.setPassword(password);
        up.setDisabled(disabled.byteValue());
        return up;
    }

    public String getUsername() {
        return username;
    }

    public ManagerUserAddParam setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ManagerUserAddParam setPassword(String password) {
        this.password = password;
        return this;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }
}
