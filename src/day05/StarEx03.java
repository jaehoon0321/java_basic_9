package day05;

public class StarEx03 {
    public static void main(String[] args) {
        // i: 행 번호 (1~5)
        for (int i = 1; i <= 5; i++) {
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
/*
*
* */