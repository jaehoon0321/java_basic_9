package 반복제어문1_jungol;

import java.util.Scanner;

public class 반복제어문1_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();//사용자에게 입력을 받고
            if (num < 0 || num > 100) { //반약 num값이 0보다는 크고 100보다 작은 값을 입력 했다면 끝내..
                break;
            }
            sum += num;
            count++;
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.printf("sum : %d\n", sum);
            System.out.printf("avg : %.1f\n", average);
        } else {
            System.out.println("입력된 유효한 수가 없습니다.");
        }

        sc.close();
    }
}
