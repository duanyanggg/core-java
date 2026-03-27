package com.yang.myextends.a03extendsdemo3;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理他人");
    }
}
