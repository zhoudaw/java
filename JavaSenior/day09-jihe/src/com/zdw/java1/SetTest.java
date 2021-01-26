package com.zdw.java1;

import com.zdw.java.Person;
import org.junit.Test;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/***
 *  set 接口  存储无序的不可重复的数据  “集合”
 *       HashSet       :作为Set接口的主要实现类：线程不安全;可以存储null值
 *       LinkedHashSet :作为HashSet的子类:遍历其内部数据。可以按照添加的顺序遍历
 *       TreeSet       :可以按照添加对象的指定属性，进行排序
 *       1. Set 接口中没有额外定义的方法，使用的都是Collection 中声明过的方法。
 *       2.要求Set中添加数据，其所在的类一定要重写hashCode和equals()
 *         要求：重写的hashCode()和equals()尽可能保持一致性：相等的对象必须具有相等的三列码
 */
public class SetTest {
//    Set: 存储无序的。不可重复的数据
//       以HashSet为例说明：
//    1.无序 :不等于随机性。存储的数据在底层数组中并非按照数组索引的顺序添加，而是根据数据的哈希值

//    2.不可重复性：保证添加的元素按照equals()判断时，不能返回true,即相同原素只能添加一个

    /**
     *
     * 添加元素的过程，以HashSet为例：
     *     我们想HashSet中添加原始a，首先调用元素a所在类的hasCode（）方法，计算元素a的哈希值，
     *     此哈希值接着通过某种算法计算出在HashSet底层数组中的存放位置（即为：索引位置），判断数组
     *     此位置上是否已经有元素：
     *          如果此位置上没有其他元素：则元素a添加成功。
     *          如果此位置上没有其他元素b(或者链表形式存在的多个元素，)则比较a与b的hash值:
     *           如果hash值不相同，则元素a添加成功
     *           如果hash值相同，进而需要调用元素a所在类的equla（）方法：
     *             equals() 返回ture,元素a添加失败
     *             equals()返回false 则元素a添加成功 ---》情况2
     *      对于添加成功的情况2和情况3而言: 元素a与已经存在指定的索引位置上数据链表的方式存储。
     *      jdk7; 元素a放到数组中，指向原来的元素。
     *      jdk8; 原来的元素在数组中，指向元素a
     *      总结：七上八下
     *
     *
     *
     */



    @Test
    public void test1(){
        Set set=new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",18));
        set.add(1234);
        Iterator iterator =set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    @Test
    /***
     * LinkedHashSet 的使用
     * LinkedHashSet作为 HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录此数据前
     * 一个数据和后一个数据。
     * 优点；对于频繁的遍历操作。效率高
     *
     */

    public void test2(){
        Set set=new LinkedHashSet();
        set.add(4562);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",18));
        set.add(1234);
        set.add(1234);
        Iterator iterator =set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


}
