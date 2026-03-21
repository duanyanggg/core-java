package com.yang.task;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
/*判断素数*/
public class Homework1 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number <= 0) {
            System.out.println("输入数字不正确");
            return;
        } else if (number == 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("是素数");
        } else {
            System.out.println("不是素数");
        }
    }
}
