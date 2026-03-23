package com.yang.basicdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class Test01 {
    public static void main(String[] args) {
        //声明数组
        int[] x;

        //既有长度也有元素
        //静态创建数组1
        x = new int[]{1,2,3};
        //静态创建数组2
        double[] y = {10, 20, 30};

        //数组长度确定无法改变
        //会有默认值 0, 0.0, \u0000, false, 引用类型null
        int[] z = new int[10];
        boolean h;
        System.out.println();
        //for each针对数组，集合 x.for
        for (int i : x) {
            System.out.println(x);
        }

    }
}
