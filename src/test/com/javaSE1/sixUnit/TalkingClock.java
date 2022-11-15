package test.com.javaSE1.sixUnit;

import test.com.javaSE1.fifthUnit.ReflectionTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Date;

public class TalkingClock {

    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(int interval, boolean beep) {

        //  局部内部类
        //   class TimePrinter implements ActionListener {
        //  @Override public void actionPerformed(ActionEvent e) {
        //  System.out.println("At the tone, the time is " + new Date());
        //  if (beep) Toolkit.getDefaultToolkit().beep();
        //      }
        //  }
        //   ActionListener listener = new TimerPrinter();
        //   Timer timer = new Timer(interval, listener);
        //   timer.start();

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("At the tone, the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer timer = new Timer(interval, listener);
        timer.start();
    }

// 内部类
//    public class TimePrinter implements ActionListener {
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            System.out.println(new Date());
//            if (TalkingClock.this.beep) Toolkit.getDefaultToolkit().beep();
//        }
//    }

    public static void main(String[] args) throws NoSuchMethodException {
//        TalkingClock talkingClock = new TalkingClock(100, true);
        System.out.println(TalkingClock.class);
    }
}
