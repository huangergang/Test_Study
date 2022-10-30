package test.school;

import java.sql.Connection;
import java.util.*;

public class Test {

    private int number;

    Test() {
        this.number = 0;
    }

    public int getNumber() {
        return number;
    }

    static Scanner in = new Scanner(System.in);

    public static Student findID(Collection<Student> connection, int id) {
        Student stu = null;
        for (Iterator<Student> it = connection.iterator(); it.hasNext(); ) {
            stu = it.next();
            if (stu.getId() == id) {
                break;
            }
        }
        return stu;
    }

    public static void delete(Collection<Student> connection, int id) {
        connection.remove(findID(connection, id));
    }

    public static void alter(Collection<Student> connection, int id, String name, String gender, int age, String belong) {
        Student stu = findID(connection, id);
        stu.setName(name);
        stu.setGender(gender);
        stu.setAge(age);
        stu.setBelong(belong);
    }

    public static void showEnum() {
        System.out.println(" 1————学生添加\n" +
                "        2————学生删除\n" +
                "        3————学生信息修改\n" +
                "        4————根据学号查询学生信息\n" +
                "        5————查询所有学生信息");
    }

    public static void show(Collection<Student> connection) {
        for (Iterator<Student> it = connection.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }
    }

    public static void showEnum1() {
        System.out.println("1.学生录入（学号、姓名、年龄、所在学院）\n" +
                "2.学生信息查询 (全部)");
    }


    public static void run(Collection list) {
        while (true) {
            showEnum();
            int order = in.nextInt();
            switch (order) {
                case 1:
                    System.out.println("请输入学生信息：");
                    list.add(new Student(in.nextInt(), in.next(), in.next(), in.nextInt(), in.next()));
                    break;
                case 2:
                    System.out.println("请输入学号:");
                    delete(list, in.nextInt());
                    break;
                case 3:
                    System.out.println("请输入学号，并输入新的信息（不包含学号）:");
                    alter(list, in.nextInt(), in.next(), in.next(), in.nextInt(), in.next());
                    break;
                case 4:
                    System.out.println("请输入学号:");
                    System.out.println(findID(list, in.nextInt()));
                    break;
                case 5:
                    show(list);
                    break;
            }
        }

    }


    public static void run1(Collection list) {
        while (true) {
            showEnum();
            int order = in.nextInt();
            switch (order) {
                case 1:
                    System.out.println("请输入学生信息：");
                    list.add(new Student(in.nextInt(), in.next(), in.next(), in.nextInt(), in.next()));
                    break;
                case 2:
                    show(list);
                    break;
            }
        }
    }

    public static void main(String[] args) {

        Collection<Student> list = new TreeSet<>((Student o1, Student o2) -> o1.getId() - o2.getId());
        list.add(new Student(1, "2", "2", 45, "23"));
        list.add(new Student(2, "2", "2", 45, "23"));
        list.add(new Student(3, "2", "2", 45, "23"));
        list.add(new Student(0, "2", "2", 45, "23"));
        for (Iterator<Student> it = list.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }


    }
}

class Student {
    private int id;
    private String name;
    private String gender;
    private int age;
    private String belong;

    public Student(int id, String name, String gender, int age, String belong) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.belong = belong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int sge) {
        this.age = age;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", sge=" + age +
                ", belong='" + belong + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
