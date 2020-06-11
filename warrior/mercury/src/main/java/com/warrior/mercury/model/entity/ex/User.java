package com.warrior.mercury.model.entity.ex;

import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/10 11:34
 */
public class User {

    private String id;

    private String openId;

    @NonNull
    private String username;

    @NonNull
    private String password;

    @NonNull
    private String phone;

    private int isDel;

    private Long registerTime;

    private String roleId;

    private List<Role> roleList;

    public User() { }

    public boolean getIsDelBoolean(){
        return isDel == 0;
    }

    public String getRoleCode(){
        StringBuilder roleCode = new StringBuilder();
        for (Role role : roleList){
            if(roleCode.length() > 0){
                roleCode.append(",");
            }
            roleCode.append(role.getName());
        }
        return roleCode.toString();
    }

    public String getRoleDescription(){
        StringBuilder roleName = new StringBuilder();
        for (Role role : roleList){
            if(roleName.length() > 0){
                roleName.append(",");
            }
            roleName.append(role.getDescription());
        }
        return roleName.toString();
    }

    static public boolean checkUserInfo(User user) {
        return true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @NonNull
    public String getUsername() {
        return username;
    }

    public void setUsername(@NonNull String username) {
        this.username = username;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public String getPhone() {
        return phone;
    }

    public void setPhone(@NonNull String phone) {
        this.phone = phone;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public Long getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
