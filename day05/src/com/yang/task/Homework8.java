package com.yang.task;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework8 {
    public static void main(String[] args) {
        final int LINE = 9;
        final int ROW = 9;
        for (int i = 1; i <= LINE; i++) {
            for (int j = 1; j <= ROW; j++) {
                if (i == LINE/2 + 1 || j == ROW / 2 + 1 ||
                i == j || i + j == LINE + 1) {
                    System.out.printf("*");
                } else {
                    System.out.printf(" ");
                }
            }
            System.out.println();
        }
    }
}
