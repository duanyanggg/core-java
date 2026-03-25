package com.yang.stringdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */
//身份证信息查询
public class StringDemo11 {
    public static void main(String[] args) {
        //定义字符串
        String str = "2201092009111181234";
        String year = str.substring(6,10);
        String month = str.substring(10,12);
        String day = str.substring(12,14);
        char gender = str.charAt(16);
        String gen;
        if ((gender - '0') % 2 == 0) {
            gen = "男";
        } else {
            gen = "女";
        }
        System.out.println("人物信息为：");
        System.out.println("出生年月日：" + year + "年" + month + "月" +day + "日");
        System.out.println("性别为：" + gen);
    }
}
