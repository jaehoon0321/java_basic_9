package javabasic_02;

public class PrimitiveEqualType_2 {
    public static void main(String[] args) {
        // 정수형 배열 arr1, arr2, arr3 선언 및 메모리 생성
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[3];

        // --- itar 방식으로 값 할당 (5, 6, 7) ---
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = 5 + i;
        }

        // --- iter 방식으로 값 확인 ---
        System.out.println("iter 방식 출력:");
        for (int num : arr3) {
            System.out.println(num);
        }

        // --- itar 방식으로 값 확인 ---
        System.out.println("itar 방식 출력:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("arr3[" + i + "] = " + arr3[i]);
        }
    }
}


