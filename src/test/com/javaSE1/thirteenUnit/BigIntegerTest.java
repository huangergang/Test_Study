package test.com.javaSE1.thirteenUnit;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class BigIntegerTest {

    public static void main(String[] args) {
//
//        BigInteger a = new BigInteger("2342342342234234");
//        BigInteger b = BigInteger.valueOf(123);
//
//        BigInteger c = a.add(b);
//        System.out.println("c = " + c);
//
//        BigDecimal a1 = new BigDecimal("2342342342234234.2");
//        BigDecimal b1 = BigDecimal.valueOf(123.2);
//
//        BigDecimal c1 = a1.add(b1);
//        System.out.println("c = " + c1);
//
//        int[] arry = new int[]{1, 2, 3, 4, 5};
//        int[] ints = Arrays.copyOf(arry, arry.length);
//
//        System.out.println(Arrays.toString(ints));


        int[][] arr = {{1, 2, 4}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr1 = {{1}, {2, 2}, {3, 3, 3}};
        System.out.println(Arrays.deepToString(arr));
        for (int[] ints : arr1) {
            for (int anInt : ints) {
                System.out.print(anInt +" ");
            }
            System.out.println();
        }
    }

}
