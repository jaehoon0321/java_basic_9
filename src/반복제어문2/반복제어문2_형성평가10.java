package 반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {
        // Scanner 객체 생성 Scanner in = new Scanner(System.in)
        Scanner in = new Scanner(System.in);

        // 사용자로부터 두 개의 정수 입력 받기 (2 ~ 9 사이의 수)
        int number1 = in.nextInt();
        int number2 = in.nextInt();


        if (number1 >= number2) {// 입력된 첫 번째 수가 두 번째 수보다 큰 경우 (감소하는 순서로 구구단 출력)
            // 곱하는 수 i는 1부터 9까지 (
            for (int i = 1; i <= 9; i++) {//세로 방향
                // j는 number1부터 number2까지 감소하면서 반복 (가로 방향)
                for (int j = number1; j >= number2; j--) {
                    // 각 단 * i를 포맷에 맞춰 출력하고, 단 사이에는 공백 3칸
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                // 하나의 행 출력 후 줄바꿈
                System.out.println();
            }
        }
        // 입력된 첫 번째 수가 두 번째 수보다 작은 경우 (오름차순으로 구구단 출력)
        else {
            for (int i = 1; i <= 9; i++) {
                for (int j = number1; j <= number2; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println();
            }
        }

   }
}
