package com.yang.porlymorphism.a01porlymorphism1;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Administrator extends Person{
    @Override
    public void show() {
        System.out.println("管理员的信息为: " + getName() + "," +  getAge());
    }
}
