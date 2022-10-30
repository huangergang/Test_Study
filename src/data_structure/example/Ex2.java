package data_structure.example;

import data_structure.demo.SpentRuntime;

import java.util.Calendar;

public class Ex2 {

    /**
     * 例3：写程序计算给定多项式在定点x处的值。
     */


    public double f(int n, double[] a, double x) {
        int i;
        double p = a[0];
        for (i = 0; i <= n; i++) {
            p += (a[i] * Math.pow(x, i));
        }

        return p;
    }


    // 秦九绍
    public double f2(int n, double[] a, double x) {
        int i;
        double p = a[n];
        for (i = n; i > 0; i--)
            p = a[i - 1] + x * p;

        return p;
    }



    public static void main(String[] args) {

        double[] a = {1,3,2};

        long start = Calendar.getInstance().getTimeInMillis();

        new Ex2().f2(2,a,1);

        long end = Calendar.getInstance().getTimeInMillis();

        System.out.println((double) end - start);


    }


}
