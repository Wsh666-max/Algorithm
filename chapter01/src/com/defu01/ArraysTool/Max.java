package com.defu01.ArraysTool;

/**
 * ClassName: Max_Min
 * Package: com.defu01.ArraysTool
 * Description:
 *              找出数组最大值和索引
 * @Author 华因斯坦
 * @Create 2025/3/4 17:08
 * @Version 1.0
 */
public class Max {
    public int getMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public int getMaxIndex(int[] arr) {
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
