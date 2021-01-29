package com.zdw.java;
import org.junit.Test;

import java.util.ArrayList;

/**
 * 自定义泛型接口类
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
    @Test
    public void test2(){
        SubOrder sub1 =new SubOrder();
        //由于子类在继承带泛型的父类时,指明了泛型类型
//        则实例化子类对象是，不在需要指明泛型
        sub1.setOrderT(1122);
        SubOrder1<String> sub2 =new SubOrder1<>();
        sub2.setOrderT("order2.....");
    }
    @Test
    public void test3(){
        ArrayList<String> list =null;
        ArrayList<Integer>list1 =null;
        //泛型不同的引用不能相互赋值
        Person p1=null;
        Person p2=null;
    }
}
