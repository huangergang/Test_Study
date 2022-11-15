package test.com.javaSE1.fourthUnit;

import java.time.LocalDate;

public class Test3 {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        System.out.println(LocalDate.of(1999, 12, 31));
        LocalDate now = LocalDate.now();
        System.out.println(now.plusDays(10));


    }

}

class A {
    private String a;
}

class B extends A {
    private String b;
}
