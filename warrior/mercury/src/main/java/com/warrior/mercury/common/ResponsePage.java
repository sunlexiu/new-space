package com.warrior.mercury.common;

import com.github.pagehelper.Page;

import java.util.List;

/**
 * @author:       Charon
 * @create:       2020/6/12 9:10
 */
public class ResponsePage<T> {

    private List<T> data;
    private long count;
    private int page;
    private int size;

    private ResponsePage(List<T> pageList, long totalCount, int page, int pageSize){
        this.data = pageList;
        this.page = page;
        this.size = pageSize;
        this.count = totalCount;
    }


    public static <T> ResponsePage newPage(Page<T> page) {
        return new ResponsePage(page.getResult(), page.getTotal(), page.getPageNum(), page.getPageSize());
    }

    public List<T> getData() {
        return data;
    }

    public long getCount() {
        return count;
    }

    public int getPage() {
        return page;
    }

    public int getSize() {
        return size;
    }

}
