package com.yang.task;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
/*水仙数*/
public class Homework2 {
    public static void main(String[] args) {
        int a,b,c,sum;
        for (int i = 100; i < 1000; i++){
           a = i / 100;
           c = i % 10;
           b = (i - a * 100) / 10;
           sum =(int)(Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));
           if (sum == i) {
               System.out.println(i);
           }
        }
    }
}
