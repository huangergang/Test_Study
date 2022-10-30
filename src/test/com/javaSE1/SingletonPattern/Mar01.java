package test.com.javaSE1.SingletonPattern;

public class Mar01 {
    private static final Mar01 INSTANCE = new Mar01();

    private Mar01() {
    }

    public static Mar01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mar01 m1 = Mar01.getInstance();

    }

}
