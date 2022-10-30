package test.com.javaSE1.thread;

import java.util.Stack;

public class Example {
    Stack<Integer> plate = new Stack<>();
    int number = 1;

    class Tom extends Thread {
        @Override
        public void run() {
            while (number <= 100) {
                try {
                    sleep(500);
                    plate.push(number);
                    System.out.println(getName() + "  做了第  " + number + "  张饼");
                    number++;
                } catch (Exception e) {

                }
            }
        }
    }

    class Jerry extends Thread {
        @Override
        public void run() {
            while (true) {
                if (!plate.empty()) {
                    try {
                        sleep(500);
                        Integer pop = plate.pop();
                        System.out.println(getName() + "  吃了第  " + pop + "  张饼");
                    } catch (Exception e) {

                    }
                }
            }
        }
    }

    public void exe() {
        Tom tom = new Tom();
        tom.setName("厨师");
        tom.start();
        Jerry jerry = new Jerry();
        jerry.setName("顾客");
        jerry.start();
    }
}
