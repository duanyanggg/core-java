package com.yang.demo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class Overload_Demo {
    public static void main(String[] args) {

    }
    //可变参数
    public static void add (int... arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println(sum);
    }
}
