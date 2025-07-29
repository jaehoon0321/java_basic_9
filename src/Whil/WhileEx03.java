package Whil;

import java.util.Scanner;

//조건식이 true일 경우에 계속해서 반복하고, false가 되면 반복을 멈추고 while 문을 종료
public class WhileEx03 {
    public static void main(String[] args) {
        //키보드에서 "1"(문자열) 입력했을때 속도를 증가, "2"를 입력하면 속도를 감소시키고 "3" 프로그램을 종료
        Scanner in = new Scanner(System.in); //입력기능
        //2.속도의 증감을 비교할 변수
        boolean run = true;
        //3.속도값 조절 변수
        int speed = 0;
        while (run){
            System.out.printf("=============================");
            System.out.printf("1.모터 속도 증가");
            System.out.printf("2.모터 속도 감소");
            System.out.printf("3.엔진 시스템 종료");
            System.out.printf("=============================");
            System.out.printf("선택하세요 : ");

            String stringNum = in.nextLine();

            if (stringNum.equals("1")){
                speed++;
            System.out.println("현재속도 = " +speed);
            }
            else if (stringNum.equals("2")) {
            speed--;
            System.out.println("현재속도 = " +speed);
            }
            else if (stringNum.equals("3")) {
                run = false;
                System.out.println("엔진끄기");
            }
            }
        }
    }

//while문은 조건식이 참이면 루프를 계속 반본복하는 반복문
//조건식은 대개 비교 또는 논리 연산식
//while문은 반복 횟수가 정해져 있지 않을 때 사용함
