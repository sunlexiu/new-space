package com.warrior.mercury.model.param;

/**
 * @author:       Charon
 * @create:       2020/6/20 15:43
 */
public interface Page {

    /**
     * 页码数
     *
     * @return
     */
    int page();

    /**
     * 每页的最大数据量
     *
     * @return
     */
    int size();


    /**
     * 排序
     *
     * @return
     */
    String orderBy();
}
