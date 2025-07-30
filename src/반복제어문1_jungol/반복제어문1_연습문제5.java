package 반복제어문1_jungol;

import java.util.Scanner;
//Q.정수를 계속 입력 받다가 0이 입력되면 입력된 수중 홀수의 합과 평균을 출력하는 프로그램을 작성하시오. (정수 미만은 버림)
public class 반복제어문1_연습문제5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int num = scanner.nextInt();

            if (num == 0) break;

            if (num % 2 != 0) {
                sum += num;
                count++;
            }
        }
        if (count > 0) {
            int average = sum / count;
            System.out.println("홀수의 합 = " + sum);
            System.out.println("홀수의 평균 = " + average);
        } else {
            System.out.println("홀수가 없습니다.");
        }

    }
}
