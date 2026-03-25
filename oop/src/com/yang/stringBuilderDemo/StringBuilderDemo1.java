package com.yang.stringBuilderDemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //1,创建对象
        StringBuilder sb = new StringBuilder("abc");

        //2.添加字符串
        sb.append(1);
        sb.append('a');
        sb.append("aaa");

        //链式编程
        sb.append(1).append("hhh").append("ddd");

        //3.反转字符串
        sb.reverse();

        //打印容器内容
        System.out.println(sb);

        //将StringBuilder转换为字符串
        String str = sb.toString();
        System.out.println(str);
    }
}
