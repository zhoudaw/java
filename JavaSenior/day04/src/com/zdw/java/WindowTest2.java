package com.zdw.java;
class  Window2 implements Runnable{
    private int ticket =100;
    private  static   Object  obj =new Object();
    public void run() {
        while (true){
            show();
        }
    }
    private  synchronized  void show(){
//        synchronized (this){
            if(ticket>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":卖票，票号是："+ticket);
                ticket--;
//            }
        }

    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 m =new Window2();
        Thread w =new Thread(m);
        Thread w1 =new Thread(m);
        Thread w2=new Thread(m);
        w.setName("窗口1");
        w1.setName("窗口2");
        w2.setName("窗口3");
        w1.start();
        w2.start();
        w.start();
    }

}
