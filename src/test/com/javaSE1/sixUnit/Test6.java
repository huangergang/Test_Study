package test.com.javaSE1.sixUnit;


import java.util.Collection;

public class Test6 implements Comter {

    @Override
    public String getA() {
        return a;
    }

    public static void main(String[] args) {

        System.out.println(new Test6().getA());
        System.out.println(Comter.a);


    }

}

interface Comter {
    String a = "hello";

    String getA();

    static void hello() {
        System.out.println(a);
    }

}