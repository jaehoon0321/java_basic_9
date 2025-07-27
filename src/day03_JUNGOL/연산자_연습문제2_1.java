package day03_JUNGOL;

import java.util.Scanner;

public class 연산자_연습문제2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        int[] result = new int[5];

        System.out.print("5개의 수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }

        result[0] = num[0] + 3;
        result[1] = num[1] - 3;
        result[2] = num[2] * 3;
        result[3] = num[3] / 3;
        result[4] = num[4] % 3;

        for (int i = 0; i < 5; i++) {
            System.out.print(result[i]);
            if (i < 4) System.out.print(" ");
        }
    }
}
