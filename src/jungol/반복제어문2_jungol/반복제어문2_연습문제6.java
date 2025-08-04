package jungol.반복제어문2_jungol;

import java.util.Scanner;
//5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 첫째자리까지 출력한다.)
public class 반복제어문2_연습문제6 {
    public static void main(String[] args) {
        Scanner sccanner = new Scanner(System.in);
        int sum = 0;//정수형 0으로 정의

        System.out.println("5명의 성적을 입력하세요:");

        for (int i = 0; i < 5; i++) {//i= 0,1,2,3,4
            int score = sccanner.nextInt();
            sum += score;
        }
        double avg = sum / 5.0;//double은 Java에서 소수를 저장할 수 있는 자료형

        System.out.println("총점 : " + sum);
        System.out.printf("평균 : %.1f", avg);  // 소수 첫째 자리까지 출력 (자동 반올림)
    }
}
