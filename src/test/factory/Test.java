package test.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws Exception {

        Class<Main> M = Main.class;
//        Constructor<Main> constructor = M.getConstructor();
//
//        System.out.println("constructor = " + constructor);

        Constructor<Main> declaredConstructor = M.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Main main = declaredConstructor.newInstance();
        main.setId("1")
                .setName("frank")
                .setDesc("this is frank");
        System.out.println("main = " + main);
//        System.out.println("declaredConstructor = " + declaredConstructor);

    }
}
