package test.singleton;

public class Singleton3 {

    private Singleton3() {
    }

    private static class SingletonHolder {
        private static Singleton3 instance = new Singleton3();
    }


    public static Singleton3 getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                System.out.println(getInstance().hashCode());
            }).start();
        }

    }
}
