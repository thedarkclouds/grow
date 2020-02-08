package com.grow.base.sort;

/**
 * @author huye
 * @date 2020-01-29 00:29
 * @comment 冒泡排序
 * 冒泡排序就是把小的元素往前调或者把大的元素往后调。
 * 比较是相邻的两个元素比较，交换也发生在这两个元素之间。
 * 所以，如果两个元素相等，是不会再交换的；
 * 如果两个相等的元素没有相邻，那么即使通过前面的两两交换把两个相邻起来，这时候也不会交换，
 * 所以相同元素的前后顺序并没有改变，所以冒泡排序是一种稳定排序算法。
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];

                    arr[j] = arr[j + 1];

                    arr[j + 1] = temp;
                }
            }
        }
    }
}
