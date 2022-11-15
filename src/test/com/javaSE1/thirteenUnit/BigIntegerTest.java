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

//
//        int[][] arr = {{1, 2, 4}, {4, 5, 6}, {7, 8, 9}};
//        int[][] arr1 = {{1}, {2, 2}, {3, 3, 3}};
//        System.out.println(Arrays.deepToString(arr));
//        for (int[] ints : arr1) {
//            for (int anInt : ints) {
//                System.out.print(anInt +" ");
//            }
//            System.out.println();
//        }

//
//        int max = 0b00000000000000000000000000000001;
//        int m = 0b11111111111111111111111111111101;
//        mathShowString(max);
//        System.out.println("---------------------------------");
//        mathShowString(m);

        // 冒泡  快速  选择  插入  归并  shell_sort
        // 二分


        int a = -10;
//        mathShowString(a );

//        byte b = 127;
//        System.out.println(Integer.toBinaryString(b));
//        byte v1 = 1;
//        System.out.println(Integer.toBinaryString(v1));
//        byte v2 = (byte) (b + v1);
//        System.out.println(Integer.toBinaryString(v2));
//        System.out.println(v2);

//        System.out.println(Integer.toBinaryString(b + 1));

    }

    static void mathShowString(int n) {
        System.out.print("DEC number = " + n + " \t the int value area in ( " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE + " )");
        System.out.println();
        System.out.println("BIN = " + Integer.toBinaryString(n) + "\t\t" + Integer.toBinaryString(n).length() + "bit");
        System.out.println("OCT = " + Integer.toOctalString(n));
        System.out.println("HEX = " + Integer.toHexString(n));

    }

}
