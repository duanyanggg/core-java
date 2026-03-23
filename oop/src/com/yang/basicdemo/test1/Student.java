package com.yang.basicdemo.test1;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class Student {
    private String name;
    private int age;

    //没有构造方法，JVM自动给空参构造方法

    public void Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
