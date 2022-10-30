package test.com.javaSE2.stream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static Stream<String> letters(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.substring(i, i + 1));
        }
        return result.stream();
    }

    public static void main(String[] args) throws IOException, myException {

        getPersonStream()
                .collect(Collectors.groupingBy(Person::getGender))
                .forEach(((gender, people) -> {
                    System.out.println(gender);
                    people.forEach(System.out::println);
                }));


    }


    private static List<Person> getPersonList() {
        return List.of(
                new Person("Frank", 46, Gender.MALE),
                new Person("Bob Alan", 67, Gender.MALE),
                new Person("李华", 12, Gender.MALE),
                new Person("韩梅梅", 20, Gender.FEMALE),
                new Person("陈数", 45, Gender.FEMALE)
        );
    }

    private static Stream<Person> getPersonStream() {
        return Stream.of(
                new Person("Frank", 46, Gender.MALE),
                new Person("Bob Alan", 67, Gender.MALE),
                new Person("李华", 12, Gender.MALE),
                new Person("韩梅梅", 20, Gender.FEMALE),
                new Person("陈数", 45, Gender.FEMALE)
        );
    }


}
