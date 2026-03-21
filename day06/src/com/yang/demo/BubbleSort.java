package com.yang.demo;

import java.util.Arrays;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] x = {14, 13, 15, 21, 19, 11, 12};
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
        //Array.sort是快排
        Arrays.sort(x);
        for (int i : x) {
            System.out.println(i);
        }
    }
}
