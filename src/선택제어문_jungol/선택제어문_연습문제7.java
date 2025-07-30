package 선택제어문_jungol;

import java.util.Scanner;

public class 선택제어문_연습문제7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("세 수를 입력하세요 ");

        int number = in.nextInt();

        System.out.println("1. 삽입");
        System.out.println("2. 수정");
        System.out.println("3. 삭제");
        System.out.println("숫자를 선택하세요 ");
        number = in.nextInt();

        if(number ==1) System.out.println("삽입을 선택하셨습니다.");
        else if(number ==2) System.out.println("수정을 선택하셨습니다");
        else if(number ==2) System.out.println("삭제를 선택하셨습니다");
        else System.out.println("1,2,3");


    }
}
