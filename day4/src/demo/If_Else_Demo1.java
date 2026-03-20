package demo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */

/*猜硬币游戏*/
public class If_Else_Demo1 {
    public static void main(String[] args) {
        //获取随机数
        double d = Math.random();//0-1之间一位随机小数
        int x = (int)(d * 2);

        System.out.println("欢迎来到猜硬币游戏");
        System.out.println("请猜正反面 0 正面 1 反面");
        Scanner scanner  = new Scanner(System.in);
        int u = scanner.nextInt();
        if (u == x) {
            System.out.println("猜对了");
        } else {
            System.out.println("猜错了");
        }
    }
}
