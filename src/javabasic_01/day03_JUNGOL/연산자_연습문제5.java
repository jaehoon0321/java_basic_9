package javabasic_01.day03_JUNGOL;

import java.util.Scanner;

public class 연산자_연습문제5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        System.out.println((a == b) ? 1 : 0);
        System.out.println((b == c) ? 1 : 0);


        System.out.println((a != b) ? 1 : 0);
        System.out.println((b != c) ? 1 : 0);
    }
}
