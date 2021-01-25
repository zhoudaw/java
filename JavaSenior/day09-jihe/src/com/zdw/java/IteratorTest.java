package com.zdw.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作，使用迭代器Iterator接口
 * 1.内部的方法：hasNext() 和 next()
 * 2.集合对象每次调用iterator()方法都得到一个全新迭代器对象
 * 3.内部定义remove()，可以在遍历的时候，删除集合中的元素，此方法不同于集合直接调用remove()
 */

public class IteratorTest {
     @Test
     public void test1(){
         Collection coll = new ArrayList();
         coll.add(123);
         coll.add(456);
         coll.add(new Person("TOM",28));
         coll.add(new String("zdw"));
         coll.add(false);
//         方式一
         Iterator iterator =coll.iterator();
//         System.out.println(iterator.next());
//         System.out.println(iterator.next());
//         System.out.println(iterator.next());
//         System.out.println(iterator.next());
//         System.out.println(iterator.next());
//         报异常: NoSuchElementException
//         System.out.println(iterator.next());

//         方式二 不推荐
//         for(int i=0;i<coll.size();i++){
//             System.out.println(iterator.next());
//         }
//         方式三：推荐
         while (iterator.hasNext()){
             System.out.println(iterator.next());
         }
     }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("TOM",28));
        coll.add(new String("zdw"));
        coll.add(false);
        Iterator iterator =coll.iterator();
        // 删除集合中 TOM
        while (iterator.hasNext()){
          Object obj=   iterator.next();
           if("TOM".equals(obj)){
               iterator.remove();
           }
        }
        //遍历集合
        Iterator iterator1 =coll.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
    }




}
