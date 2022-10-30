package test.com.javaSE2.scriptCompileAnnotation;

@myAnnotation(name = "Test", number = 2)
public class Test8 {

    @Deprecated
    public static void get() {
        System.out.println("Deprecated...");
    }


    public static void main(String[] args) {
        get();
    }

}
