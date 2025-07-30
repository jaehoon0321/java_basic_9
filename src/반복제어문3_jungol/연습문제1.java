package 반복제어문3_jungol;

import java.util.Scanner;

public class 연습문제1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // 사용자로부터 입력 받기
        int number = 0;        // 마지막으로 더한 수
        int total = 0;         // 누적합

        // 1부터 계속 더하면서 누적합이 n보다 커지면 종료
        for (int i = 1; ; i++) {
            total += i;
            if (total > n) {
                number = i;
                break;
            }
        }

        System.out.printf("%d$1ㅇ, %d", number, total);  // 마지막 수, 누적합 출력


    }
}
