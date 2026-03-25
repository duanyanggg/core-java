package com.yang.stringBuilderDemo;

import java.sql.SQLOutput;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class CapacityAndLength {
    public static void main(String[] args) {
        // 最开始容量16
        StringBuilder sb = new StringBuilder("");
        //扩展 * 2 + 2
        sb.append("sssssssssssssssssssssssssss");
        //看容量
        System.out.println(sb.capacity());
        //看实际长度
        System.out.println(sb.length());
        //不够的话要加到实际长度
    }
}
