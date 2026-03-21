package com.yang.demo;

import java.util.Arrays;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class FillDemo {
    public static void main(String[] args) {
        int[] x = new int[5];
        //让x中的值覆盖填充为100
        Arrays.fill(x,100);
        //起始位置包含结束位置不包含
        Arrays.fill(x,1,3,100);
        System.out.println(Arrays.toString(x));
    }
}
