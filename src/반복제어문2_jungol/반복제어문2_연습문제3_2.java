package 반복제어문2_jungol;
//1부터 20까지의 홀수를 차례대로 출력하는 프로그램을 작성하시오.

public class 반복제어문2_연습문제3_2{
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i += 2) {//for int i =1로 정의 int 정수
            //i는 20보다 작거나 같다 i= 씩 증가한다
            // 1 3 5 7 9 11 13 15 17 19
            System.out.printf(i + " ");
        }
    }
}
