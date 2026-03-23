package com.yang.stringdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */
//如何获取字符串
public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值获取字符串对象
        //在串池中，相同的字符串会指向一个地址
        String s1 = "abc";

        //2.使用new的方式获取一个字符串对象
        //空参构造：可以获取一个空白的字符串对象
        String s2 = new String();
        System.out.println("2" + s2 + "!");

        //字符数组， 根据字符数组内容创建一个新的字符串对象
        //修改字符串时使用
        char[] chs = {'a', 'b', 'c', 'd'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递一个字节数组（对应的是ASC码）
        byte[] bys = {97,98,99,100};
        String s5 = new String(chs);
        System.out.println(s5);
        //“==”在引用数据类型中比较的不是值，是地址
    }
}
