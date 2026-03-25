package com.yang.test;

import java.util.ArrayList;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class ArrayListTest2 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        //添加元素
        //jdk5以后int, Integer可以互相转换
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //3.遍历
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");
    }

}
