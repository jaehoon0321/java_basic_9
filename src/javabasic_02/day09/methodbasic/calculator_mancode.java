package javabasic_02.day09.methodbasic;

import java.util.Scanner;

public class calculator_mancode {
    static Scanner sc = new Scanner(System.in);
    static boolean a = true;

    public static void main(String[] args) {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");

        while (a) {
            System.out.print("\n첫 번째 수 입력: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 수 입력: ");
            int num2 = sc.nextInt();

            System.out.print("메뉴 번호 입력: ");
            int menuNum = sc.nextInt();

            // 종료 조건
            if (menuNum == 5) {
                System.out.println("프로그램을 종료합니다.");
                a = false;
                break;
            }

            menu(num1, num2, menuNum);
        }
    }

    public static void calculator(int num1, int num2, int menuNum) {
        int result = 0;
        double dResult = 0.0;

        switch (menuNum) {
            case 1:
                result = num1 + num2;
                menu2(num1, num2, menuNum, result);
                break;
            case 2:
                result = num1 - num2;
                menu2(num1, num2, menuNum, result);
                break;
            case 3:
                result = num1 * num2;
                menu2(num1, num2, menuNum, result);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                } else {
                    dResult = (double) num1 / num2;
                    menu2(num1, num2, menuNum, dResult);
                }
                break;
            default:
                System.out.println("메뉴 번호는 1~5 사이로 입력해주세요.");
        }
    }

    public static void menu(int num1, int num2, int menuNum) {
        System.out.println("======================================================");
        System.out.println("                     사칙 연산 계산기                    ");
        System.out.println("======================================================");
        System.out.println("1. 덧셈   2. 뺄셈    3. 곱셈    4. 나눗셈   5. 프로그램 종료");

        calculator(num1, num2, menuNum);
    }

    // 정수 연산 출력용 오버로드
    public static void menu2(int num1, int num2, int menuNum, int result) {
        switch (menuNum) {
            case 1:
                System.out.printf("%d + %d = %d\n", num1, num2, result);
                break;
            case 2:
                System.out.printf("%d - %d = %d\n", num1, num2, result);
                break;
            case 3:
                System.out.printf("%d * %d = %d\n", num1, num2, result);
                break;
        }
    }

    // 실수 나눗셈 출력용 오버로드
    public static void menu2(int num1, int num2, int menuNum, double result) {
        if (menuNum == 4) {
            System.out.printf("%d / %d = %.1f\n", num1, num2, result);
        }
    }
}
