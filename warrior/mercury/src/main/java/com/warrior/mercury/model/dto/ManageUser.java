package com.warrior.mercury.model.dto;

import com.warrior.mercury.model.entity.auto.TSignup;

/**
 * @author:       Charon
 * @create:       2020/6/11 22:38
 */
public class ManageUser {

    private Integer id;

    private String name;

    private Byte disabled;

    public static ManageUser convertFromSignUpUser(TSignup up) {
        ManageUser user = new ManageUser();
        user.setId(up.getSignupid());
        user.setName(up.getLoginname());
        user.setDisabled(up.getDisabled());
        return user;
    }

    public Integer getId() {
        return id;
    }

    public ManageUser setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ManageUser setName(String name) {
        this.name = name;
        return this;
    }

    public Byte getDisabled() {
        return disabled;
    }

    public ManageUser setDisabled(Byte disabled) {
        this.disabled = disabled;
        return this;
    }
}
