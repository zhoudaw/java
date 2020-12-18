package zdw.java;

/**
 * 例子：创建3个窗口买票 总数为100张
 */

class Window2 extends Thread {
    private static int ticket = 100;
    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//             obj= Window2.class
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":卖票,票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 t5 = new Window2();
        Window2 t6 = new Window2();
        Window2 t7 = new Window2();
        t5.setName("窗口一");
        t6.setName("窗口二");
        t7.setName("窗口三");
        t5.start();
        t6.start();
        t7.start();
    }
}

