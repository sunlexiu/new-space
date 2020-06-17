package com.warrior.mercury.model.param;

/**
 * @author:       Charon
 * @create:       2020/6/11 22:34
 */
public class BasePage {

    private int page;

    private int size;

    public int getPage() {
        return page;
    }

    public BasePage setPage(int page) {
        this.page = page;
        return this;
    }

    public int getSize() {
        return size;
    }

    public BasePage setSize(int size) {
        this.size = size;
        return this;
    }
}
