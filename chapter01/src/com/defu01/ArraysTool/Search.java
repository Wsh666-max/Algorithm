package com.defu01.ArraysTool;

/**
 * ClassName: Search
 * Package: com.defu01.ArraysTool
 * Description:
 *
 * @Author 华因斯坦
 * @Create 2025/3/4 20:00
 * @Version 1.0
 */
public class Search {
    public int LineSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public int BinarySearch(int[] arr, int target) {
        int head = 0;
        int end = arr.length - 1;
        while (head <= end) {
            int mid = (head + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < mid) {
                end = mid - 1;
            }else {
                head = mid + 1;
            }
        }
        return -1;
    }
}
