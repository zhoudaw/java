package com.zdw.java2;


import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Map接口：双列集合，用来存储一堆（key - value）一对的数据
 *  HashMap  作为Map主要的实现类；
 *     linkedHashMap 保证在遍历map元素时，可以按照添加的顺序实现遍历
 *            原因 ：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素。
 *            对于频繁的遍历操作。此类执行效率高于HashMap。
 *  TreeMap： 保证按钮添加的key-value对进行排序，实现排序遍历。此时考虑key的自然排序或定制排序
 *            底层使用的红黑树
 *  Hashtable 作为古老的实现类；线程安全的。效率低， 不能存储null的key和value
 *      Properties：常用来处理配置文件。key和Value都是String类型
 *
 *
 *
 *
 */
public class MapTest {
    @Test
    public void test1(){
        Map map =new HashMap();
        map = new Hashtable();
        map.put(null,null);


  }
}
