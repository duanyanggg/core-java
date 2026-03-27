package com.yang.a04staticdemo4;

import com.yang.a02staticdemo3.StudentUtil;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/26
 */

//静态方法中没有this关键字
//静态方法中只能访问静态
//非静态方法可以访问所有
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "yang";
        s1.age = 10;
        s1.show();

        Student s2 = new Student();
        s2.name = "mie";
        s2.age = 13;
        s2.show();
    }
}
