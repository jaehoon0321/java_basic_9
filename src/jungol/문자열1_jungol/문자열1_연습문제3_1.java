package jungol.문자열1_jungol;

import java.util.Scanner;

public class 문자열1_연습문제3_1 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String inputString = "jungol olympiad";

        for (int i = 0; i < 5; i++) {//0번부터 5번까지
            int targetNum = in.nextInt();
            if (targetNum > 14 || targetNum < 0) {
                break;
            }
            System.out.print(inputString.charAt(targetNum));


        }
    }
}
