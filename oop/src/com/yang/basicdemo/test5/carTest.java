package com.yang.basicdemo.test5;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/22
 */
public class carTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[3];

        //创建汽车对象，数据来自键盘输入
        for (int i = 0; i < 3; i++) {
            //创建汽车对象
            Car c = new Car();
            //录入品牌
            System.out.println("请输入汽车品牌：");
            c.setBrand(scanner.next());
            //录入价格
            System.out.println("请输入汽车价格");
            c.setPrice(scanner.nextDouble());
            //录入颜色
            System.out.println("请输入汽车颜色");
            c.setColor(scanner.next());
            cars[i] = c;
        }
    }
}
