package com.yang.myextends.a03extendsdemo3;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Employee {
    private String id;
    private String name;
    private double salary;
    public void work() {};
    public void eat() {
        System.out.println(name + "正在吃米饭");
    }

    public Employee() {
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
