package jungol.반복제어문1_jungol;

public class 반복제어문1_연습문제2 {
    public static void main(String[] args) {

        int num = 1;// 정수형 변수 num을 선언하고 1로 초기화
        int sum = 0;// 변수 sum을 선언하고 0으로 초기화


        while (num <= 10) {// num이 10보다 작거나 같은 동안 반복문을 실행
            sum += num;// 1부터 10까지의 누적 합을 계산
            num++;
        }

        System.out.println("1부터 10까지의 합 = " + sum);     // 1부터 10까지의 합을 출력
        System.out.println("while문이 끝난 후의 num의 값 = " + num);
    }
}

//int num  =1;
//int sum =0;

//whil (num <=10){
// sum += num;
// num++}