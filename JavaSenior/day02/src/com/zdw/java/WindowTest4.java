package com.zdw.java;

/**
 * 使用同步方法处理继承Thread类的方式中的线程安全问题
 */
class Window4 extends Thread {
    private static int ticket = 100;
    @Override
    public void run() {
        while (true) {
            show();
        }
    }

    private static synchronized void show() { //同步监视器：Window4.class
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "：卖票，票号为:" + ticket);
            ticket--;
        }
    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 wd1 = new Window4();
        Window4 wd2 = new Window4();
        Window4 wd3 = new Window4();
        wd1.setName("窗口1");
        wd2.setName("窗口2");
        wd3.setName("窗口3");
        wd1.start();
        wd2.start();
        wd3.start();
    }
}
