package task;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Homework2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 0, y, z;

        do{
            System.out.println("请输入一个非零一位数:");
            x = scanner.nextInt();
            if(x > 0 && x < 10)
                break;
        } while(true);

        y = 9 * x;
        if(x > 9) {
            z = y / 10 + y % 10;
        } else {
            z = y;
        }
        z = z * 27 + 7;

        System.out.println("你的姓名是" + z);
    }

}
