package com.warrior.mercury.model.param.query;

import com.warrior.mercury.model.param.query.page.BasePage;

/**
 * @author:       Charon
 * @create:       2020/6/11 22:33
 */
public class ManagerUserQueryPage extends BasePage {

    private String username;

    private Integer disabled;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }
}
