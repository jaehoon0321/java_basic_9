package 반복제어문2_jungol;

import java.util.Scanner;

public class 반복문제_연습문제5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//
        int Count = 0;

        System.out.println("10개의 정수를 입력하세요:");

        for (int i = 0; i < 10; i++) {//정수형 i 0으로 지정하고 i의 값은 10보다 작다 i++ 후치 증가
            int num = scanner.nextInt();  // 정수 하나 입력 받기
            if (num % 2 == 0) {      // 짝수 판별 //홀수일때는 if(num %2 ==1)이다
                Count++;         // 짝수일 경우 카운트 증가
            }
        }
        System.out.println("입력받은 짝수는 " + Count + "개입니다.");//입력 받을
    }
}
