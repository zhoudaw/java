package com.zdw.java;

import org.junit.Test;

/**
 *
 * 自定义泛型接口类
 *
 */
public class GengericTest1 {
    @Test
    public  void test1(){
        //如果定义了泛型，实例化没有指明类的泛型，则认为此泛型为Object类型
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指明的泛型。
        Order order= new Order();
        order.setOrderT(12);
        order.setOrderT("sd");
        //建议：实例化时指明的泛型
        Order<String> order1 =new Order<String>("orderAA",1001,"order:AA");
        order1.setOrderT("aa:hell");

    }
}
