package com.defu01.ArraysTool;

/**
 * ClassName: Reverse
 * Package: com.defu01.ArraysTool
 * Description:
 *
 * @Author 华因斯坦
 * @Create 2025/3/4 19:07
 * @Version 1.0
 */
public class Reverse {
    public void ReverseArray(int[] arr) {
        for (int i = 0, j = arr.length - 1 - i; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
