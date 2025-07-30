package javabasic_01.day03_JUNGOL;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minHeight = sc.nextInt();
        int minWeight = sc.nextInt();
        int kiyoungHeight = sc.nextInt();
        int kiyoungWeight = sc.nextInt();
        int result = (minHeight > kiyoungHeight && minWeight > kiyoungWeight) ? 1 : 0;
        System.out.println(result);

        sc.close();
    }
}
