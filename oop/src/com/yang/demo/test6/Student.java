package com.yang.demo.test6;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class Student {
    public int number = 3;
    private int id;
    private String name;

    private int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
    public static boolean contain(Student[] students, int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == id) {
                return true;
            }
        }
        return false;
    }
    public static boolean isFull(int length) {
        if(length = number)
    }

    public static void add(Student stu, Student[] students) {
        if(stu.contain(students, stu.getId())) {
            System.out.println("学生ID已经存在， 请勿重新输入");
        }
    }
}
