package javabasic_01.day03_JUNGOL;

import java.util.Scanner;

public class 연산자_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int korea = sc.nextInt();
        int english = sc.nextInt();
        int math = sc.nextInt();
        int computer = sc.nextInt();

        int sum = korea + english + math + computer;
        int avg = sum / 4;

        System.out.println("sum " + sum);
        System.out.println("avg " + avg);

        sc.close();
    }
}
