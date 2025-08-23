package day19.riview_test;

import java.util.Arrays;
import java.util.List;

/* 정수 리스트에서 짝수를 필터링하는 자바 스트림 연산을 작성하세요 */
public class Q1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6); // 정수 리스트 생성

        // 짝수 필터링 및 출력
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n)); // 출력
    }
}
