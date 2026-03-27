package com.yang.a02staticdemo3;

import java.util.ArrayList;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/26
 */
public class TestDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("yang", 18, "女");
        Student stu2 = new Student("mie", 19, "女");
        list.add(stu1);
        list.add(stu2);
        System.out.println(StudentUtil.getMaxAge(list));
    }
}
