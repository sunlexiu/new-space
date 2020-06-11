package com.warrior.mercury.model.vo;

/**
 * @author:       Charon
 * @create:       2020/6/9 22:20
 */
public class LoginVo {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public LoginVo setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginVo setPassword(String password) {
        this.password = password;
        return this;
    }
}
