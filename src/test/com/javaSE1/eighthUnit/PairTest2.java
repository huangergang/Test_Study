package test.com.javaSE1.eighthUnit;

import java.io.Serializable;
import java.util.ArrayList;

public class PairTest2 {
    public static void main(String[] args) {
//        LocalDate[] arr = {
//                LocalDate.of(1906, 12, 9),
//                LocalDate.of(1815, 12, 10),
//                LocalDate.of(1903, 12, 3),
//                LocalDate.of(1910, 6, 22),
//        };
//
//        Pair<LocalDate> mm = StaticInnerClass.minmax(arr);
//        ArrayList<Student> listStu = new ArrayList<>();
//        listStu.add(new Student("曾小贤", "男", 36, "001"));
//        listStu.add(new Student("关谷神奇", "男", 37, "002"));
//        listStu.add(new Student("吕子乔", "男", 30, "003"));
//        listStu.add(new Student("胡一菲", "女", 34, "004"));
//
//        Student[] students = listStu.toArray(new Student[0]);
//        Pair<Student> mm = ArrayAlg.minmax(students);
//        System.out.println("min = " + mm.getFirst());
//        System.out.println("max = " + mm.getSecond());


//        ArrayAlg.<Student>getMiddle(new Student("frank"));
//        Number middle = ArrayAlg.getMiddle(13.1, 2, 9);
//        System.out.println("middle = " + middle);

        Serializable hello = ArrayAlg.getMiddle("hello", 0, null);
        System.out.println("hello = " + hello);

    }

}

class ArrayAlg {

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static <T extends Comparable> Pair<T> minmax(T[] a) {
        if (a.length == 0 && a == null)
            return null;
        T min = a[0];
        T max = a[0];

        for (int i = 0; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) min = a[i];
            if (max.compareTo(a[i]) < 0) max = a[i];
        }

        return new Pair<>(min, max);
    }
}