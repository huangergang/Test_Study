package test.com.javaSE2.IOstream;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

public class IOTest {

    public static void main(String[] args) throws Exception {

//        FileInputStream inputStream = new FileInputStream("src/file.txt");
//
//        byte[] buff = new byte[10];
//        int len = -1;
//        while ((len=inputStream.read(buff))!=-1) {
//            System.out.print(new String(buff,0,len));
//        }
//        int i = -1;
//        while ((i=inputStream.read())!=-1){
//            System.out.println((char) i);
//        }

//        PushbackInputStream in = new PushbackInputStream(new FileInputStream("src/file.txt"));
//
//        int b = in.read();
//        while (b!='i'){
//            in.unread(b);
//            System.out.println(b);
//        }

//        while (true) {
//            Reader in = new InputStreamReader(System.in);
//            System.out.println((char) in.read());
//        }


        Stream<Person> stream = Stream.of(new Person(1, "frank", "male"),
                new Person(2, "red", "male"),
                new Person(3, "aim", "female"));
        Map<String, Set<Person>> map = stream.collect(Collectors.groupingBy(Person::getSex,toSet()));
        map.forEach((s, list) -> {
            System.out.println(s);
            list.forEach(System.out::println);
        });


    }
}

class Person {
    private Integer id;
    private String name;
    private String sex;

    public Person() {
    }

    public Person(Integer id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}