package com.yang.stringdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */
//字符串的比较
public class StringDemo2 {
    public static void main(String[] args) {
        //1.创建两个字符串对象
        String s1 = "abc";
        String s2 = new String("Abc");

        //2.==号比较
        //基本数据类型比较值
        //引用数据类型比较地址
        System.out.println(s1 == s2);

        //3.比较字符串内容是否相同
        boolean result1 = s1.equals(s2);
        System.out.println(result1);

        //4.忽略大小写比较字符串内容
        boolean result2 = s1.equalsIgnoreCase(s2);
        System.out.println(result2);
    }
}
