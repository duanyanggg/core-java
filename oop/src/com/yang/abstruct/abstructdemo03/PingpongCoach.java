package com.yang.abstruct.abstructdemo03;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class PingpongCoach extends Coach implements English{
    public PingpongCoach() {
    }

    public PingpongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");

    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练学英语");
    }
}
