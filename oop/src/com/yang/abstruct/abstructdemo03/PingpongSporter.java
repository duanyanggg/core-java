package com.yang.abstruct.abstructdemo03;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/27
 */
public class PingpongSporter extends Athlete implements English{

    public PingpongSporter() {
    }

    public PingpongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员学英语");

    }
}
