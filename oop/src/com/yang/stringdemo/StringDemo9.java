package com.yang.stringdemo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/23
 */
public class StringDemo9 {
    public static void main(String[] args) {
        int money;
        while (true) {
            //输入金额
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if (money < 9999999 && money > 0) {
                break;
            } else {
                System.out.println("金额输入无效");
            }
        }
        String str = "";
        int count = 0;
        while (true) {
            int tmp = money % 10;
            if (tmp == 0) {
                if (count == 0) {
                    str += getWei(count);
                }
                str += getCapitalNumber(tmp);
            } else {
                str += (getWei(count) + getCapitalNumber(tmp));
            }
            money /= 10;
            count ++;
            if (money == 0) {
                break;
            }
        }
        str = reverseStr(str);
        str = str.replaceAll("零+", "零");
        System.out.println(str);;
    }

    //将数字转换为大写中文
    public static String getCapitalNumber(int number) {
        String[] change = {"零", "一", "二", "三", "四", "五", "六", "七", "八", "九"};
        String str = change[number];
        return str;
    }

    public static String getWei(int count) {
        String[] wei= {"元", "十", "百", "千", "万", "十", "百", "千", "亿"};
        return wei[count];
    }
    public static String reverseStr(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        return reversedStr;
    }
}
