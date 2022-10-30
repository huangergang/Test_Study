package test.com.javaSE1.fourteenUnit;

import java.util.concurrent.ThreadLocalRandom;

public class Test {

    public static void main(String[] args) {
        UserRunnableOfBookStore aim = new UserRunnableOfBookStore("aim");
        UserRunnableOfBookStore bob = new UserRunnableOfBookStore("bob");

        aim.start();
        bob.start();

    }

}

class UserRunnableOfBookStore extends Thread {
    public static int BOOK_SIZE = 100;
    private int sum = 0;


    public UserRunnableOfBookStore(String name) {
        super(name);
    }

    public synchronized boolean distribution(int number) {
        boolean b = false;
        if (BOOK_SIZE > 0 && BOOK_SIZE >= number) {
            BOOK_SIZE -= number;
            b = true;
        }
        return b;
    }

    @Override
    public void run() {
        while (BOOK_SIZE > 0) {
            int number = ThreadLocalRandom.current().nextInt(1, 10);
            if (distribution(number)) {
                sum += number;
                System.out.println(Thread
                        .currentThread()
                        .getName()
                        + " bought "
                        + number
                        + " books, BookStore "
                        + BOOK_SIZE
                        + " books left.");
            }
        }
        System.out.println(Thread
                .currentThread()
                .getName()
                + " have "
                + sum
                + " books");
    }
}