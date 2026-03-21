package com.yang.demo;

import java.util.Arrays;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class ToStringDemo {
    public static void main(String[] args) {
        int[] x = {14, 13, 15, 21, 19, 11, 12};
        String s = Arrays.toString(x);
        System.out.println(s);
    }
}
