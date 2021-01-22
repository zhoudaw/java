package com.zdw.java2;

import org.junit.Test;

import java.util.Date;

/**
 * system 类
 *
 * java.util.Date
 * java.sql.Date类
 */


public class DateTimeTest {
//    public static void main(String[] args) {
//     long time =System.currentTimeMillis();
//     System.out.println(time);
//        Date date1 =new Date();
//        System.out.println(date1.toString());
//        System.out.println(date1.getTime());
//
//    }
//        reverse()
//    方式一
        public  String reverse(String str,int startIndex,int endIndex){
            if(str !=null && str.length() !=0){
                char[] arr = str.toCharArray();
                for(int x =startIndex,y=endIndex;x<y;x++,y--){
                    char temp =arr[x];
                    arr[x]=arr[y];
                    arr[y]=temp;
                }
                return new String(arr);
            }
            return null;
        }


    @Test
    public  void  testReverse(){
            String str ="abcdefg";  //abfedcg
        String str1 = reverse(str,2,5);
        System.out.println(str1);
    }

}
