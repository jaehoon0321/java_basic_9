package day03_JUNGOL;

import java.util.Scanner;

public class 연산자_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int qu= num1 / num2;
        int re = num1 % num2;

        System.out.println(num1 + " / " + num2 + " = " + qu + "..." + re);

        sc.close();
    }
}
