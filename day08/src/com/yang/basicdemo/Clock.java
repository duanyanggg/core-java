package com.yang.basicdemo;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/21
 */
public class Clock {
    private int hour;
    int minute;
    int second;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void showTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}
