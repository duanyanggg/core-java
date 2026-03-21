package com.yang.task;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework6 {
    public static void main(String[] args) {
        final int LINE = 4;
        final int ROW = 6;

        for (int i = 0; i < LINE; i++) {
            for (int emp = 0; emp < i; emp++){
                System.out.printf(" ");
            }
            for (int j = 0; j < ROW; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
