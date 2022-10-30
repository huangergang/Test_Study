package test.instance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(1000);


        int a = 1000;
        while (a-- > 0) {
            new Thread(() -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                list.add(Second.getInstance().toString() + Thread.currentThread().getName());
            }).start();
            new Thread(() -> {
                list.add(Second.getInstance().toString() + Thread.currentThread().getName());
            }).start();
        }

        list.stream().collect(Collectors.groupingBy(String::hashCode))
                .forEach((hash, ls) -> {
                    System.out.println(hash);
                    ls.forEach(System.out::println);
                });
    }
}
