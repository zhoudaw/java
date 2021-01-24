package com.zdw.meiju;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 *
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Seaeon1 s1 =Seaeon1.WINTER;
        System.out.println(s1);
//        values()
        Seaeon1[] values=Seaeon1.values();
        for (int i=0;i<values.length;i++){
            System.out.println(values[i]);
            values[i].show();
        }
//        valuesof(String objName):返回枚举类中对象名objName的对象。
//        Seaeon1 winter =Seaeon1.valueOf("WINTER1");
//        System.out.println(winter);

    }
}
interface  Info{
    void show();
}
//使用enum 关键字
//定义的枚举类默认继承的 enum
//让枚举类的对象分别实现接口中的抽象方法
enum Seaeon1 implements Info {
    SPRING("春天", "春暖花开"){
        @Override
        public void show() {
            System.out.println("春天在哪里");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        @Override
        public void show() {
            System.out.println("夏天在哪里");
        }
    },
    AUTUMN("秋天", "艳阳高照"){
        @Override
        public void show() {
            System.out.println("秋天在哪里");
        }
    },
    WINTER("冬天", "大雪纷飞"){
        @Override
        public void show() {
            System.out.println("冬天天在哪里");
        }
    };
    //1.声明Seaeon对象的属性 private  final 修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化的构造器,并给对象属性赋值
    private Seaeon1(String seasonName, String seasonDesc) {
        this.seasonDesc = seasonDesc;
        this.seasonName = seasonName;
    }
    //3.提供当前枚举类的多个对象
    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public void show() {
//        System.out.println("哈哈哈");
//    }

    //5.其他诉求 提供toString
//
//    @Override
//    public String toString() {
//        return "Seaeon1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}
