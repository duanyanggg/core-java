package com.yang.porlymorphism.a02porlymorphism2;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("老王", 30);
        Animal a  = new Dog(2,"黑");
        p1.keepPet(a, "骨头");
    }
}
