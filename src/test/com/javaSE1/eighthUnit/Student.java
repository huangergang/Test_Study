package test.com.javaSE1.eighthUnit;

public class Student extends Human {
    private String studentID;

    Student() {
        super();
    }

    public Student(String name){
        super(name);
    }

    public Student(String name, String sex, int age, String ID) {
        super(name, sex, age);
        this.studentID = ID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
















