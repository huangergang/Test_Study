package test.com.javaSE1.fourthUnit;

import java.io.File;

public class NativeTest {

    static {
        System.load("D:" + File.separator + "Hello.dll");
    }

    public native static void Hello();

    public static void main(String[] args) {
        Hello();
    }

}
