package jungol.문자열1_jungol;

import java.util.Scanner;

public class 문자열1_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//문자를 입력 받아야 하니까 Scanner을 사용해준다

        while (true) {//while반복문
            String input = sc.nextLine(); // 한 줄 입력
            char ch = input.charAt(0);    // 첫 번째 문자만 사용
            //charAt은 String으로 저장된 문자열 중에 한 글자만 선택해서  char타입으로 변환
            System.out.println(ch + " -> " + (int) ch);//입력받은 결과값 -> 정수형 ch

            if (ch == '0') {
                break; // 종료 조건
            }
        }

    }
}
