package com.zdw.java;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class DateTimeTest1 {
    @Test
    public  void testCalendar(){

//    1实例化
//    方式一 创建其子类（GregorianCalendar）的对象
//    方式二 调用其静态方法 getInstance()
        Calendar calendar =Calendar.getInstance();
//        System.out.println(calendar);
//        2.常用方法
//        get()
        int day1= calendar.get(Calendar.DAY_OF_MONTH);
        int day2= calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("今天是这个月的第"+day1+"天");
        System.out.println("今天是这一年的第："+day1+"天");
//        set()
        calendar.set(Calendar.DAY_OF_MONTH,24);
        day1 =calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("今天是这个月的第"+day1+"天");
//      add()
        calendar.add(Calendar.DAY_OF_MONTH,5);
        day1 =calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("今天是这个月的第"+day1+"天");
//      getTime() 日历类---》 Date
        Date date = calendar.getTime();
        System.out.println(date);
//      setTime()  Date---》日历类
        Date date1 =new Date();
        calendar.setTime(date1);
        day1 =calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day1);


    }

}
