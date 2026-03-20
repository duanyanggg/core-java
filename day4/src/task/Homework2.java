package task;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩");
        int a =scanner.nextInt();
        if (a > 100 || a < 0) {
            System.out.println("输入错误。");
            return;
        }
        int x = a / 10;
        String r = " ";
        switch (x) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                r = "E";
                break;
            case 6:
                r = "D";
                break;
            case 7:
                r = "C";
                break;
            case 8:
                r = "B";
                break;
            case 9:
            case 10:
                r = "A";
                break;
            default:
                r = "输入错误。";
        }
        System.out.println(r);
    }
}
