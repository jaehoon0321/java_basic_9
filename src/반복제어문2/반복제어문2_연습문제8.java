package 반복제어문2;

public class 반복제어문_연습문제8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {              // 1단 ~ 9단의 곱
            for (int num = 2; num <= 4; num++) {    // 2단 ~ 4단
                System.out.printf("%d * %d = %2d   ", num, i, num * i);//%d =정수 출력 정수+ 정수 = 정수
            }
            System.out.println();                   // 줄바꿈
        }
    }
}
