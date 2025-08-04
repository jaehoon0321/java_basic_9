package jungol.문자열1_jungol;

import java.util.Scanner;
//문자열 변경이 빈번하지 않는다면 String 사용을 고려
//문자열이 빈번하게 변경되면서 멀티쓰레드 환경이라면 StringBuffer 사용을 고려
//문자열이 빈번하게 변경되면서 멀티쓰레드 환경이 아니라면 StringBuilder 사용을 고려

//멀티쓰레드가 뭘 까? ->단일 프로세스 내에서 둘 이상의 실행 흐름(Thread)을 병렬로 실행하는 기술
public class 문자열1_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// 스캐너로 사용자에게 입력을 받고
         StringBuilder result = new StringBuilder();

        while (true) {
            String input = sc.nextLine();  // 한 줄 입력받기
            if (input.equals("")) {//equals 비교 함수
                break;  // 빈 줄이면 입력 종료
            }
            result.append(input);  // 입력된 문자열 누적
        }

        System.out.println(result.toString());  // 누적된 문자열 출력
    }
}
