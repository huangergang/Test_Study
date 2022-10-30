package test.com.javaSE1.SingletonPattern;

public class Test {
    public static void main(String[] args) {
        Mar01 mar01 = Mar01.getInstance();
        System.out.println("mar01 = " + mar01.hashCode());
        Mar01 mar02 = mar01;
        System.out.println("mar02 = " + mar02.hashCode());
    }
}
