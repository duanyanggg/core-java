package com.yang.demo;

import java.util.Arrays;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class Equals_CompareDemo {
    public static void main(String[] args) {
        int[] x = {12, 23, 34, 45, 32};
        int[] y = Arrays.copyOf(x,x.length);
        // 数组相同true;
        boolean b = Arrays.equals(x,y);
        System.out.println("b = " + b);
        // 前面大1，后面大-1, 相同0;
        int i = Arrays.compare(x,y);
    }
}
