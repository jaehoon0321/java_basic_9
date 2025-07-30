package javabasic_01.조별_Project;

import java.util.Scanner;

public class Menu_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("연락처를 입력하세요: ");
        String phone = scanner.nextLine();//문자열 phone으로 지정하고 phone 입력한 모든 문자열을 받음

        int a;//메뉴 변수를 저장 a로 지정

        do {//do ~while문 반복,  사용자가 8 종료를 선택할까지 반복

            System.out.println("************************************************");//줄마다 띄어쓰기 해야 해서 printf 가 아닌 println
            System.out.println("     Welcome to Shopping Mall");
            System.out.println("     Welcome to Book Market!");
            System.out.println("************************************************");
            System.out.println("1. 고객 정보 확인하기     4. 바구니에 항목 추가하기");
            System.out.println("2. 장바구니 상품 목록 보기 5. 장바구니의 항목 수량 줄이기");
            System.out.println("3. 장바구니 비우기        6. 장바구니의 항목 삭제하기");
            System.out.println("7. 영수증 표시하기        8  종료  ");
            System.out.println("************************************************");
            System.out.printf("메뉴 번호를 선택해주세요: "); //메뉴를 설정해주고
            a = scanner.nextInt();//사용자가 정수 1~8 을 입력 받는다.

            System.out.println("*****************************************");

            //else if 문을 사용 2개 이상의 조건식을 사용할때 사용

            if (a == 1) {//만약 a==1 ,a의값이 1과 같다면
                System.out.println("현재 고객 정보:");
                System.out.println("이름: " + name + "   연락처: " + phone);
            } else if (a == 2) {
                System.out.println("장바구니 상품 목록 보기");
            } else if (a == 3) {
                System.out.println("장바구니 비우기");
            } else if (a == 4) {
                System.out.println("항목 추가하기");
            } else if (a == 5) {
                System.out.println("항목 수량 줄이기]");
            } else if (a == 6) {
                System.out.println("항목 삭제하기");
            } else if (a == 7) {
                System.out.println("영수증 표시하기");
            } else if (a == 8) {
                System.out.println("**************************************");
                System.out.println("     Welcome to Shopping Mall");
                System.out.println("     Welcome to Book Market!");
                System.out.println("**************************************");
                System.out.println("프로그램을 종료합니다.");
            } else {
                System.out.printf("1~8만 입력가능");
            }

            System.out.println();

            /*
            * if(조건식1){
            * 실행문1       ----> 조건식이 1이 true일때 실행
            * }else if(조건식2){
            * 실행문2;   --> 조건식이 1이 false이고 조건식 2가 true일때 실행
            * }else{
            * 실행문3;   -- > 조건식 1, 2가 false이면 실행문 3을 실행한다.
            * }
            * */

        }  while (a != 8);}//8이 아닐때까지->!  반복한다, =8이면 반복을 종료
    }










/*
* // 메뉴 선택에 따른 분기 처리
System.out.println("------------------------------------------------");

if (a == 1) {
    System.out.println("현재 고객 정보:");
    System.out.println("이름: " + name + "   연락처: " + phone);
} else if (a == 2) {
    System.out.println("장바구니 상품 목록 보기");
} else if (a == 3) {
    System.out.println("장바구니 비우기");
} else if (a == 4) {
    System.out.println("항목 추가하기");
} else if (a == 5) {
    System.out.println("항목 수량 줄이기]");
} else if (a == 6) {
    System.out.println("항목 삭제하기");
} else if (a == 7) {
    System.out.println("영수증 표시하기");
} else if (a == 8) {
    System.out.println("**************************************");
    System.out.println("     Welcome to Shopping Mall");
    System.out.println("     Welcome to Book Market!");
    System.out.println("**************************************");
    System.out.println("프로그램을 종료합니다.");
} else {
    System.out.println("잘못된 번호입니다. 1~8 사이의 숫자를 입력해주세요.");
}
*/

/*
*     switch (a) {
                case 1:
                    System.out.println("현재 고객 정보:");
                    System.out.println("이름: " + name + "연락처: " + phone);
                    break;
                case 2:
                    System.out.println("장바구니 상품 목록 보기");
                    break;
                case 3:
                    System.out.println("장바구니 비우기");
                    break;
                case 4:
                    System.out.println("항목 추가하기");
                    break;
                case 5:
                    System.out.println("항목 수량 줄이기");
                    break;
                case 6:
                    System.out.println("항목 삭제하기");
                    break;
                case 7:
                    System.out.println("영수증 표시하기" );
                    break;
                case 8:
                    System.out.println("**************************************");
                    System.out.println("     Welcome to Shopping Mall");
                    System.out.println("     Welcome to Book Market!");
                    System.out.println("**************************************");
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 번호입니다. 1~8 사이의 숫자를 입력해주세요.");
            }*/