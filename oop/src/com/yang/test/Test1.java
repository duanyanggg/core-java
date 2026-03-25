package com.yang.test;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
       while (true) {
           System.out.println("请输入长度小于等于9的数字字符串");
           str = sc.next();
           if (checkStr(str)) {
               break;
           } else {
               System.out.println("输入错误");
           }
       }
        System.out.println(toRome(str));
    }

    public static boolean checkStr(String str) {
        boolean result = true;
        int len = str.length();
        if (len > 9) {
            result = false;
        }
        for (int i = 0; i < str.length(); i++) {
            int n = str.charAt(i) - '0';
            if (n < 0 || n > 9) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static String toRome(String str) {
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int x = str.charAt(i) - '0';
            sb.append(arr[x]);
        }
        return sb.toString();
    }
}
