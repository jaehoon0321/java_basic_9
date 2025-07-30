package javabasic_01.day05;

public class StarEx07 {
    public static void main(String[] args) {
        int n = 5; // 다이아몬드 중심 줄 수 (전체 줄은 2n - 1)

        // ▶ 위쪽 삼각형 (1 ~ n)
        for (int i = 1; i <= n; i++) {
            // 왼쪽 공백: n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 별 출력: 2 * i - 1 개
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // 줄바꿈
            System.out.println();
        }

        /*/ ▶ 아래쪽 삼각형 (n - 1 ~ 1)
        for (int i = n - 1; i >= 1; i--) {
            // 왼쪽 공백: n - i
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 별 출력: 2 * i - 1 개
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // 줄바꿈
            System.out.println();*/
        }
    }
//}/
