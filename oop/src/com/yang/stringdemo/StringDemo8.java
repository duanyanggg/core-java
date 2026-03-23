package com.yang.stringdemo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */
public class StringDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        str = reverseStr(str);
        System.out.println(str);
    }

    public static String reverseStr(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
}
