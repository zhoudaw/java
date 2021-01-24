package com.zdw.java;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateTimeTest {

    @Test
    public void testSipleDateFormat() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat();
//        格式化：日期---》字符串
        Date date =new Date();
        String str= sdf.format(date);
        System.out.println(str);  // 21-1-23 下午12:36
        // 解析： 格式化的逆过程，字符串--》日期
        String str1 ="2020-01-23";
        Date str2= sdf.parse(str); //Sat Jan 23 12:36:00 CST 2021
        System.out.println(str2);
//        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-mmmmm.dd GG hh:mm aaa");
        SimpleDateFormat sdf1= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String str3 = sdf1.format(date);
        System.out.println(str3);  //.2021-01-23 12:36:15
    }

    //练习
//   字符串

}
