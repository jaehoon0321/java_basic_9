package jungol.배열1_jungol;

import java.util.Scanner;

public class 배열1_연습문제1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        // int n1,n2,n3,n4,n5;
        //  n1 = in.nextInt();
        // n1 = in.nextInt();
        // n1 = in.nextInt();
        // n1 = in.nextInt();
        // n1 = in.nextInt();

        int[] array = new int[5]; //stack에 array 생성 Heap에는 0,1,2,3,4 배열 할당 배열 안에는 0으로 셋팅되어 있음

        //array[0] = in.nextInt();
        //array[0] = in.nextInt();
        //array[0] = in.nextInt();
        //array[0] = in.nextInt();
        //array[0] = in.nextInt();
        System.out.println("==itar 방식 입력==");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }

        System.out.println("==iter 방식 입력==");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("==itar 방식 입력==");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

    }
}
