package com.yang.demo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Continue_Demo {
    public static void main(String[] args) {
        lable1:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + "\t");
                if (j == 4)
                    break lable1;
            }
            System.out.println();
        }
    }
}
