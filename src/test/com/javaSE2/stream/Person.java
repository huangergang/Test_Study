package test.com.javaSE2.stream;

import java.util.Objects;

public class Person {
    private String name;
    private int old;
    private Gender gender;

    public Person() {
    }

    public Person(String name, int old, Gender gender) {
        this.name = name;
        this.old = old;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return old == person.old && Objects.equals(name, person.name) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, old, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", old=" + old +
                ", gender=" + gender +
                '}';
    }


}
