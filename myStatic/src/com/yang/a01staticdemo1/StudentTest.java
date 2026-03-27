package com.yang.a01staticdemo1;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/26
 */
public class StudentTest {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("yang");
        stu1.setAge(18);
        stu1.setGender("女");
        Student.teacherName = "self";
        stu1.show();

        Student stu2 = new Student();
        stu2.setName("mie");
        stu2.setAge(19);
        stu2.setGender("女");

        stu2.learn();
        stu2.show();
    }
}
