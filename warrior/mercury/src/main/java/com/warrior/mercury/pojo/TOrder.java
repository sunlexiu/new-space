package com.warrior.mercury.pojo;

/**
 * @author:       Charon
 * @create:       2020/6/1 21:51
 */
public class TOrder {

    private Integer id;

    private Integer orderCode;

    private Double orderAmount;

    public Integer getId() {
        return id;
    }

    public TOrder setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getOrderCode() {
        return orderCode;
    }

    public TOrder setOrderCode(Integer orderCode) {
        this.orderCode = orderCode;
        return this;
    }

    public Double getOrderAmount() {
        return orderAmount;
    }

    public TOrder setOrderAmount(Double orderAmount) {
        this.orderAmount = orderAmount;
        return this;
    }
}
