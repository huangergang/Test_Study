package test.com.javaSE1.eighthUnit;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Test8<T> {

    public static void main(String[] args) {


        ArrayList<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();
        System.out.println(strings.hashCode());
        System.out.println(integers.hashCode());
        System.out.println(strings.equals(integers));

//        LocalDate d1 = LocalDate.now();
//        LocalDate d2 = LocalDate.now();
//        Pair<LocalDate> pair = new Pair<>(d1,d2);
//
//        System.out.println(pair.getSecond().getClass().getName());
    }
}
