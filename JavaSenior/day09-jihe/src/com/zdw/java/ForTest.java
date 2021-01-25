package com.zdw.java;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collection;
public class ForTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("TOM",28));
        coll.add(new String("zdw"));
        coll.add(false);
        //for(集合中元素的类型 局部遍历 : 集合对象)
        for(Object obj:coll){
            System.out.println(obj);
        }
    }
    @Test
    public void test2(){
       int[] arr =new int[]{1,2,3,4,5,6,7};
       //fro(数组元素的类型，局部遍历：数组对象）
       for(int i :arr){
           System.out.println(i);
       }
    }
    @Test
    public void test3(){
     String[] arr = new  String[]{"aa","bb","nn","haha"};
//     for(int i=0;i< arr.length;i++){
//         arr[i]="bb";
//     }
        for(String s:arr){
            s="cc";
        }
     for(int i=0;i< arr.length;i++){
         System.out.println(arr[i]);
     }
    }
}

