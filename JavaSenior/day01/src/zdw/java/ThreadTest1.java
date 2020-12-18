package zdw.java;

/**
 * 创建多线程的方式二：实现Runnable接口
 * 1.创建一个实现Runnable接口的类
 * 2.实现类去实现Runnable中的抽象方法run()
 * 3.创建实现的对象
 * 4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象中
 * 5.通过Thread类的对象调用start()
 */
//1.创建一个实现Runnable接口的类
class MTHread implements Runnable {
    //   2.实现类去实现Runnable中的抽象方法run()
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class ThreadTest1 {
    //    3.创建实现的对象
    public static void main(String[] args) {
////    3.创建实现的对象
        MTHread m = new MTHread();
////    4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象中
        Thread t = new Thread(m);
        t.setName("线程一");
////    5.通过Thread类的对象调用start()
        t.start();
        Thread t1 = new Thread(m);
        t1.setName("线程二");
        t1.start();
    }
}
