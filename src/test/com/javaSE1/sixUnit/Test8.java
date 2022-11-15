package test.com.javaSE1.sixUnit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Supplier;


public class Test8 {

    public static void repeatMessage(String text, int delay) {

        ActionListener listener = event -> {
            System.out.println(text);
            Toolkit.getDefaultToolkit().beep();
        };

        new Timer(delay, listener).start();
    }

    public static void repeat(int n, Runnable action) {
        for (int i = 0; i < n; i++) action.run();
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
    }

    public static void main(String[] args) {
//        repeatMessage("hello", 100);

//        repeat(10, () -> System.out.println("hello world"));
//        repeat(10, i -> System.out.println("Countdown: " + (9 - i)));




    }

}
