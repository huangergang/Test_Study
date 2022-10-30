package test.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton1 {

    private static final Singleton1 instance = new Singleton1();

    private Singleton1() {

    }


    public static Singleton1 getInstance() {
        return instance;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Class<Singleton1> sClass = Singleton1.class;

                try {
                    Constructor<Singleton1> declaredConstructor = sClass.getDeclaredConstructor();
                    declaredConstructor.setAccessible(true);
                    Singleton1 singleton1 = declaredConstructor.newInstance();
                    System.out.println(singleton1.hashCode());
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
//
//                System.out.println(getInstance().hashCode());
            }).start();
        }

    }


}
