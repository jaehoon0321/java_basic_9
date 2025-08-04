package jungol.반복제어문1_jungol;

import java.util.Scanner;

public class 반복제어문_연습문제4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;//개수 = count
        int sum = 0;//합계 = sum

        while (true) {
            System.out.print("정수를 입력하세요: ");
            int input = scanner.nextInt();

            if (input == 0) {
                break;
            }

            count++;
            sum += input;
        }
        double average = (double) sum / count;
        System.out.printf("입력된 자료의 개수 = %d\n", count);
        System.out.printf("입력된 자료의 합계 = %d\n", sum);
        System.out.printf("입력된 자료의 평균 = %.2f\n", average);

        scanner.close();
    }
}
//정수를 계속 입력을 받다가 0이 입력되면 0을 제외하고 이전에 입력된 자료의 수와 합계,
// 평균을 출력하는 프로그램을 작성하시오. (
// 평균은 반올림하여 소수 둘째자리까지 출력한다.)