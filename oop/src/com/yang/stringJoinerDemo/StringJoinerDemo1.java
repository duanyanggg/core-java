package com.yang.stringJoinerDemo;

import java.util.StringJoiner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */

    //StringJoiner便于在内容中间加上连接符
    //JDK8以后
public class StringJoinerDemo1 {
    public static void main(String[] args) {
        //StringJoiner 间隔符， 起始符号， 截止符号
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        //添加内容
        sj.add("1");
        sj.add("2");
        sj.add("3");
        sj.add("4");

        //打印
        System.out.println(sj);

        //转为字符串
        sj.toString();
    }
}
