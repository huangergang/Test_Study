package test.com.javaSE1.socket;

public class Test {


    public static void main(String[] args) throws Exception {

    }
}

class Person {
     String name = "person";

    public String getName() {
        return name;
    }
}

class Student extends Person {

    String name = super.name;

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println();
    }
}