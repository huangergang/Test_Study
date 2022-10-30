package test.singleton;

public class Singleton2 {


    private Singleton2() throws IllegalAccessException {

        if (instance != null) {
            throw new IllegalAccessException();
        }

    }

    private static Singleton2 instance;

    public static synchronized Singleton2 getInstance() throws IllegalAccessException {

        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null)
                    instance = new Singleton2();
            }
        }

        return instance;
    }

    public static void main(String[] args) throws Exception {

//        Class<?> c = Singleton2.class;
//        Constructor<?> declaredConstructor = c.getDeclaredConstructor();
//        Singleton2 instance = getInstance();
//        Singleton2 o = (Singleton2) declaredConstructor.newInstance();
//        System.out.println(instance == o);

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {

                try {
                    Thread.sleep(1);
                    Singleton2 instance = getInstance();


                } catch (IllegalAccessException | InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(instance.hashCode());

            }).start();
        }

    }
}
