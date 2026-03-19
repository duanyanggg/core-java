package task;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int temp = number;
        int reversedNum = 0;
        while(temp > 0){
            reversedNum = temp % 10 + reversedNum * 10;
            temp /= 10;
        }
        System.out.println(reversedNum);
    }
}