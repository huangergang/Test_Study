package JVM;

import java.util.ArrayList;
import java.util.List;

public class Demo1_5 {

    public static void main(String[] args) {
        int i = 0;
        try {
            List<Integer> list = new ArrayList<>();
            int a = 1;

            while (true) {
                list.add(a);
                a = a + a;
                i++;
            }
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println(i);
        }
    }
}
