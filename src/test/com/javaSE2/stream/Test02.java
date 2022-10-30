package test.com.javaSE2.stream;

import test.stu.MyRandom;

import javax.crypto.spec.OAEPParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class Test02 {
    public static void main(String[] args) {

//
//        Person targetNull = new Person("空值姓名", -1, Gender.UNKNOWN_GENDER);
//
//        // 获取随机list
//        ArrayList<Optional<Person>> list = getPersons02();
//
//        list.forEach(System.out::println);
//
//        System.out.println("---------------------------------------------");
//
//        list.forEach((op) -> {
//            if (op.isEmpty()) {
//                System.out.println(op.orElse(targetNull).getGender());
//            } else
//                System.out.println(op.get().getGender());
//        });
//


        Person p = new Person("NULL", -1, Gender.MALE);
        System.out.println(p.hashCode());


    }

    /**
     * 静态实例方法，返回一个随机长度的ArrayList<Person>集合，并在集合中设置随机的null值;
     *
     * @return
     */
    public static ArrayList<Person> getPersons() {

        // 设定随机的List长度
        int number = ThreadLocalRandom.current().nextInt(10, 100);

        // 初始化List容器，长度为number
        ArrayList<Person> list = new ArrayList<>(number);


        // 设置随机null值个数的长度，list的长度
        int[] nulls = new int[ThreadLocalRandom.current().nextInt(1, 9)];
        for (int i = 0; i < nulls.length; i++) {
            // 设置随机null值的位置，不得超出number值
            nulls[i] = ThreadLocalRandom.current().nextInt(number);
        }

        for (int i = 0; i < number; i++) {

            // 获取随机姓名、年龄和性别
            String name = MyRandom.randomName();
            int age = ThreadLocalRandom.current().nextInt(10, 100);
            Gender gender = Gender.of(MyRandom.randomGender());


            // 初始化Person
            Person p = new Person(name, age, gender);


            // 设置随机null值的位置，并将p置为null
            for (int j = 0; j < nulls.length; j++) {
                if (i == nulls[j])
                    p = null;
            }

            // 添加p到list中
            list.add(p);
        }

        return list;
    }

    public static ArrayList<Optional<Person>> getPersons02() {


        // 设定随机的List长度
        int number = ThreadLocalRandom.current().nextInt(10, 100);

        // 初始化List容器，长度为number
        ArrayList<Optional<Person>> list = new ArrayList<>(number);


        // 设置随机null值个数的长度，list的长度
        int[] nulls = new int[ThreadLocalRandom.current().nextInt(1, 9)];
        for (int i = 0; i < nulls.length; i++) {
            // 设置随机null值的位置，不得超出number值
            nulls[i] = ThreadLocalRandom.current().nextInt(number);
        }

        for (int i = 0; i < number; i++) {

            // 获取随机姓名、年龄和性别
            String name = MyRandom.randomName();
            int age = ThreadLocalRandom.current().nextInt(10, 100);
            Gender gender = Gender.of(MyRandom.randomGender());


            // 初始化Person
            Person p = new Person(name, age, gender);


            // 设置随机null值的位置，并将p置为null
            for (int j = 0; j < nulls.length; j++) {
                if (i == nulls[j])
                    p = null;
            }

            Optional<Person> p1 = Optional.ofNullable(p);

            // 添加p到list中
            list.add(p1);
        }

        return list;
    }
}
