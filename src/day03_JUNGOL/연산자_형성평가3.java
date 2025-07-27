package day03_JUNGOL;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int length = sc.nextInt();
        int area = width * length;

        width += 5;
        length *= 2;

        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("area = " + area);
        sc.close();
    }
}
