package JVM;

/**
 * 局部变量的线程安全问题
 */
public class Demo1_17 {

    public static void main(String[] args) throws InterruptedException {
        StringBuilder sb = new StringBuilder();
//        sb.append(4).append(5).append(6);

        for (int i = 0; i < 1000; i++) {

            Thread m1 = new Thread(() -> {
                m2(sb);
            });
//            m1.setPriority(1);
            m1.start();

            Thread m2 = new Thread(() -> {
                m2_1(sb);
            });
//            m2.setPriority(5);
            m2.start();


            System.out.println("sb = " + sb);
            sb.delete(0, sb.length());
        }
    }

    public static void m1() {
        StringBuilder sb = new StringBuilder();
        sb.append(1)
                .append(2)
                .append(3);
        System.out.println(sb.toString());
    }


    public static void m2(StringBuilder sb) {
        sb.append(1)
                .append(2)
                .append(3);
//        System.out.println(sb.toString());
    }

    public static void m2_1(StringBuilder sb) {
        sb.append(4)
                .append(5)
                .append(6);
//        System.out.println(sb.toString());
    }

    public static StringBuilder m3() {
        StringBuilder sb = new StringBuilder();
        sb.append(1)
                .append(2)
                .append(3);
        return sb;
    }
}
