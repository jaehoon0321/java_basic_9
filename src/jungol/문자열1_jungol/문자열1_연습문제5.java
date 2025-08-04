package jungol.문자열1_jungol;

import java.util.Scanner;

public class 문자열1_연습문제5 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        String str = "우리나라 대한민국!";

        System.out.println("우리나라 대한민국!\n 위 문자열의 길이는 " + str.length() + "입니다.");

    }
}


//SOL1

//import java.nio.charset.StandardCharsets;
//import java.util.Scanner;
//
//public class 연습문제5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String input = "우리나라 대한민국!";
//        System.out.println(input);
//        byte[] utf8Bytes = input.getBytes(StandardCharsets.UTF_8);
//        System.out.printf("위 문자열의 길이는 %d입니다.",utf8Bytes.length);
//
//    }
//}