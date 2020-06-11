package com.warrior.mercury.model.dto;

import java.io.Serializable;
import java.util.List;

public class Menu implements Serializable {
    //编号
    private String id;
    //菜单名
    private String name;
    //父菜单编号
    private String parentId;
    //菜单级别
    private int level;
    //地址
    private String url;
    //顺序
    private int order;
    //备注
    private String remarks;
    //孩子结点
    private List<Menu> children;

    public void addChildren(Menu menu){
        children.add(menu);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public List<Menu> getChildren() {
        return children;
    }

    public void setChildren(List<Menu> children) {
        this.children = children;
    }
}