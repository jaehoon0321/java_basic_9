package javabasic_01.day03_JUNGOL;

import java.util.Scanner;

public class 연산자_연습문제2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        int[] output = new int[5];

        System.out.print("5개의 수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            input[i] = sc.nextInt();
        }

        output[0] = input[0] + 3;
        output[1] = input[1] - 3;
        output[2] = input[2] * 3;
        output[3] = input[3] / 3;
        output[4] = input[4] % 3;


        for (int i = 0; i < 5; i++) {
            System.out.print(output[i]);
            if (i < 4) System.out.print(" ");
        }
    }
}
