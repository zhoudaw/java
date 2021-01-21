package com.zdw.exer;

/**
 *  线程通信的应用，：经典例题：生产者/消费者问题
 *
 *
 */


class  Clerl{
    private  int produceCount=0;
    //生产产品
   public  synchronized void produceProducer(){
        if(produceCount<20){
            produceCount++;
            System.out.println(Thread.currentThread().getName()+":开始生产第"+produceCount+"产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
   }
   //消费产品
   public synchronized  void consumerConsumer(){
       if(produceCount >0){
           System.out.println(Thread.currentThread().getName()+":开始消费第"+produceCount+"产品");
           produceCount--;
           notify();
       }else {
           try {
               wait();
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
   }
}
class  Producer extends  Thread{ //生产者
    private Clerl clerl;
    public Producer(Clerl clerl){
        this.clerl=clerl;
    }

    @Override
    public void run() {
        System.out.println(getName()+":开始生产产品。。。。");
        while (true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerl.produceProducer();
        }
    }
}
class Consumer extends  Thread{ //消费者
    private Clerl clerl;
    public Consumer(Clerl clerl){
        this.clerl=clerl;
    }
    @Override
    public void run() {
        System.out.println(getName()+":开始消费产品.....");
        while (true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerl.consumerConsumer();
        }
    }
}


public class ProductTest {
    public static void main(String[] args) {
        Clerl  clerl=  new Clerl();
        Producer p1 = new Producer(clerl);
        p1.setName("生产者1");
        Consumer c1 = new Consumer(clerl);
        c1.setName("消费者1");
        p1.start();
        c1.start();
    }
}
