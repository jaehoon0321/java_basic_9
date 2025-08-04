package jungol.assignment;

//Q.정수를 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
// 그 때까지 입력된 정수의 일의 자리 숫자가 각각 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오.
// (0개인 숫자는 출력하지 않는다.)
import java.util.Scanner;

public class 배열2_연습문제2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] count = new int[10]; // 0~9까지 정수형으로 출력해주고

        while (true) {//while 반복문을 실행
            int num = in.nextInt();  //사용자에게 정수를 입력받고
            if (num == 0) {//만약 num값이 0이면 종료
                break; // while반복문 종료
            }

            int lastDigit = num % 10; // 사용자가 입력된 값에 일의 자리 값의 나머지를 추출  , % 나머지 연산자
            count[lastDigit]++; //0~9까지일의 자리 숫자 나온 값들을 카운팅 함
        }
        // 결과 출력문
        for (int i = 0; i <= 9; i++) {//i= 0~9까지 계속 반복하고 한번 반복할때마다 1씩 증가
            if (count[i] > 0) { //만약  count값이 0 보다 작다면 출력하지 않음 // 1부터 9까지만 출력
                System.out.println(i + " : " + count[i] + "개");
            }
        }
    }
}