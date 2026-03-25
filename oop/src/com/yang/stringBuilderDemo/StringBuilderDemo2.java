package com.yang.stringBuilderDemo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */

/*StringBuilder应用场景
1.拼接字符串
2.反转字符串*/
public class StringBuilderDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str).reverse();
        String reversedStr = sb.toString();
        if (str.equals(reversedStr)) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("非对称字符串");
        }
    }
}
