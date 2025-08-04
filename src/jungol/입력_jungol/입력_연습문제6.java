package jungol.입력_jungol;

import java.util.Scanner;//java 에서 입력을 받을때 사용하는 도구 Scanner

public class 입력_연습문제6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//System.in ->표준입력 키보드 ,입력을 받을 수 있다.

        System.out.println("당신의 나이는 몇 살입니까?");
        int age = scanner.nextInt();//age에 변수를 저장 ex)11을 입력시 age=11

        System.out.println("당신의 나이는 " + age + "살이군요.");
    }
}
