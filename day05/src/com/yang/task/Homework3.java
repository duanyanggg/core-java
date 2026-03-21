package com.yang.task;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework3 {
    public static void main(String[] args) {
      final int HEAD = 50;
      final int FOOT = 120;
      int i;
      for(i = 0; i <= HEAD; i++){
         if (i * 4 + (HEAD - i) * 2 == FOOT) {
             break;
         }
      }
        System.out.println("有兔" + i + "只，" + "有鸡" + (HEAD - i) + "只");
    }
}
