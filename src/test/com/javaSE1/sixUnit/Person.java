package test.com.javaSE1.sixUnit;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {

//        String[] names = {"frank", "alan", "tom", "aim"};

//        ArrayList<String> namelist = new ArrayList<>();
//        Arrays.stream(names).forEach(namelist::add);

//        Stream<Person> stream = namelist.stream().map(Person::new);
//        List<Person> people = Arrays.stream(names)
//                                                 .map(Person::new)
//                                                 .collect(Collectors.toList());
//
//        people.forEach(System.out::println);

        Stream<Person> stream = Stream.of(new Person("王小明"),
                new Person("上官小红"),
                new Person("李华"),
                new Person("小刚"));
//        Object[] objects = stream.toArray();
        Person[] people = stream.toArray(Person[]::new);

//        Arrays.sort(people, Comparator.comparing(Person::getName)
//                .thenComparing(Person::getName));
//        Arrays.sort(people, Comparator.comparing(Person::getName,
//                (s, t) -> Integer.compare(s.length(), t.length())));

        Arrays.sort(people, Comparator.comparingInt(p -> p.getName().length()));

        System.out.println("people = " + Arrays.toString(people));

    }
}
