package test.com.javaSE1.collection;

public class setTest {

    static int x, y, a, b;

    private static volatile int xx =0;

    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        for (; ; ) {
            i++;
            x = 0; y = 0;
            a = 0; b = 0;

            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    x = a;
                }
            });

            Thread two = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    y = b;
                }
            });

            one.start();two.start();
            one.join();two.join();

            String result = "第" + i + "次 C" + x + "," + y + ")";
            System.out.println(result);
            if (x == 0 && y == 0) {
                System.out.println(result);
                break;
            }
        }
    }
}
