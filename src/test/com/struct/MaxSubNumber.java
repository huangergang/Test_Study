package test.com.struct;

import org.junit.Test;

import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public class MaxSubNumber {
    // 算法1 时间复杂度为 O(N^3)
    public static int firstMax(int A[], int N) {
        int ThisSum, MaxSum, i, j, k;
        MaxSum = 0;
        for (i = 0; i < N; i++)
            for (j = i; j < N; j++) {
                ThisSum = 0;
                for (k = i; k <= j; k++) {
                    ThisSum += A[k];
                    if (ThisSum > MaxSum)
                        MaxSum = ThisSum;
                }
            }
        return MaxSum;
    }

    // 算法2 时间复杂度为 O(N^2)
    public static int secondMax(int A[], int N) {
        int ThisSum, MaxSum, i, j;
        MaxSum = 0;
        for (i = 0; i < N; i++) {
            ThisSum = 0;
            for (j = i; j < N; j++) {
                ThisSum += A[j];
                if (ThisSum > MaxSum)
                    MaxSum = ThisSum;
            }
        }
        return MaxSum;
    }

    // 算法3 时间复杂度为 O(N*logN)
    public static int thirdMax(int A[], int Left, int Right) {
        int MaxLeftSum, MaxRightSum;
        int MaxLeftBorderSum, MaxRightBorderSum;
        int LeftBorderSum, RightBorderSum;
        int Center, i;

        if (Left == Right)
            if (A[Left] > 0)
                return A[Left];
            else
                return 0;
        Center = (Left + Right) / 2;
        MaxLeftSum = thirdMax(A, Left, Center);
        MaxRightSum = thirdMax(A, Center + 1, Right);

        MaxLeftBorderSum = 0;
        LeftBorderSum = 0;
        for (i = Center; i >= Left; i--) {
            LeftBorderSum += A[i];
            if (LeftBorderSum > MaxLeftBorderSum)
                MaxLeftBorderSum = LeftBorderSum;
        }

        MaxRightBorderSum = 0;
        RightBorderSum = 0;
        for (i = Center + 1; i <= Right; i++) {
            RightBorderSum += A[i];
            if (RightBorderSum > MaxRightBorderSum)
                MaxRightBorderSum = RightBorderSum;
        }

        return Math.max(Math.max(MaxLeftSum, MaxRightSum), MaxLeftBorderSum + MaxRightBorderSum);
    }

    // 算法4 时间复杂度为 O(N)
    public static int fourthMax(int A[], int N) {
        int ThisSum, MaxSum, j;
        ThisSum = MaxSum = 0;
        for (j = 0; j < N; j++) {
            ThisSum += A[j];
            if (ThisSum > MaxSum)
                MaxSum = ThisSum;
            else if (ThisSum < 0)
                ThisSum = 0;
        }
        return MaxSum;
    }

    // 随机生成一个int类型的数组，长度为参数 N,随机数的范围为[a,b]
    public static int[] random(int N) {
        int[] array = new int[N];
        int a = -100;
        int b = 100;
        for (int i = 0; i < N; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(a, b);
        }
        return array;
    }



}
