package com.defu01.ArraysTool;

/**
 * ClassName: copyAryay
 * Package: com.defu01.ArraysTool
 * Description:
 *
 * @Author 华因斯坦
 * @Create 2025/3/4 18:58
 * @Version 1.0
 */

//测验数组是否正确就看他打印后的地址是否一样
public class Copy {
    public int[] CopyArray(int[] arr) {
        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            b[i] = arr[i];
        }
        return b;
    }
}
