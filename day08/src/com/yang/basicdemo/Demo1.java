package com.yang.basicdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class Demo1 {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.second = 59;
        clock.minute = 10;
        clock.setHour(11);
        clock.showTime();
    }
}

// 一个文件只能有一个 public 类，且必须和文件名相同

