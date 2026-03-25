package com.yang.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
public class ArrayListTest4 {
    public static void main(String[] args) {

        ArrayList<User> list = new ArrayList<>();

        User u1 = new User("mi", "yang001", "12445");
        User u2 = new User("miao", "yang002", "124d5");
        User u3 = new User("mie", "yang003", "12475");

        list.add(u1);
        list.add(u2);
        list.add(u3);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入ID");
        String id = sc.next();
        int i = search(id, list);
        if (i == -1) {
            System.out.println("用户不存在");
        } else {
            System.out.println("用户索引为" + i + ", 存在");
        }
    }

    public static int search(String id, ArrayList<User> list) {
        int result = -1;
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getId().equals(id)) {
                result = i;
            }
        }
        return result;
    }
}
