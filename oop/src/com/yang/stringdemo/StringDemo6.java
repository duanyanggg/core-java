package com.yang.stringdemo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */

//键盘录入字符串，统计各种字符串出现的次数
public class StringDemo6 {
    public static void main(String[] args) {

        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        //统计各种字符个数
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                bigCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                smallCount++;
            } else if (ch >= '0' && ch <= '9') {
                numCount++;
            }
        }
        System.out.println("大写字母有" + bigCount + "个");
        System.out.println("小写字母有" + smallCount + "个");
        System.out.println("数字有" + numCount + "个");
    }
}
