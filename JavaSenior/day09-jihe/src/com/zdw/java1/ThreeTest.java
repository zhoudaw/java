package com.zdw.java1;

import org.junit.Test;

import java.util.Iterator;
import java.util.TreeSet;

public class ThreeTest {
    /**
     * 1.向TreeSet中添加的数据，要求是相同类的对象
     * 2.两种排序方式：自然排序和定制排序
     * 3.自然排序中，比较两个对象是否相同的标准为：compareTo()返回0.不再是equals()。
     *
     */
    @Test
    public void test1(){
        TreeSet set =new TreeSet();
        set.add(123);
        set.add(123);
        set.add(1232);
        set.add(-1);
        Iterator iterator =set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
