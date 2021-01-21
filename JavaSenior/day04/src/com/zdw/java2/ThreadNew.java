package com.zdw.java2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/***
 * 创建线程的方式三：实现Callable接口 --JDK5.0新增
 *
 *
 *  call() 有返回值
 *  call() 可以抛出异常，被外面的操作捕获，获取异常的信息
 *  Callable是支持泛型
 */

/// 1.创建一个实现 concurrent 的实现类
class NumThread implements Callable{
//    2.实现call方法，将此线程需要执行的操作声明在call()中
    @Override
    public Object call() throws Exception {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }
}

public class ThreadNew {
    public static void main(String[] args) {
//        3.创建Callable 接口实现类的对象
        NumThread numThread=new NumThread();
//        4.将此创建Callable接口实现类的对象作为传递到 FutureTask构造器中，创建FutureTask的对象
        FutureTask  futureTask =new FutureTask( numThread);
        //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thraed对象，并调用start();
        new Thread(futureTask).start();
        try {
//            6.获取Callable中call方法的返回值
            //get 方法返回值为 FutureTask构造器参数 concurrent实现类重写的call()的返回值。
          Object sum= futureTask.get();
            System.out.println("总和为"+sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
