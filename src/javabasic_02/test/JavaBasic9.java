package javabasic_02.test;

import java.util.Scanner;

/*
9. 학생들의 점수를 분석하는 프로그램을 작성하시오. 클래스명: JavaBasic8
키보드로 부터 학생 수와 각 학생들의 점수를 입력받고
While문과 Scanner의 nextLine()메소드를 이용하여 최고 점수와 평균 점수를 출력
*/
public class JavaBasic9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 입력 도구 Scanner 객체 생성

        int studentNum = 0;      // 학생 수 저장 변수
        int[] scores = null;     // 학생 점수 배열 선언 (초기엔 null)
        boolean run = true;      // 프로그램 실행 상태 제어 변수

        // 메뉴를 반복해서 보여주기 위한 while문
        while (run) {
            System.out.println("--------------------------------------------------");
            System.out.println("|1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료|");
            System.out.println("--------------------------------------------------");
            System.out.print("선택> ");

            // nextLine()으로 한 줄 입력 받고 정수로 변환 (버퍼 문제 방지)
            int i = Integer.parseInt(scanner.nextLine());

            if (i == 1) {
                // 1. 학생수 입력
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine());  // 학생 수 입력 받고 저장
                scores = new int[studentNum];  // 학생 수 만큼 배열 생성

            } else if (i == 2) {
                // 2. 점수입력
                if (scores == null) {
                    // 학생 수가 입력되지 않은 상태면 안내문 출력 후 메뉴로 돌아감
                    System.out.println("먼저 학생 수를 입력하세요.");
                    continue;  // 반복문의 처음으로 돌아감
                }
                // 학생 수 만큼 점수 입력 받기
                for (int idx = 0; idx < scores.length; idx++) {
                    System.out.print("scores[" + idx + "]> ");
                    scores[idx] = Integer.parseInt(scanner.nextLine());  // 점수 저장
                }

            } else if (i == 3) {
                // 3. 점수리스트 출력
                if (scores == null) {
                    System.out.println("점수가 없습니다.");
                    continue;
                }
                // 배열에 저장된 점수를 모두 출력
                for (int idx = 0; idx < scores.length; idx++) {
                    System.out.println("scores[" + idx + "]: " + scores[idx]);
                }

            } else if (i == 4) {
                // 4. 분석 (최고 점수와 평균 점수 계산 및 출력)
                if (scores == null) {
                    System.out.println("점수가 없습니다.");
                    continue;
                }
                int max = scores[0];
                int sum = 0;
                for (int s : scores) {
                    if (s > max) max = s;  // 최고 점수 갱신
                    sum += s;              // 점수 합산
                }
                System.out.println("최고 점수: " + max);
                System.out.printf("평균 점수: %.1f\n", (double) sum / scores.length);  // 평균 출력

            } else if (i == 5) {

                System.out.println("프로그램 종료");
                run = false;

            } else {
                // 1~5 이외의 숫자 입력시 안내 메시지 출력
                System.out.println("1~5 중에서 선택하세요.");
            }
        }
    }
}

