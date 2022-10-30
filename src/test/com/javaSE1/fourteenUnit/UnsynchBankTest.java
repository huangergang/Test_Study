package test.com.javaSE1.fourteenUnit;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class UnsynchBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 100;
    public static final double MAX_AMOUNT = 100;
    public static final int DELAY = 100;

    public static void main(String[] args) throws Exception {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () -> {
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_AMOUNT * Math.random();
                        bank.transfer(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            Thread t = new Thread(r);
            t.start();
        }
    }

}

class Test222 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            int number = 0;
            while (true) {
                System.out.println(Thread.currentThread().getName() + "优先级：" + Thread.currentThread().getPriority() + "-----" + number++);
            }
        }, "frank");

        System.out.println(Thread.currentThread().getPriority());


    }

}

class MyThread extends Thread {
    @Override
    public void run() {
        int number = 0;
        while (true) {
            System.out.println(Thread.currentThread().getName() + "-----" + number++);
        }
    }

    public static void main(String[] args) {
        Thread t2 = new MyThread();
        t2.setName("turing");
        t2.start();
    }
}

class MyCall implements Callable<String> {
    @Override
    public String call() throws Exception {
        int number = 0;
        System.out.println(Thread.currentThread().getName() + "-----" + number++);
        return "success";
    }

    public static void main(String[] args) {
        new Thread(new FutureTask<String>(new MyCall()), "bob").start();
    }
}