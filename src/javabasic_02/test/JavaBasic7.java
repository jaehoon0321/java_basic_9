package javabasic_02.test;

public class JavaBasic7 {
    public static void main(String[] args) {
        int n = 3; // 중앙 줄의 최대 '@' 개수 = 5 (2n - 1)

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}


