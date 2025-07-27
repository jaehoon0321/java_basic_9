package day03_JUNGOL;

import java.util.Scanner;

public class 연산자_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 개의 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
    }
}
