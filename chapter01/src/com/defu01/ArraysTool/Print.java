package com.defu01.ArraysTool;

/**
 * ClassName: Print
 * Package: com.defu01.ArraysTool
 * Description:
 *
 * @Author 华因斯坦
 * @Create 2025/3/4 19:08
 * @Version 1.0
 */
public class Print {
    public void PrintArry(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            }else {
                System.out.println(arr[i] + "]");
            }
        }
    }
}
