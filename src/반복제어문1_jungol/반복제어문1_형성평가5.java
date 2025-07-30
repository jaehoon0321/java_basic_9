package 반복제어문1_jungol;

import java.util.Scanner;

public class 반복제어문1_형성평가5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base = 0;
        int height = 0;
        double triangle_width = 0.0;
        String answer ="";
        boolean flag = true;
        while(flag){
            base = in.nextInt();
            height = in.nextInt();
            triangle_width = ((double)base*height)/2;
            System.out.printf("Base = %d\n",base);
            System.out.printf("Height = %d\n", height);
            System.out.printf("Triangle width = %.1f\n", triangle_width);
            answer = in.nextLine();
            if(answer.equals("Y")|| answer.equals("y"))continue;
            else break;
        }
    }
}
