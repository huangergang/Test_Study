package data_structure.sort;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Sorts {

    /**
     * 返回一个长度为length的 int[] 随机数组
     */
    public static int[] init(int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = ThreadLocalRandom.current().nextInt(0, arr.length);

        return arr;
    }

    /**
     * 交互两个位置的数组值
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 选择排序
     * 基本思想:
     * 首先在未排序序列中找到最小(大)元素，存放到排序序列的起始位置，
     * 后，再从剩余未排序元素中继续寻找最小(大)元素，然后放到已排序序列
     * 末尾。以此类推，直到所有元素均排序完毕。
     */
    public static void selectSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

    }

    /**
     * 插入排序
     * 基本思想:
     * 从 1 开始，把左边的数组当作有序数列，拿出后面未排序的数，
     * 从右到左比较，如果小于，比较的元素右移，直到找到要插入的位置
     * 最后交换
     */
    public static void insertSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];

            int j = i;
            for (; j > 0 && target < arr[j - 1]; j--) {
                arr[j] = arr[j - 1];
            }

            arr[j] = target;
        }

    }

    /**
     * 快速排序
     */
    public static void quickSort(int[] arr) {

    }

    /**
     * 归并排序
     */
    public static void mergeSort(int[] arr) {

    }

    /**
     * 堆排序
     */
    public static void heapSort(int[] arr) {

    }

    /**
     * 基数排序
     */
    public static void radixSort(int[] arr) {

    }

    /**
     * 希尔排序
     */
    public static void shellSort(int[] arr) {

        int length = arr.length;
        int temp;
        for (int step = length / 2; step >= 1; step /= 2) {
            for (int i = step; i < length; i++) {
                temp = arr[i];
                int j = i - step;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + step] = arr[j];
                    j -= step;
                }
                arr[j + step] = temp;
            }
        }

    }

    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;

            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                    flag = false;
                }
            }

            if (flag) {
                break;
            }
        }

    }

    /**
     * 鸡尾酒排序
     */
    public static void cocktailSort(int[] arr) {

    }


    /**
     * 侏儒排序
     */
    public static void gnomeSort(int[] arr) {

    }


    public static void main(String[] args) {

        int[] arr = init(1000);
        System.out.println(Arrays.toString(arr));
        int[] arrCopy = Arrays.copyOf(arr, arr.length);

        Arrays.sort(arrCopy);
        Sorts.bubbleSort(arr);

        if (Arrays.equals(arr, arrCopy))
            System.out.println("sort success!");
        else
            System.out.println("sort error!");


    }

}
