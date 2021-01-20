package com.zdw.java;
class  Window1 implements Runnable{
    private int ticket =100;
    private  static   Object  obj =new Object();
    public void run() {
        while (true){
//           synchronized (this){
               synchronized (Window1.class){
               if(ticket>0){
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName()+":卖票，票号是："+ticket);
                   ticket--;
               }else{
                   break;
               }
           }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window1 w =new Window1();
        Thread t =new Thread(w);
        Thread t1 =new Thread(w);
        Thread t2=new Thread(w);
        t.setName("窗口1");
        t1.setName("窗口2");
        t2.setName("窗口3");
        t1.start();
        t2.start();
        t.start();
    }

}
