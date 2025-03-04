package com.defu01.ArraysTool;

import java.util.concurrent.ForkJoinPool;

/**
 * ClassName: SortArrays
 * Package: com.defu01.ArraysTool
 * Description:
 *
 *      ascend——升序
 *      descend——降序
 *
 * @Author 华因斯坦
 * @Create 2025/3/4 19:24
 * @Version 1.0
 */
public class SortArrays {
    public void Sort(int[] arr, String sortMethode) {
        if ("ascend".equals(sortMethode)) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        } else if ("descend".equals(sortMethode)) {
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }

    /**
     * 快速排序
     * @param arr 传入的数组
     * @param low 数组的起始位
     * @param high 数组的末位
     */
    public void Sort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[low];
            int i = low;
            int j = high;
            while (i < j) {
                while (i < j && arr[j] > pivot) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (i < j && arr[i] < pivot) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = pivot;
            Sort(arr, low, i - 1);
            Sort(arr, i + 1, high);
        }
    }
}
