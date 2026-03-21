package com.yang.task;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework7 {
    public static void main(String[] args) {
        final int LINE = 5;
        final int ROW = 5;
        for (int i = 1; i <= LINE; i++) {
            for (int j = 1; j <= ROW; j++) {
                if (i == 1 || i == LINE || i + j == LINE + 1) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
