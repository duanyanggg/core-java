package com.yang.porlymorphism.a01porlymorphism1;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Test2 {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.show();
    }
}

class Animal {
    String name = "a";
    public void show() {
        System.out.println("a name" + this.name);
    }
}

class Dog extends Animal {
    String name = "d";

    @Override
    public void show() {
        System.out.println("d name" + name);
    }
}