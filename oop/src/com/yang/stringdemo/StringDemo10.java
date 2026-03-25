package com.yang.stringdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
//substring用法
public class StringDemo10 {
    public static void main(String[] args) {
        String str = "12345563748";
        //截取字符串包左不包右
        String str1 = str.substring(0,3);
        //从序号截取字符串
        String str2 = str.substring(6);
        System.out.println(str1);
        System.out.println(str2);
    }
}
