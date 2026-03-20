package demo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class If_Nested_Demo {
    public static void main(String[] args) {
        //if_else_if只判断一次，不穿透
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数");
        int temp;
        int min = scanner.nextInt();
        int middle = scanner.nextInt();
        int max = scanner.nextInt();
        if (min >= middle) {
            temp = middle;
            middle = min;
            min = temp;
        }
        if (max < min) {
            temp = min;
            min = max;
            max = middle;
            middle = temp;
        } else if (max < middle) {
            temp = middle;
            middle = max;
            max = temp;
        } else {

        }
        System.out.println("从小到大"+ min + middle + max);
    }
}
