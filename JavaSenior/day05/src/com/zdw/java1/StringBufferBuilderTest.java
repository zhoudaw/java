package com.zdw.java1;

/**
 * String   不可以变的字符序列，底层使用char[]存储
 * StringBuffer   可变的字符序列 线程安全的，效率低，底层使用char[]存储
 * StringBuilder  可变的字符序列 jdk.5新增，线程不安全，效率高，底层使用char[]存储
 */

public class StringBufferBuilderTest {
    public static void main(String[] args) {
        StringBuffer Str=new StringBuffer("abcd");
        Str.setCharAt(0,'m');
        System.out.println(Str);
    }
}
