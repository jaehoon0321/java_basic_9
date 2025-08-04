package jungol.반복제어문1_jungol;

import java.util.Scanner;

public class 반복제어문1_연습문제3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("점수를 입력하세요. ");
            int score = scanner.nextInt();

            // 0 ~ 100 점 사이의 점수가 아닌 경우 반복문 종료
            if (score < 0 || score > 100) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // 80점 이상이면 합격, 그렇지 않으면 불합격 출력
            if (score >= 80) {
                System.out.println("축하합니다. 합격입니다.");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }

        scanner.close();
    }
}

/*점수를 입력받아 80점 이상이면 합격메시지를 그렇지 않으면 불합격 메시지를 출력하는 작업을 반복하다가
0~100점 이외의 점수가 입력되면 종료하는 프로그램을 작성하시오.

 */

/*점수를 입력하세요. 50
죄송합니다. 불합격입니다.
점수를 입력하세요. 95
축하합니다. 합격입니다.
점수를 입력하세요. 101*/