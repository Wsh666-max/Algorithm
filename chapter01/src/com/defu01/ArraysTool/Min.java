package com.defu01.ArraysTool;

/**
 * ClassName: Min
 * Package: com.defu01.ArraysTool
 * Description:
 *              找出数组最小值和索引
 * @Author 华因斯坦
 * @Create 2025/3/4 17:12
 * @Version 1.0
 */
public class Min {
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public int getMinIndex(int[] arr) {
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
