package com.yang.stringdemo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */

//用户登录
public class StringDemo4 {
    public static void main(String[] args) {

        //1.定义正确用户名密码
        String rightUserName = "yang";
        String rightPassword = "123456";
        int chance = 3;
        //2.模拟用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= chance; i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入用户密码");
            String password = sc.next();

            if (userName.equals(rightUserName) && password.equals(rightPassword)) {
                System.out.println("登陆成功，欢迎");
                break;
            } else {
                if (i == chance) {
                    System.out.println("登陆失败");
                } else {
                    System.out.printf("用户名或密码错误，还有%d次机会，请重试", chance - i );
                }
            }
        }
    }
}
