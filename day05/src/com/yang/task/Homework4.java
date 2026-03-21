package com.yang.task;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework4 {
    public static void main(String[] args) {
        boolean isPrime = true;
        for(int j = 2; j < 100; j++) {
            for(int i = 2; i <= Math.sqrt(j); i += 1) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(j);
            }
            isPrime = true;
        }
    }
}
