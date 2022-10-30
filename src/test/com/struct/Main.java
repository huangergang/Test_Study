package test.com.struct;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        long st = Calendar.getInstance().getTimeInMillis();
        int N = 900000000;
        int[] A = MaxSubNumber.random(N);
        System.out.println("生成数组成功！\n数组长度："+ N +"\n" +"花费时间："+((double)(Calendar.getInstance().getTimeInMillis()-st))+" 毫秒");
        System.out.println("---------------");

//        System.out.print("随机生成数组A:[ ");
//        for (int i = 0; i < N; i++) {
//            System.out.print(A[i] + " ");
//        }
//        System.out.print("]");
//        System.out.println();


//        long start = Calendar.getInstance().getTimeInMillis();//开始时间,单位是毫秒
//        int max = MaxSubNumber.firstMax(A, N);
//        System.out.println("max sum : " + max);
//        long end = Calendar.getInstance().getTimeInMillis();//结束时间
//        double spentTime = (double) end - start; //末减初就是所花时间
//        System.out.println("First method spent " + spentTime + " milliseconds");

//        long start1 = Calendar.getInstance().getTimeInMillis();//开始时间,单位是毫秒
//        int max1 = MaxSubNumber.secondMax(A, N);
//        System.out.println("max sum : " + max1);
//        long end1 = Calendar.getInstance().getTimeInMillis();//结束时间
//        double spentTime1 = (double) end1 - start1; //末减初就是所花时间
//        System.out.println("Second method spent " + spentTime1 + " milliseconds");

        long start3 = Calendar.getInstance().getTimeInMillis();//开始时间,单位是毫秒
        int max3 = MaxSubNumber.thirdMax(A, 0, A.length - 1);
        System.out.println("max sum : " + max3);
        long end3 = Calendar.getInstance().getTimeInMillis();//结束时间
        double spentTime3 = (double) end3 - start3; //末减初就是所花时间
        System.out.println("Third method spent " + spentTime3 + " milliseconds");

        long start2 = Calendar.getInstance().getTimeInMillis();//开始时间,单位是毫秒
        int max2 = MaxSubNumber.fourthMax(A, N);
        System.out.println("max sum : " + max2);
        long end2 = Calendar.getInstance().getTimeInMillis();//结束时间
        double spentTime2 = (double) end2 - start2; //末减初就是所花时间
        System.out.println("Fourth method spent " + spentTime2 + " milliseconds");

    }

}

