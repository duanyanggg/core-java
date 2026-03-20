package demo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class If_ElseIf_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你出生的月份");
        int month = scanner.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("冬天");
        } else if (month > 2 && month < 6) {
            System.out.println("春天");
        } else if (month > 5 && month < 9) {
            System.out.println("秋天");
        } else if (month > 8 && month < 12) {
            System.out.println("冬天");
        } else {
            System.out.println("输入错误");
        }
    }
}
