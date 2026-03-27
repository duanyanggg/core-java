package com.yang.abstruct.abstructdemo03;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public abstract class Coach extends People{
    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }

    public abstract void teach();
}
