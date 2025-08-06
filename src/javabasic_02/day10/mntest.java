package javabasic_02.day10;

public class mntest {

    public static void main(String[] args) {


        int[] array = {1, 5, 3, 8, 2};

        int max = array[0]; // 첫 번째 값을 초기 최대값으로 설정
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i]; // 더 큰 값이 있으면 max를 갱신
            }
        }
        System.out.println("최대값: " + max);
    }
}
