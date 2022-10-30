package test.com.javaSE1.collection;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String gender;
    private int sge;
    private String belong;

    public Student(int id, String name, String gender, int sge, String belong) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.sge = sge;
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

    public int getSge() {
        return sge;
    }

    public void setSge(int sge) {
        this.sge = sge;
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
                ", sge=" + sge +
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
