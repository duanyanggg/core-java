package com.yang.abstruct.abstructdemo02;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog("aa",17);
        a.eat();
        a.drink();
        Dog d = (Dog)a;
        d.swim();
    }
}
