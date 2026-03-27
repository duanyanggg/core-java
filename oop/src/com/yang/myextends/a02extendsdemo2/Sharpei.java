package com.yang.myextends.a02extendsdemo2;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class Sharpei extends Dog{

    @Override
    public void eat() {
        super.eat();
        System.out.println("狗在吃骨头");
    }
}
