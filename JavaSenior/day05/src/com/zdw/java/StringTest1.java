package com.zdw.java;

public class StringTest1 {
    String str = new String("good");
    char[] ch ={'t','e','s','t'};
    public void change(String str ,char ch[]){
        str ="test ok";
        ch[0]='b';
    }
    public static void main(String[] args) {
        StringTest1 S1 =new StringTest1();
        S1.change(S1.str, S1.ch);
        System.out.println(S1.str);
        System.out.println(S1.ch);
    }
}
