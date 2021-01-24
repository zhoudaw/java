package com.zdw.java;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeTest2 {

//  LocalDate localTime localDateTime 使用
    @Test
    public void testDate(){
        LocalDate data1 = LocalDate.now();
        LocalTime data2= LocalTime.now();
        LocalDateTime data3=LocalDateTime.now();

        System.out.println(data1);
        System.out.println(data2);
        System.out.println(data3);

//        of 设置指定年，月，日，时，分,秒，没有偏移量
        LocalDateTime LocalDateTime1= LocalDateTime.of(2020,01,22,15,57,50);
        System.out.println(LocalDateTime1);
//        getxxx
        System.out.println(data3.getDayOfMonth());
        System.out.println(data3.getDayOfWeek());
        System.out.println(data3.getMonthValue());
        System.out.println(data3.getMinute());
        System.out.println(data3.getMonth());

//       体现不可变性
        LocalDate data4=     data1.withDayOfMonth(22);
        System.out.println(data4);
    }

}
