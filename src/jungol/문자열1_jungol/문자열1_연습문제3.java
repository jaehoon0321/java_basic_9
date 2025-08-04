package jungol.문자열1_jungol;

//문자열을 선언하고 "jungol olympiad"로 초기화 한 후 0~14 사이의 정수 5개를 입력 받아
// 문자열에서 해당하는 위치의 문자를 차례로 출력하는 프로그램을 작성하시오. 문자열의 맨 앞의 위치는 0이다.



import java.util.Scanner;

public class 문자열1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "jungol olympiad";
        char[] result = new char[5];


        for (int i = 0; i < 5; i++) {
            int index = sc.nextInt();  // 인덱스 입력 받기
            result[i] = name.charAt(index);  // 해당 문자 추출
        }

        for (char a : result) {
            System.out.print(a);

        }
    }
}
