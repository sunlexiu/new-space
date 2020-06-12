package com.warrior.mercury.common;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/12 9:10
 */
public class ResponsePage<T> {

    private List<T> rows;
    private long total;
    private int page;
    private int size;

    private ResponsePage(List<T> pages, int page, int size){
        this.rows = pages;
        this.total = pages.size();
        this.page = page;
        this.size = size;
    }

    public static <T> ResponsePage<T> newPage(List<T> pages) {
        return newPage(pages, 0, 10);
    }

    public static <T> ResponsePage<T> newPage(List<T> pages, int page, int size) {
        return new ResponsePage<>(pages, page, size);
    }

    public List<T> getRows() {
        return rows;
    }

    public long getTotal() {
        return total;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

}
