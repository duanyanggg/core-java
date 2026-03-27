package com.yang.a01staticdemo1;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/26
 */
public class Student {
    private String name;
    private int age;
    private String gender;

    //静态变量，可以用类名或对象名调用，每个对象都拥有并且相同
    //属于类
    //在静态区，随着类的加载而加载
    public static String teacherName;

    public Student() {
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //行为
    public void learn() {
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + "," + age + "," + gender + "," + teacherName);
    }
}
