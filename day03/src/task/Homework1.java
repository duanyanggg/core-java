package task;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */

public class Homework1 {
    public static void  main(String[] args){
        final int length = 3;

        System.out.println("请输入" + length + "个数");
        Scanner scnanner = new Scanner(System.in);
        int min = scnanner.nextInt();

        for(int i = 1; i < length; i++){
            int temp = scnanner.nextInt();
            if (temp < min){
                min = temp;
            }
        }

        System.out.println("最小的数是 " + min);
    }
}
