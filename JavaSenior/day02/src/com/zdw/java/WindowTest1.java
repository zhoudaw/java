package com.zdw.java;

/**
 * 例子：创建3个窗口买票 总数为100张,使用显示Runnable接口的方式
 * 1.卖票过程中，出现了重票。错票-->出现了线程安全问题
 * 2.问题出现的原因：当某个线程作车票的过程中，尚未操作完成时，其他线程参与进来，也操作了车票
 * 3.如何解决：当一个线程在操作ticket的时候，其他线程不能参与进来，直到线程a操作完ticket时，其他线程才开始操作ticket
 * 4.在java 中，我们通过同不机制，来解决线程的安全问题。
 * <p>
 * 方式一：同步代码块
 *         synchronized(同步监视器){
 *          //需要被同步的代码
 *         }
 * 说明：
 *       1.操作共享数据的代码，即为需要被同步的代码
 *       2.共享数据：多个线程共同操作的变量，比如：ticket就是共享数据.
 *       3.同步监视器，俗称：锁。任何一类的对象，都可以充当锁
 *            要求：多个线程比要共用同一把锁
 * 方法二：同步代码块
 * 5.
 *
 *
 */
class Window1 implements Runnable {
    private int ticket = 100;
//    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (this){ //此时的this，唯一的window1的对象
                if (ticket > 0) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 win = new Window1();
        Thread t1 = new Thread(win);
        Thread t2 = new Thread(win);
        Thread t3 = new Thread(win);
        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");
        t1.start();
        t2.start();
        t3.start();
    }
}
