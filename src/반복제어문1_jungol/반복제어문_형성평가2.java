package 반복제어문1_jungol;

import java.util.Scanner;

public class 반복제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aCount = 0;
        int bCount = 0;

        while (true) {
            int num = sc.nextInt(); //사용자에게  입력 받음

            if (num == 0) break;

            if (num % 2 == 0) {
                bCount++;
            } else {
                aCount++;
            }
        }

        System.out.println("odd : " + aCount);
        System.out.println("even : " + bCount);

        sc.close();
    }
}

//0 이상의 정수들이 공백으로 구분되어 반복적으로 주어진다.
//
//0이 입력되면 반복문을 멈추고 그 전까지 입력받은 수들에 대하여
//
//홀수의 개수와 짝수의 개수를 출력하는 프로그램을 작성하시오.