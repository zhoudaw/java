package com.zdw.java;

/**
 *  同步方法
 */
class Window3 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            show();
        }
    }
    private synchronized void show() { //同步监视器 ：this
//        synchronized (this) {
            if (ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "：卖票，票号为:" + ticket);
                ticket--;
//            }
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 wo = new Window3();
        Thread wd1 = new Thread(wo);
        Thread wd2 = new Thread(wo);
        Thread wd3 = new Thread(wo);
        wd1.setName("窗口1");
        wd2.setName("窗口2");
        wd3.setName("窗口3");
        wd1.start();
        wd2.start();
        wd3.start();
    }
}
