package data_structure.sort;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

@Data
public class Student {


    private String name;
    private double grade;

    public Student() {
    }

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }


    public static Student[] getStudents(int number) {
        String[] names = {"turing", "frank", "tom", "aim", "bob", "bill"};
        ThreadLocalRandom current = ThreadLocalRandom.current();

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(1);

        Student[] students = new Student[number];
        for (int i = 0; i < students.length; i++) {
            double grade = current.nextDouble(0, 100);
            students[i] = new Student(names[current.nextInt(0, names.length - 1)], Double.parseDouble(nf.format(grade)));
        }
        return students;
    }

}
