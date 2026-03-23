package com.yang.basicdemo;

import java.util.Arrays;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] x = {12, 23, 34, 45, 32};
        int[] y = Arrays.copyOf(x,5);
        int[] z = Arrays.copyOfRange(x,1,5);
        int[] a = new int[4];
        System.arraycopy(x,1, a,0,4);
        System.out.println(Arrays.toString(y));
    }
}
