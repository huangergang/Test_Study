package test.com.javaSE1.fourthUnit;

public class Test5 {

    public static void main(String[] args) {

        Empl[] sta = new Empl[3];


        Empl empl = new Empl(222.2);

        Empl empl1 = new Empl(222.2);
        String s1  = "hello";
        String s2 = new String("hello");
        System.out.println(empl.hashCode());
        System.out.println(empl1.hashCode());
        System.out.println(s1.equals(s2));
    }

}
