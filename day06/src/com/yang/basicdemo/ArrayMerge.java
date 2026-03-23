package com.yang.basicdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class ArrayMerge {
    public static void main(String[] args) {
        int[] x = {12, 23, 34};
        int[] y = {23, 34, 45, 56};
        int[] z = new int[x.length + y.length];
        for (int i = 0; i < z.length; i++) {
            if (i < x.length) {
                z[i] = x[i];
            } else {
                z[i] = y[i - x.length];
            }
        }
        for (int j : z) {
            System.out.println(j);
        }
    }
}
