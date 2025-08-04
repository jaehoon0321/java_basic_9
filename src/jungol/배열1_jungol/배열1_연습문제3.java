package jungol.배열1_jungol;

//Q. 정수 10개를 입력받은 후 세번째 , 다섯 번째와 마지막으로 입력받은 정수를 차례로 출력하는 프로그램을 작성하시오

import java.util.Scanner; //입력을 받기 위해 Scanner 클래스를 import해주고

public class 배열1_연습문제3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체 생성을 해주고

        int[] num = new int[10]; // int(정수)num에  새로운 10개를 저장할 배열 생성

        for (int i = 0; i < 10; i++) {
            num[i] = sc.nextInt(); // 사용자로부터 num에 i값 정수를 입력받아 배열에 저장해주고
        }

        System.out.print(num[2] + " ");//세번째
        System.out.print(num[4] + " ");// 다섯 번째
        System.out.print(num[9]);//마지막


    }
}
