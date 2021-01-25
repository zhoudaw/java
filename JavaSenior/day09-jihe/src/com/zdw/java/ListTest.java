package com.zdw.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *  List 接口存储有序的，可以重复的数据。--->替换原有的数组
 *  ArrayList 线程不安全的，效率高，底层存储Object[] elementData存储
 *  LinkedList 对于频繁的插入，和删除操作，使用此类效率比ArrayList高； 底层使用双向链表存储
 *  Vectoer ：作为List 接口的古老实现类，线程安全 效率低 底层存储Object[] elementData存储
 * 、、、、
 *
 * 面试题 ArrayList LinkedList Vectoer 三者的异同?
 *
 * 相同：三个类都是实现List接口 存储数据的特点相同，存储有序的，可重复的数据
 * 不同：见上面写的 3个对比
 */
public class ListTest {
    @Test
    public void test2(){
        ArrayList list =new ArrayList();
        list.add(123);
        list.add("asd");
        list.add(32);
        list.add("zdw");
        list.add(new Person("ja",12));
        list.add(32);
//        int indexOf(Object obj)：返回obj在集合中首次出现的位置.如果不存在，返回-1
        int index = list.indexOf(123);
        System.out.println(index);
//      int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置 如果不存在，返回-1
        System.out.println(list.lastIndexOf(32));
        //Object remove(int index):移除指定index位置的元素,并返回此元素
        Object obj =list.remove(0);
        System.out.println(obj);
        System.out.println(list);
        //Object set(int index , Object ele);设置指定index位置的元素为ele
        list.set(1,"bb");
        System.out.println(list);
        //List subList(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的子集合
       List subList= list.subList(2,4);
        System.out.println(subList);

    }
    @Test
    public void test1(){
        ArrayList list =new ArrayList();
        list.add(123);
        list.add("asd");
        list.add("zdw");
        list.add(new Person("ja",12));
        list.add(32);
        System.out.println(list);
//        void add(int index,Object ele) 在index位置插入ele元素
        list.add(1,"bvb");
        System.out.println(list);
        //boolean addAll(int index,Collection eles):从index位置开始将eles 中的所有元素添加进来
        List lsit1 = Arrays.asList(12,34,55);
        list.addAll(lsit1);
        System.out.println(list.size());
        // Object get(int index) 获取指定index 位置的元素
        System.out.println(list.get(0));
    }

}
