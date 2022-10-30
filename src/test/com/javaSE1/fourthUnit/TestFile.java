package test.com.javaSE1.fourthUnit;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Scanner;

public class TestFile {

    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(Paths.get("D:\\note\\Test_Study\\src\\file.txt"), "utf8");
//        String s = in.nextLine();
//        System.out.println(s);


        PrintWriter pw = new PrintWriter("D:\\note\\Test_Study\\src\\file.txt", "utf8");
        pw.printf("%1$tr %1$tA", new Date());
        pw.close();

        FileWriter fw = new FileWriter("D:\\note\\Test_Study\\src\\file.txt", true);
        fw.write(String.format("%1$tr %1$tA", new Date()));
        fw.close();

    }
}
