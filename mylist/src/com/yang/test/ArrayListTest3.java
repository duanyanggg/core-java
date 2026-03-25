package com.yang.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class ArrayListTest3 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> list = new ArrayList<>();

        //键盘录入信息并且添加到集合中
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Student stu = new Student();

            System.out.println("请输入学生的姓名");
            String name = sc.next();
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();

            stu.setName(name);
            stu.setAge(age);
            list.add(stu);
        }

        //遍历打印信息
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getName() + " " + stu.getAge());
        }
    }
}
