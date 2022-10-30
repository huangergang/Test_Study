package test.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum Singleton8 {

    INSTANCE;

    private Integer id = 9;

    public Integer getId() {
        return id;
    }

    public static void main(String[] args) {
        Class<Singleton8> s = Singleton8.class;
        try {
            Constructor<Singleton8> declaredConstructor = s.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            Singleton8 newInstance = declaredConstructor.newInstance();
            System.out.println(newInstance == INSTANCE);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


        System.out.println(INSTANCE.getId());

    }
}
