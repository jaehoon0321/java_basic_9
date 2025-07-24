package 입력;

import java.util.Scanner;

public class 입력_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 개의 실수를 입력하세요.");
        double x = sc.nextDouble(); //double을 통해 실수를 x에 저장
        double y = sc.nextDouble();


        System.out.printf("x = %.2f\n", x);//%.2f는 소수 둘째 자리까지 출력하는 형식 지정자
        System.out.printf("y = %.2f\n", y);

        sc.close();
    }
}
