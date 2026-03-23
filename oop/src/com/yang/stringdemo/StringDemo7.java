package com.yang.stringdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */

//拼接字符串
public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(ArrToString(arr));
    }
    public static String ArrToString(int[] arr) {
        if (arr == null) {
            return " ";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
            if (i != arr.length - 1) {
                str += ",";
            }
        }
        str += "]";
        return str;
    }
}
