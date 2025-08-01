package javabasic_02.test;

import java.util.Scanner;

public class JavaBasic8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 사용자 입력을 받기 위한 Scanner 객체 생성
        boolean run = true;     // 프로그램 실행 여부 제어 변수
        int balance = 0;        // 잔고를 저장할 변수

        while (run) {
            System.out.println("----------------------------- ");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------");
            System.out.print("선택> ");

            String input = scanner.nextLine();   // 사용자 입력을 문자열로 받음
            int choice;

            try {
                choice = Integer.parseInt(input);  // 문자열을 정수로 변환
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
                continue;  // 입력이 잘못되었으면 다시 반복
            }

            switch (choice) {
                case 1: //예금액 구문
                    System.out.print("예금액");
                    int money = Integer.parseInt(scanner.nextLine());
                    balance += money;
                    break;

                case 2: //출금액 구문
                    System.out.print("출금액");
                    int withdraw = Integer.parseInt(scanner.nextLine());
                    if (withdraw > balance) {
                        System.out.println("잔고가 부족합니다.");
                    } else {
                        balance -= withdraw;
                    }
                    break;

                case 3: // 잔고
                    System.out.println("잔고> " + balance);
                    break;

                case 4: // 종료
                    run = false;
                    System.out.println("프로그램 종료");
                    break;

                default:
                    System.out.println("1~4 사이의 숫자를 입력하세요.");
            }
        }
    }
}
