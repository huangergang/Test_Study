package test.com.javaSE1.fifthUnit;

import java.util.Comparator;

public class Test5 {

    public static void main(String[] args) throws ClassNotFoundException {

    }
}
interface Desc{
    String desc();
}
class Student implements Desc,Comparable, Comparator {
    @Override
    public String desc() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }
}
class Comp implements Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}