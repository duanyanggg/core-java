package com.yang.stringdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/24
 */

//替换敏感词
public class StringDemo12 {
    public static void main(String[] args) {
        String str = "哈哈哈，TMD";

        //创建敏感词库
        String[] arr = {"SB", "CMD", "SB", "TMD"};

        //用replace（目标， 替换后显示词） 替换敏感词
        for (int i = 0; i < arr.length; i++) {
            str = str.replace(arr[i], "***");
        }
        System.out.println(str);
    }
}
