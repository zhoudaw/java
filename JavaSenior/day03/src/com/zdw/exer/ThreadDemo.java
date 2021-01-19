package com.zdw.exer;

public class ThreadDemo {
    public static void main(String[] args) {
//    MyThread1 m1 =new MyThread1();
//    MyThread m =new MyThread();
//    m1.start();
//    m.start();

    //创建Thread类的匿名类的方式
        new Thread(){
            public void run() {
                for(int i =0;i<100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+ i);
                    }
                }
            }
        }.start();
        new Thread(){
            public void run() {
                for(int i =0;i<100;i++){
                    if(i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

    }
}
class MyThread extends  Thread{
    @Override
    public void run() {
       for(int i =0;i<100;i++){
           if(i%2==0){
               System.out.println(Thread.currentThread().getName()+":"+ i);
           }
       }
    }
}
class MyThread1 extends  Thread{
    @Override
    public void run() {
        for(int i =0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

