package 입력;

import java.util.Scanner;

public class 입력_연습문제7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//동일한 개념 사용자가 키보드에 입력을 받을 수 있음

        System.out.println("두 수를 입력하시오.");
        int a = scanner.nextInt();//nextInt()는 메서드이고 반환 타입을 Int 로 설정한것임  다음 토큰을  int 타입으로 변환한다.
        int b = scanner.nextInt();//""

        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " * " + b + " = " + (a * b));
    }
}

 //System.in -> 사용자로부터 입력을 받기 위한 입력 스트림
//Scanner 뿐만 아니라 다른 입력 방식들도 사용자로부터 입력을 받기 위해서는 System.in도 사용 됨.

