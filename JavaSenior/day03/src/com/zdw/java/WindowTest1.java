package com.zdw.java;

// 使用Runnable 接口方式

class  Wintest implements  Runnable{
    private  int  ticket =100;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":卖票，票号为"+ticket);
                ticket--;
            }else {
                break;
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Wintest w =new  Wintest();
        Thread t1 =new Thread(w);
        Thread t2 =new Thread(w);
        Thread t3 =new Thread(w);
        t1.setName("窗口1");
        t2.setName("窗口1");
        t3.setName("窗口1");
        t1.start();
        t2.start();
        t3.start();
    }

}

