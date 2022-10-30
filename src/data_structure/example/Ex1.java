package data_structure.example;

import org.junit.Test;

public class Ex1 {

    /**
     * 例1： 写程序实现一个函数PrintN，使得传入一个正整数
     * 为N的参数后，能顺序打印从1到N的全部正整数。
     */

    // 循环实现
    public void circulatePintN(int N) {
        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }
    }


    // 递归实现
    public void recurrencePrintN(int N) {
        if (N > 0)
            recurrencePrintN(N - 1);
        System.out.println(N);
    }

    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();

        ex1.circulatePintN(9);
        System.out.println("------------------");
        ex1.recurrencePrintN(100);

    }


}
