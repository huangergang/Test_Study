package test.com.javaSE1.sixUnit;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Test implements Hello, Hello2 {

    public void hello() {
        Hello2.super.hello();
    }

    public static void main(String[] args) {

        ActionListener listener = new TimerPrinter();
        Timer timer = new Timer(1,listener);
        timer.start();

        JOptionPane.showMessageDialog(null,"Quit program?");
        Toolkit.getDefaultToolkit().beep();
        System.exit(0);

    }

}

class TimerPrinter implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(new Date());

    }

}