package task;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个操作数");
        double a = scanner.nextDouble();
        System.out.println("请输入第二个操作数");
        double b = scanner.nextDouble();
        System.out.println("请输入符号数");
        char c = scanner.next().charAt(0);
        double ans;
        switch (c) {
            case '+':
                ans = a + b;
                break;
            case '-':
                ans = a - b;
                break;
            case '*':
                ans = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("无法进行该操作");
                    return;
                } else {
                    ans = a / b;
                }
                break;
            default:
                System.out.println("输入错误");
                return;
        }
        if (ans % 1 == 0) {
            System.out.println(a + " " + c + " " + b +
                    " " + "=" + " " + (int)ans);
            return;
        } else {
            System.out.println(a + " " + c + " " + b +
                    " " + "=" + " " + (int)ans);
        }
    }
}
