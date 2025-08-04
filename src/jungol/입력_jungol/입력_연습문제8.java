package jungol.입력_jungol;

import java.util.Scanner;

public class 입력_연습문제8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("키를 입력하세요. ");
        int height = scanner.nextInt();//nextInt() 키를 입력 받음 Int로

        System.out.print("몸무게를 입력하세요. ");
        double weight = scanner.nextDouble(); //Double(실수)

        System.out.print("이름을 입력하세요. ");
        String name = scanner.next();  // 문자열 전체 입력

        // 출력
        System.out.println("키 = " + height);
        System.out.printf("몸무게 = %.1f\n", weight);  // 소수점 첫째 자리까지 반올림
        System.out.println("이름 = " + name.charAt(0)); // charat(0)이 문자열의 첫 글자 추출 CharAt(0)-> 0번째에 있는 문자 , 지정한 문자를 추출해주는 것임.
    }
}
