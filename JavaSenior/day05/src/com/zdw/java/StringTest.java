package com.zdw.java;

/**
 *  String的使用
 *  1.String 声明为final的 不可继承
 *  2.String 实现了Serializable接口：表示字符串是支持序列化的.
 *           实现了Comparable接口：表示String 可以比较大小
 *  3.String 内部定义了final  char[] vlaue用于存储字符串数据
 *  4.String 代表不可以变的的字符序列。简称：不可变性
 *  体现：
 */


public class StringTest {
    public static void main(String[] args) {
//        String s1 ="abc";
//        String s2 ="abc";
//        s1="hello";
//        System.out.println(s1==s2);
//        System.out.println(s1);
//        System.out.println(s2);
//        String s4 ="zdw";
//        String s5 =s4.replace('z','l');
//        System.out.println(s4);
//        System.out.println(s5);

        String str ="厦厦门软件园二区东门东";
        String str1 = str.replace("厦门","福州");
        System.out.println(str1);
        System.out.println(str);

        String str2 ="12412hello12412worldjava11451mysql";
//                把是所有的数字改为，再开头是数字和接口数字的清空
        String str3 =str2.replaceAll("\\d+",",").replaceAll("^,|,$","");
        System.out.println(str3);
    }

}
