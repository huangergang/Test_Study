package test.com.javaSE1.sevenUnit;

import java.io.*;
import java.util.Map;
import java.util.Scanner;

public class Test {

    public void readFile() throws IOException, EOFException, FileNotFoundException {

    }

    public void test() throws ArrayIndexOutOfBoundsException {

    }

    public static boolean testAssert() {
        return false;
    }

    public static void main(String[] args) throws Exception {

//        try (Scanner in = new Scanner(new FileInputStream("file.txt"), "utf-8");
//             PrintWriter out = new PrintWriter("out.txt")) {
//            while (in.hasNext())
//                out.println(in.next().toUpperCase());
//        }

//        Throwable t = new Throwable();
//        StringWriter out = new StringWriter();
//        t.printStackTrace(new PrintWriter(out));
//        String desc = out.toString();
//        System.out.println("desc = " + desc);

//        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
//        allStackTraces.forEach((thread, ace) -> {
//            System.out.println(thread);
//            System.out.println(ace);
//        });



//
//        assert testAssert() : "testAssert return false";

    }

}

class MyException extends IOException {
    public MyException() {
    }


    public MyException(String message) {
        super(message);
    }
}