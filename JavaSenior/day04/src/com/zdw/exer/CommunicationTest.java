package com.zdw.exer;

/**
 线程通讯的例子：使用两个线程打印 1-100 线程1，线程2 交替打印
 涉及到的三个方法
 wait();   一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器
 notify();  一旦执行此方法，就会唤醒被wait的一个线程 如果有多个线程被wait 就唤醒优先级高的那个
 notifyAll();  一旦执行此方法，就会唤醒被所有wait的线程
 说明：
 1.wait notify notifyAll 三个方法必须使用在同步代码块或同步方法中。
 2.wait notify notifyAll  三个方法的调用者必须是同步代码块或者同步方法中的同步监视器。
    否则，会出现 异常 IllegalMonitorStateException

 1.相同点 sleep and wait  一旦执行方法，都可以使用当前线程进入阻塞状态。
 2. 不同， 两个方法的位置不同:Thread 类中声明sleep() .Object类中声明Wait()
          调用的要求不同。sleep 可以再任务需要的场景下调用。wait 必须使用在同步代码块
          关于是否释放同步监视器。如果两个方法都使用在同步代码或者同步方法中，sleep 不会释放锁 wait会释放锁
 */
class Number implements Runnable{
    private  int number =1;
    private  Object obj =new Object();
    @Override
    public void run() {
       while (true){
           // 同步监视器 this
           synchronized (obj){
               obj.notify();
               if(number<=100){
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName()+":"+ number);
                   number++;
                   try {
                       //使得调用如下wait() 方法的线程进入阻塞状态
                       obj.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }else {
                   break;
               }
           }
       }
    }
}
public class CommunicationTest {
    public static void main(String[] args) {
       Number number=  new Number();
       Thread t1=new Thread(number);
       Thread t2=new Thread(number);
       t1.setName("线程1");
       t2.setName("线程2");
       t1.start();
       t2.start();
    }
}
