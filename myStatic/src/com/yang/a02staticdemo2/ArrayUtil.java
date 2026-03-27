package com.yang.a02staticdemo2;

import java.util.StringJoiner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/26
 */
//创建数组工具类
public class ArrayUtil {
    private ArrayUtil() {};

    //打印整数数组内容
    public static String printArr(int[] arr) {
        if (arr == null) {
            System.out.println("数组不存在");
            return "";
        }
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i : arr) {
            sj.add(i + "");
        }
        return sj.toString();
    }

    //返回平均分
    public static double getAverage(double[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum/ arr.length;
    }
}
