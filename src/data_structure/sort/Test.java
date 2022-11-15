package data_structure.sort;

import java.util.Arrays;
import java.util.Comparator;

public class Test {

    public static void main(String[] args) {

        Student turing = new Student();
        Student[] students = Student.getStudents(100);

//        Comparator<Student> comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.getGrade() - o2.getGrade());
//            }
//        };


        Arrays.sort(students, (s1, s2) -> (int) (s1.getGrade() - s2.getGrade()));

        Arrays.stream(students).forEach(System.out::println);

    }

}
