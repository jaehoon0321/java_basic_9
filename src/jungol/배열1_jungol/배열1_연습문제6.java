package jungol.배열1_jungol;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 배열1_연습문제6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] outputArray = new Integer[10];

        // 사용자로부터 10개의 정수 입력 받기
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = in.nextInt();
        }

        // 내림차순 정렬 (큰 수에서 작은 수로)
        Arrays.sort(outputArray, Collections.reverseOrder());

        // 가장 큰 값 출력
        System.out.println(outputArray[0]);


        System.out.println("=================");
        Arrays.sort(outputArray);
        System.out.println(outputArray[9]);
    }
}
