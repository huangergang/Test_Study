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
//        Person targetNull = new Person("��ֵ����", -1, Gender.UNKNOWN_GENDER);
//
//        // ��ȡ���list
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
     * ��̬ʵ������������һ��������ȵ�ArrayList<Person>���ϣ����ڼ��������������nullֵ;
     *
     * @return
     */
    public static ArrayList<Person> getPersons() {

        // �趨�����List����
        int number = ThreadLocalRandom.current().nextInt(10, 100);

        // ��ʼ��List����������Ϊnumber
        ArrayList<Person> list = new ArrayList<>(number);


        // �������nullֵ�����ĳ��ȣ�list�ĳ���
        int[] nulls = new int[ThreadLocalRandom.current().nextInt(1, 9)];
        for (int i = 0; i < nulls.length; i++) {
            // �������nullֵ��λ�ã����ó���numberֵ
            nulls[i] = ThreadLocalRandom.current().nextInt(number);
        }

        for (int i = 0; i < number; i++) {

            // ��ȡ���������������Ա�
            String name = MyRandom.randomName();
            int age = ThreadLocalRandom.current().nextInt(10, 100);
            Gender gender = Gender.of(MyRandom.randomGender());


            // ��ʼ��Person
            Person p = new Person(name, age, gender);


            // �������nullֵ��λ�ã�����p��Ϊnull
            for (int j = 0; j < nulls.length; j++) {
                if (i == nulls[j])
                    p = null;
            }

            // ���p��list��
            list.add(p);
        }

        return list;
    }

    public static ArrayList<Optional<Person>> getPersons02() {


        // �趨�����List����
        int number = ThreadLocalRandom.current().nextInt(10, 100);

        // ��ʼ��List����������Ϊnumber
        ArrayList<Optional<Person>> list = new ArrayList<>(number);


        // �������nullֵ�����ĳ��ȣ�list�ĳ���
        int[] nulls = new int[ThreadLocalRandom.current().nextInt(1, 9)];
        for (int i = 0; i < nulls.length; i++) {
            // �������nullֵ��λ�ã����ó���numberֵ
            nulls[i] = ThreadLocalRandom.current().nextInt(number);
        }

        for (int i = 0; i < number; i++) {

            // ��ȡ���������������Ա�
            String name = MyRandom.randomName();
            int age = ThreadLocalRandom.current().nextInt(10, 100);
            Gender gender = Gender.of(MyRandom.randomGender());


            // ��ʼ��Person
            Person p = new Person(name, age, gender);


            // �������nullֵ��λ�ã�����p��Ϊnull
            for (int j = 0; j < nulls.length; j++) {
                if (i == nulls[j])
                    p = null;
            }

            Optional<Person> p1 = Optional.ofNullable(p);

            // ���p��list��
            list.add(p1);
        }

        return list;
    }
}
