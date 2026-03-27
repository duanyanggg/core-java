package com.yang.porlymorphism.a01porlymorphism1;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("yang");
        s.setAge(19);
        s.show();
        Teacher t = new Teacher();
        t.setName("te");
        t.setAge(22);
        t.show();
        Administrator a = new Administrator();
        a.setName("sha");
        a.setAge(30);
        a.show();
        register(a);
    }

    public static void register(Person p) {
        p.show();
    }
}
