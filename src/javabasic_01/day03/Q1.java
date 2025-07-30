package javabasic_01.day03;//집가서 코드 리뷰 하기

import java.util.Scanner;


public class Q1 {
    public static void main(String[] args) {
        int price = 5000;
        System.out.printf("상품의 가격: %d원\n",price);
        System.out.printf("상품의 가격: %8d원\n",price);
        System.out.printf("상품의 가격: %08d원\n",price);


        System.out.println("반지름을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        System.out.printf("반지름이 %d인 원의 넓이: %.1f",rad,rad*rad*Math.PI);
    }
}
//printf문을 사용하여 하단있는 내용 콘솔 출력
/*상품의 가격 5000원, 상품의 가격 : vvv5000원 , 상품의 가격 0050000원)
* */