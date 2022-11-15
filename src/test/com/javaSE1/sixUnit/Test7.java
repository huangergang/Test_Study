package test.com.javaSE1.sixUnit;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Comparator;

public class Test7 {

    public static void main(String[] args) {
        new TimedGreeter().greet();
    }
}

class Greeter {

    public void greet() {
        System.out.println("hello, world!");
    }

}

class TimedGreeter extends Greeter {

//    @Override
//    public void greet() {
//        Timer timer = new Timer(1, super::greet);
//        timer.start();
//    }

}