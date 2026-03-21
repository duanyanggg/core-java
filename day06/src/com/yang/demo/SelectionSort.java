package com.yang.demo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] x = {14, 13, 15, 21, 19, 11, 12};
        for (int i = 0; i < x.length - 1; i++) {
            int min = i, j, temp;
            for (j = i + 1; j < x.length; j++) {
                if (x[j] < x[min]) {
                    min = j;
                }
            }
           if (i != min) {
               temp = x[min];
               x[min] = x[i];
               x[i] = temp;
           }
        }
        for (int i : x) {
            System.out.println(i);
        }
    }
}
