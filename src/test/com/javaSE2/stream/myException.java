package test.com.javaSE2.stream;

public class myException extends Exception {
    private static final String massage = "this is my exception.";

    public myException() {
        super(myException.massage);
    }

}
