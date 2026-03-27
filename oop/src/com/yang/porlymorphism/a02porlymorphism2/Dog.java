package com.yang.porlymorphism.a02porlymorphism2;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
//2岁的黑颜色的狗两只前腿死死的抱住骨头猛吃
public class Dog extends Animal {
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗两只前腿死死的抱住"
                + something + "猛吃");
    }
}
