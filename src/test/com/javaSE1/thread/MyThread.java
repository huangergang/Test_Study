package test.com.javaSE1.thread;

public class MyThread extends Thread {
    private int a = 3;

    public int getA() {
        return a;
    }

    public void run() {

        while (a > 0) {
            System.out.println("thread" + Thread.currentThread().getId() + ", a=" + a--);
        }

    }

}
