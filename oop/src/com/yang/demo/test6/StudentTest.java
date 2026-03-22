package com.yang.demo.test6;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        Student st1 = new Student(1, "yang", 12);
        Student st2 = new Student(2, "ming", 14);
        Student st3 = new Student(3, "sen", 17);
        students[0] = st1;
        students[1] = st2;
        students[2] = st3;
    }
}
