package 배열1_jungol;

import java.util.Scanner;

public class 배열1_연습문제1_2 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[5]; //stack에 array 생성 Heap에는 0,1,2,3,4 배열 할당 배열 안에는 0으로 셋팅되어 있음

        //itar방식
        System.out.println("itar방식");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
