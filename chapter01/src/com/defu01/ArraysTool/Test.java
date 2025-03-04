package com.defu01.ArraysTool;

/**
 * ClassName: Test
 * Package: com.defu01.ArraysTool
 * Description:
 *              测试类
 * @Author 华因斯坦
 * @Create 2025/3/4 17:18
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,3,8,1,7,9,23,10};

        //new一个对象
        Max max = new Max();
        //通过对象调用方法
        System.out.println("数组中的最大元素为："+ max.getMax(arr));
        System.out.println("数组中的最大元素的下标为：" + max.getMaxIndex(arr));

        Min min = new Min();
        System.out.println("数组中最小的元素为" + min.getMin(arr));
        System.out.println("数组中最小的元素的索引为" + min.getMinIndex(arr));

        Sum_Average num = new Sum_Average();
        System.out.println("sum = " + num.getSum(arr));
        System.out.println("average = " + num.getAverage(arr));
    }
}
