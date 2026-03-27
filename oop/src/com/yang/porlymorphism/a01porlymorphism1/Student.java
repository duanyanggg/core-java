package com.yang.porlymorphism.a01porlymorphism1;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Student extends Person{

    @Override
    public void show() {
        System.out.println("学生的信息为: " + getName() + "," +  getAge());
    }
}
