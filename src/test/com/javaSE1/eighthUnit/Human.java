package test.com.javaSE1.eighthUnit;

public abstract class Human implements Comparable {
    private String name;
    private String sex;
    private int age;

    public Human() {

    }

    public Human(String name) {
        this.name = name;
    }


    public Human(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        Human human = (Human) o;
        return Double.compare(age, human.age);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", sex='" + sex + '\'' +
                        ", age=" + age + " "
                ;
    }
}
