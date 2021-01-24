package com.zdw.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**+
 * 一. 集合框架的概述
 * 1.集合，数值都是对多个数据进行存储操作的结构，简称Java容器
 * 说明：此时的存储，主要指的是内存层的存储，部合集持久的存储，（.text,.jpg,.avi.数据库中）
 * 2.数值在存储多个数据方面的特点:
 *   >一旦初始化后，其长度就是确定了。
 *   >数组一旦定义好，其元素的类型也就是确定。我们也就只能操作指定类型的数据，
 *    比如String[],arr;int[] arr1;Object[] arr2;
 *2.2数组在存储多个数据方面的缺点
 *   >一旦初始化后，其长度就不可修改
 *   >数组中提供的方法非常有限，对于添加，删除，插入数据操作，非常不方便，同时效率不高
 *   >获取数组中实际的个数的需求，数组没有现成的属性或者方法可用
 *   >数组存储数据的特点：有序，可重复，对于有序，不可重复的需求，不能满足
 *二. 集合框架
 *   Collection 接口：单列集合。用来存储一个一个的对象
 *    list 接口 存储有序的，可重复的数据 "动态"数组
 *       ArrayList LinkedList Vector
 *    set 接口  存储无序的不可重复的数据  “集合”
 *       HashSet LinkedHashSet TreeSet
 *   Map接口：双列集合，用来存储一堆（key - value）一对的数据
 *        HashMap linkedHashMap TreeMap Hashtable Properties
 * 三. collection 接口中的使用
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        //add(Object e) //将元素e添加到集合coll中
        coll.add("aa");
        coll.add("bb");
        coll.add("cc");
        coll.add(11);
        coll.add(new Date());
        System.out.println(coll.size()); //5
        Collection coll1= new ArrayList();
        coll1.add(44);
        coll1.add(44112 );
        coll.addAll(coll1);
        System.out.println(coll.size());
        System.out.println(coll);
//      isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());
    }
}
