package test.com.javaSE1.fourthUnit;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test4 {
    /**
     * 一个正整数可以表示为 N 个质数的乘积
     * 一个正整数的约数个数为 N 个质数的 指数的组合数
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> p = new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            boolean bo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    bo = false;
                }
            }
            if (bo) {
                list.add(i);
            }
        }

        Long gs = 1l;
        for (int i = 0; i < list.size(); i++) {
            Long mc = 0l;
            int n = 5;
            while (n != 0) {
                mc = mc + (n = n / list.get(i));
            }
            System.out.println(mc);
            gs = gs * (mc + 1);
        }

        System.out.println(gs);

    }
}

class Test1 {

    public static void main(String[] args) {

//        int s = 123412;
//
//        System.out.println(Integer.toBinaryString(s));
//        int t = s << 2;
//        System.out.println(Integer.toBinaryString(t));

//        System.out.println(true | false);
//        String s = "hello";

//        String[] arr = {"Frank", "Tim", "Alan", "Aim"};
//        System.out.println(String.join("-->", arr));

       /* Map<String, Double> map = new HashMap<>();
        map.put("IPhone 14pro max", 12000.0);
        map.put("Huawei mate40 pro", 11000.0);
        map.put("xiaomi 12 pro", 12000.0);

        System.out.printf("%-20s%18s", "商品名", "价格");
        System.out.print("\n------------------------------------------\n");
        map.forEach((k, v) -> {
            System.out.printf("%-20s% 20.2f元\n", k, v);
        });*/

//        Date date = new Date();
//        System.out.println("date = " + date);

        System.out.printf("%tQ", new Date());
        System.out.printf("%1$tr %1$tA", new Date());

    }
}