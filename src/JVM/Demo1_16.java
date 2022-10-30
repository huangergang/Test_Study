package JVM;

public class Demo1_16 {
    public static void main(String[] args) {
        new Thread(() -> {
            while (true) {
            }
        }).start();
    }
}
