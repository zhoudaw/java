package com.zdw.java;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.*;

public class GengericTest {
    @Test
    public void test1() {
        ArrayList list = new ArrayList();
        //需求 存放学生成绩
        list.add(78);
        list.add(88);
        list.add(98);
        list.add(68);
        list.add(58);
        // 问题一：类型不安全
        list.add("Tom");
        for (Object score : list) {
            //问题二：强转时，可能出现类型ClassCastException
            int stuScore = (int) score;
            System.out.println(stuScore);
        }
    }

    //    在集合中使用泛型的
    @Test
    public void test2() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(89);
        list.add(19);
        list.add(839);
//        编译时，就会进行类型检查，保证数据的安全
//        list.add("zdw");
        //方式一
//        for (Object score : list) {
//            int stuScore = (int) score;
//            System.out.println(stuScore);
//        }
        //方式二：
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：以HashMap为例
    @Test
    public void test3() {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("zdw",89);
        map.put("You",23);
        map.put("yanr",29);
        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry= map.entrySet();
//        System.out.println(entry);
        Iterator<Map.Entry<String,Integer>>iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> e =iterator.next();
            String key =e.getKey();
            Integer value = e.getValue();
            System.out.println(key+"----------"+value);
        }

    }
}
