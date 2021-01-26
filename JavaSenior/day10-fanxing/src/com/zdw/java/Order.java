package com.zdw.java;

public class Order<T> {
    String orederName;
    int orderId;

    //类的内部结就可以使用类的泛型
    T orderT;
    public Order() {};
    public Order(String orederName,int orderId,T orderT){
        this.orederName=orederName;
        this.orderId=orderId;
        this.orderT=orderT;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orederName='" + orederName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}
