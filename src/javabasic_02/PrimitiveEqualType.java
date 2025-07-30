package javabasic_02;

public class PrimitiveEqualType {

    public static void main(String[] args) {
        // 정수형 배열 arr1, arr2, arr3 선언 및 메모리 생성
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        int[] arr3 = new int[3];

        System.out.println(arr1.length);
        System.out.println(arr2.length);
        System.out.println(arr3.length);

        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);

        arr1[1] = 3;
        System.out.println(arr1[1]);

        // arr1에 차례로 1, 2, 3 할당하고 결과 확인
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        System.out.println("==============");
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("==============");

        // itar 자동완성
        for (int i = 0; i < arr1.length; i++) {
            int i1 = arr1[i];
            System.out.println(i1);
        }

        System.out.println("==============");

        // iter 자동완성
        for (int i : arr1) {
            System.out.println(i);
        }

        // arr3에 값을 itar 방식으로 할당 (5,6,7)
        int value = 5;
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = value;
            value++;
        }

        // arr3 값을 itar 방식으로 출력
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

        // 주소값 비교
        System.out.println("======================");
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
        System.out.println("======================");
        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);
        System.out.println(arr3 == arr1);

        System.out.println("==========주소값 복사하여 다른 참조변수에 할당===========");
        arr2 = arr3;
        System.out.println("=========주소값 비교 ==================");
        System.out.println(arr2 == arr3);

        for (int i : arr2) {
            System.out.println(i);
        }
        System.out.println("========");
        for (int i = 0; i < arr2.length; i++) {
            int i1 = arr2[i];
            System.out.println(i1);

        }
        }
    }

