package jungol.assignment;
//Q.1부터 10까지의 정수를 입력받다가 입력된 정수가 범위를 벗어나면
// 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class 배열2_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//입력을 받아야 하니까 Scanner 클래스를 이용해 입력을 받도록 해주고
        int[] count = new int[11]; // 정수를 사용해  1~10 사용을 한다

        while (true) { //whild반복문 계속 조건이 맞으면 무한 반복
            int num = sc.nextInt();//사용자에게 정수를 입력 받는다
            if (num < 1 || num > 10) { //만약 num값이 1보다 작고 10보다 크다면 반복을 중단해라(break문)
                break;
            }
            count[num]++; //num값에  count계수를 누적해라.
        }

        for (int i = 1; i <= 10; i++) { // [반복문] 정수형 변수 i를 1부터 10까지 1씩 증가시키며 반복 (1~10 숫자 범위 확인)
            if (count[i] > 0) {         // [조건] 만약 해당 숫자가 한 번이라도 입력되었으면 (즉, 개수가 1 이상이면)
                System.out.println(i + " : " + count[i] + "개"); // [출력] 숫자 i와 그 개수를 "i : n개" 형식으로 출력
            }
        }
    }
}
