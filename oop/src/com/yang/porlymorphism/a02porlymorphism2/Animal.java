package com.yang.porlymorphism.a02porlymorphism2;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
/*属性：
年龄，颜色
行为:
eat(String something)(something表示吃的东西)*/
public class Animal {
    private int age;
    private String color;
    //吃东西
    public void eat (String something){
        System.out.println("eat");
    }

    public Animal() {
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
