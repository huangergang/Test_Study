package JVM;

/**
 * 死锁检测
 */
class A {}

class B {}

public class Demo1_20 {
    static A a = new A();
    static B b = new B();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            synchronized (a) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (b) {
                    System.out.println("我获得了 a和 b");
                }
            }
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            synchronized (b) {
                synchronized (a) {
                    System.out.println("我获得了 a和 b");
                }
            }
        }).start();


    }
}
