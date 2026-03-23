package com.yang.stringdemo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */
public class StringDemo3 {
    public static void main(String[] args) {
        //1.键盘录入abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();

        //2.自定义abc
        String str2 = "abc";

        //==比较
        System.out.println(str1 == str2);
        //equals比较
        System.out.println(str1.equals(str2));
    }
}
