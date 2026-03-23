package com.yang.basicdemo.test6;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class StudentTest {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        Student stu1 = new Student(1, "yang", 12);
        Student stu2 = new Student(2, "ming", 14);
        Student stu3 = new Student(3, "sen", 17);
        students[0] = stu1;
        students[1] = stu2;
        students[2] = stu3;
        Student stu4 = new Student(4, "dd", 19);
        students = Student.add(stu4, students);
        Student.printInfo(students);
        Student.delete(students, 3);
        Student.printInfo(students);
        Student.addAge(students, 2);
        Student.printInfo(students);
    }
}
