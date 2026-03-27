package com.yang.porlymorphism.a02porlymorphism2;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
/*属性：
*姓名，年龄
 *行为：
keepPet(Animal animal, String something)方法
 *功能：喂养宠物狗，something表示喂养的东西*/
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal animal, String something) {
        //年龄为30岁的老王养了一只黑颜色的2岁的狗
        if (animal instanceof Dog d) {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + d.getColor() +
                    "的" +d.getAge() + "岁的狗");
            d.eat(something);
        } else if (animal instanceof Cat c) {
            System.out.println("年龄为" + age + "的" + name + "养了一只" + c.getColor() +
                    "的" +c.getAge() + "岁的狗");
            c.eat(something);
        } else {
            System.out.println("宠物定义错误");
            return;
        }

    }
}
