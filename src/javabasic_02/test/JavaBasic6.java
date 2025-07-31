package javabasic_02.test;

public class JavaBasic6 {

        public static void main(String[] args) {
            // i: 행 번호 (1~5)
            for (int i = 1; i <= 5; i++) { //행번호  1 2 3 4 5 를 출력 하고 i = 1부터시작하고 증감 된다.
                // j: 열 번호 (1~i)
                for (int j = 5; j > 0; j--) {
                    if(i<j){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println(); // 줄바꿈
            }
            System.out.println();

        }
    }

