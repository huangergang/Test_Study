package test.school;


import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class TestDemo {

    public static double f(int N) {
        double res = N;
        if (N > 1)
            res *= f(N - 1);

        return Math.log(res);
    }

    public static void swap(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a + "  " + b);

    }

    public static void rMatrix(int arr[][]) {
        int row = arr.length - 1;
        int rank = arr[row].length - 1;

        for (int i = 0; i <= rank; i++) {
            for (int j = 0; j <= row; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) throws Exception {
        System.out.println(true && false || true && true);
    }


}







