package com.yang.stringdemo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */

//遍历字符串
public class StringDemo5 {
    public static void main(String[] args) {
        //1，键盘录入字符串进行遍历
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //字符串长度是方法需要加括号，数组的长度是属性不加括号
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
