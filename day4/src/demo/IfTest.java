package demo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class IfTest {
    //包名：互联网上域名反向写法.项目名.模块名
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = scanner.nextInt();
        boolean b = i % 2 == 0;
        if (b) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
}
