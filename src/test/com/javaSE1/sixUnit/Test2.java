package test.com.javaSE1.sixUnit;

import javax.swing.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

@FunctionalInterface
interface Lambda3 {

    double first(int a, int b);

}


public class Test2 {


    public void hello() {
        System.out.println("hello Test2");
    }

    public static void main(String[] args) {

        new Test3(3, 2, Math::pow);

    }

}

class Test3 {

    public Test3(int a, int b, Lambda3 lambda3) {
        System.out.println(lambda3.first(a, b));
    }

}