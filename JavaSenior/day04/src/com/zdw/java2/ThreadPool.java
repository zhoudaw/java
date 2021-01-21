package com.zdw.java2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 创建线程的方式四。使用线程池
 */
class NunberThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+ i);
            }
        }
    }
}
class NunberThread1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+ i);
            }
        }
    }
}
public class ThreadPool {
    public static void main(String[] args) {
//       1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
//        设置线程池的属性
        System.out.println(service.getClass());
//       2.执行指定的线程的操作，需要提供实现Runnable 接口或者Callable 接口实现类的对象
        service.execute(new NunberThread() ); //适合适用于Runnable
        service.execute(new NunberThread1() ); //适合适用于Runnable
//       service.submit();//适合使用与Callable
        service.shutdown();
    }
}
