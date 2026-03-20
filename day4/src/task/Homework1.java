package task;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework1 {
    public static void main(String[] args) {
        //输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = scanner.nextInt();
        String r = " ";
        if (number % 3 == 0 && number % 5 == 0) {
            r = "乒乓";
        } else if (number % 3 == 0) {
            r = "乒";
        } else if (number % 5 == 0) {
            r = "乓";
        } else {
            r = Integer.toString(number);
        }
        System.out.println(r);
    }
}
