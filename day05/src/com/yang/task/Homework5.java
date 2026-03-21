package com.yang.task;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework5 {
    public static void main(String[] args) {
        System.out.println(1);
        for (int i = 2; i <= 100; i++) {
            int sum = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (j * j == i) {
                    sum += j;
                } else if (i % j == 0) {
                    sum += j + i / j;
                }
            }
            if (sum - i== i) {
                System.out.println(i);
            }
        }
    }
}
