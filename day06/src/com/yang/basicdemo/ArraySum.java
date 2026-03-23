package com.yang.basicdemo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入学生人数：");
        int len = scanner.nextInt();
        int[] scores = new int[len];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请录入分数：");
            scores[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        System.out.println("总成绩为" + sum);
        System.out.println("平均成绩为" + sum * 1.0 / scores.length);
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max = scores[i];
            }
        }
        System.out.println("最高分数为" + max);
    }
}
