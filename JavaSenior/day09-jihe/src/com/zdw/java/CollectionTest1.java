package com.zdw.java;
/*
*  collection 常用方法
*
* */



import org.junit.Test;

import javax.crypto.interfaces.PBEKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionTest1 {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(12);
        coll.add(123);
        coll.add(new String("zdw"));
        coll.add(false);
        coll.add(new Person("haha",29));
        coll.add(new Person("haha",29));
        //contains（Object obj）:判断当前集合是否包含obj
        boolean contains= coll.contains(12);
        System.out.println(contains);//true
        System.out.println(coll.contains((new String("zdw")))); //true
        System.out.println(coll.contains((new Person("haha",29)))); //true
        // containsAll()（Collection coll1）:判断形参coll1中的所有元素是否都存在于当前集合中
        Collection coll1 = Arrays.asList(123,1222);
        System.out.println(coll.containsAll(coll1));
    }
    @Test
//    差集 removeAll
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(12);
        coll.add(123);
//        coll.remove(123);
//        System.out.println(coll);
        Collection coll1 = Arrays.asList(12,224);
        coll.removeAll(coll1);
        System.out.println(coll);
    }

    @Test
//    交集 retainAll
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(12);
        coll.add(123);
        coll.add(new String("zdw"));
        coll.add(false);
        coll.add(new Person("haha",29));
        Collection coll1 =Arrays.asList(123,12,422,534,false);
        coll.retainAll(coll1);
        System.out.println(coll);
    }
    @Test
//    hashCode() 返回当前对象的哈希值
    public void test4(){
        Collection coll = new ArrayList();
        coll.add(12);
        coll.add(123);
        coll.add(new String("zdw"));
        coll.add(false);
        coll.add(new Person("haha",29));
        System.out.println(coll.hashCode());
        Object[] arr= coll.toArray();
//        toArray 集合--->数组
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

//        扩展：数组--->集合:调用Arrays类的静态方法asList()
//        List<String> list =Arrays.asList(new String[]{"AA","BB","CC"});
//        System.out.println(list);

    }
}
