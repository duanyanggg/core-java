package com.yang.a04staticdemo4;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/26
 */
public class Student {
    String name;
    int age;
    String gender;
    static String teacherName;

    //虚拟机会把s1的地址值赋值给this;
    //this可以省略不写
    public void show(Student this) {
        System.out.println(this.name + "," + this.age + ","
                + this.gender + "," + teacherName);
        this.show1();
    }

    private void show1() {
        System.out.println("show1");
    }

    public static void method() {
        System.out.println("静态方法");
    }
}

