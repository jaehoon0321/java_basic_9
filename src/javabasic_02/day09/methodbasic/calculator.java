package javabasic_02.day09.methodbasic;


import java.util.Scanner;

public class calculator {

    public static int adder(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("==========================================");
        System.out.println("               사칙연산 계산기              ");
        System.out.println("==========================================");
        System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 5.프로그램종료");
        System.out.println("두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해 주세요.");

        int choice = sc.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();


        System.out.println("결과는");

        switch (choice){
            case 1:
                System.out.println(a + " + " + b + " = " + adder(a,b));
                break;
            case 2:
                System.out.println(a + " - " + b + " = " + minus(a, b));
                break;
            case 3:
                System.out.println(a + " * " + b + " = " + multi(a, b));
                break;
            case 4:
                System.out.printf("%d / %d = ", a, b, div(a, b));
                break;


        }

    }
}
