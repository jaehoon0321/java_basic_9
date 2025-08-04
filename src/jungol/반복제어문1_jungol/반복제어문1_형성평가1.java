package jungol.반복제어문1_jungol;
//정수를 입력받아 1부터 입력받은 정수까지를 차례대로 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class 반복제어문1_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // 정수 입력

        for (int i = 1; i <= num; i++) {// for 반복문
            System.out.print(i + " ");
        }

        sc.close();
    }
}
