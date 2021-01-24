package com.zdw.java;
public class AnnotationTest {
    public static void main(String[] args) {
        Student p= new Student();
      p.walk();
    }
}
class  Person{
    String name;
    int age;
    public Person() {
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void walk(){
        System.out.println("人走路");
    }
    public void eat(){
        System.out.println("人吃饭");
    }
}
interface Info{
    void show();
}
class Student extends Person implements Info{
    @Override
    public void walk() {
        System.out.println("学生会走路");
    }
    @Override
    public void show() {

    }
}
