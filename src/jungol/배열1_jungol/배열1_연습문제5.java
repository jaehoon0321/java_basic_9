package jungol.배열1_jungol;

import java.util.Scanner;

//연도와 월을 입력받아 해당 월의 날 수를 출력하다가 월이 0이면 종료하는 프로그램을 작성하시오.
// (월이 잘못 입력되면 "잘못 입력하였습니다."를 출력한다
public class 배열1_연습문제5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //입력을 받아야 되기 때문에 Scanner클래스를 사용해주고

        while (true) { // 무한 반복 (사용자가 종료할 때까지)
            System.out.print("YEAR = "); // 연도 입력 안내 출력을 해주고
            int year = scanner.nextInt(); // 사용자에게 연도 입력받기

            System.out.print("MONTH = "); // 월 입력 안내 출력을 해주고
            int month = scanner.nextInt(); // 월 입력받기 int 정수형으로

            if (month == 0) { // 만약에 월이 0이이라면
                break; // 프로그램을 종료한다
            }

            if (month < 1 || month > 12) { // 만약에 1~12 범위를 벗어나면 || 사이값을 의미
                System.out.println("잘못 입력하였습니다."); // 오류 메시지 출력을 해주고 띄어주고
                continue; // 다시 입력받도록 반복문 처음으로 이동
            }

            int day; //day
            // 2월인 경우 윤년 계산//google 뒤져봄 -_-,,
            if (month == 2) {//만약에 달이 2월달이라면
                // 윤년 조건: (4의 배수이고 100의 배수가 아니거나 400의 배수인 해)
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {//year % 4 == 0 이면 년도가 4로 떨어지는지
                    //&& 그리고  year % 100 != 0 년도가 100으로 나누었을때 나머지가 0이 나오면 안된다. ..%는 나머지 값을 의미함
                    //year % 400 == 0-> 년도가 400으로 나누었을때 나머지 값이 0으로 떨어지는지 댕 어렵네

                    day = 29; // 윤년이면 29일
                } else {
                    day = 28; // 평년이면 28일
                }
            }
            // 4, 6, 9, 11월은 30일
            else if (month == 4|| month == 6 ||month == 9|| month == 11) {//||OR연산자인데 ~이거나임
                //4월 이거나 6월 이거나 9월 이거나 11월 이거나
                day = 30;
            }

            else {
                day = 31;
            }

            // 결과 출력
            System.out.println("입력하신 달의 날 수는 " + day + "일입니다.");
        }
    }
}
