package day05;

import java.util.Scanner;

public class StarEx06 {
    public static void main(String[] args) {
        int row, col; //행, 열 값을 저장할 변수를 선언

        Scanner in  = new Scanner(System.in);
        System.out.println("몇행으로 미라미드 만들까요?");
        int n = in.nextInt();

        for (row = 1; row <=n; row++){
            for (col = row ; col < (n-1); col++){
                System.out.print(" ");
            }
            for (col=1; col <= (2*row-1); col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


//n행이 가져야 할 별의 수는 (2n-1)
//피라미드형 모양의 별찍기 , 공백값을 질정하게 별 앞에만 주면 된다.

