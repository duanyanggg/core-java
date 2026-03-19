package task;

import java.util.Scanner;

public class Homework2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double newNum =(int) (num * 100);
        newNum /= 100;
        System.out.println(newNum);
    }
}
