package com.zdw.meiju;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 *  一枚举类的使用：
 *  1.枚举类的理解：类的对象只有有限个，确定的，我们称此类为枚举类
 *  2.当需要定于一组常量时，强烈建议使用枚举类
 *  3.如果枚举类中只有一个对象，则可以作为单列模式的实现方式
 *   二如何定义枚举类
 *   1.自定义枚举类
 *   2.可以使用 enum关键字定义举类
 */
public class SeasonTest {
    public static void main(String[] args) {
        Seaeon s =Seaeon.SPRING;
        System.out.println(s);
    }
}
//自定义枚举类
class  Seaeon{
    //1.声明Seaeon对象的属性 private  final 修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化的构造器,并给对象属性赋值
    private Seaeon(String seasonName,String seasonDesc){
       this.seasonDesc=seasonDesc;
       this.seasonName=seasonName;
    }
    //3.提供当前枚举类的多个对象
    public  static final Seaeon SPRING = new Seaeon("春天","春暖花开");
    public  static final Seaeon SUMMER = new Seaeon("夏天","夏日炎炎");
    public  static final Seaeon AUTUMN = new Seaeon("秋天","艳阳高照");
    public  static final Seaeon WINTER = new Seaeon("冬天","大雪纷飞");
    //4.其他诉求：获取枚举类对象的属性
    public String getSeasonName(){
        return  seasonName;
    }
    public  String getSeasonDesc(){
        return  seasonDesc;
    }
    //5.其他诉求 提供toString

    @Override
    public String toString() {
        return "Seaeon{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
