package com.yang.abstruct.abstructdemo02;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public abstract class Animal {
    private String name;
    private int age;

    public void drink() {
        System.out.println("喝水");
    }

    public abstract void eat();

    public Animal() {
    }

    public Animal(String name, int age) {
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
