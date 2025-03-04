package com.defu01.ArraysTool;

/**
 * ClassName: Sum_Average
 * Package: com.defu01.ArraysTool
 * Description:
 *              总和和平均数
 * @Author 华因斯坦
 * @Create 2025/3/4 17:43
 * @Version 1.0
 */
public class Sum_Average {
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double getAverage(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }
}
