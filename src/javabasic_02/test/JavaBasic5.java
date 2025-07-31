package javabasic_02.test;

public class JavaBasic5 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {        // 행
            for (int j = 1; j <= i; j++) {    // 열: i만큼 반복
                System.out.print("*");
            }
            System.out.println();             // 줄바꿈
        }
    }
}

