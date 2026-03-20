package demo;

import java.util.Scanner;

/**
 * @auther yang
 * @project IntelliJ IDEA
 * @date 2026/3/20
 */
public class Swich_Demo {
    //不break找到对应选择后会执行后面所有语句
    public static void main(String[] args) {
        System.out.println("请输入你的出生月份");
        Scanner scanner  = new Scanner(System.in);
        int month = scanner.nextInt();
        switch (month){
            case 12:
            case 1:
            case 2:
                System.out.println("出生在冬天。");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("In spring.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("In autumn.");
            case 9:
            case 10:
            case 11:
                System.out.println("In winter.");
            default:
                System.out.println("非法输入");
        }
    }
}
