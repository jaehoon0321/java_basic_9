package javabasic_02.day09.methodbasic;

import java.util.Scanner;

public class Example03 {
    static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("두 수를 차례로 입력해 주시면 나누기 결과를 제공해 드립니다.");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
       int result = division(n1,n2); //결과값 받을래
        System.out.println("요청하신 "+ n1 + "/" + n2 + " 의 나누기 결과는 " + result);
        System.out.println(result);

    }
//수선대로 어사이먼트 된다. n1 =int number1 , n2 = int numbber2
    public static int division(int number1, int number2) {
        int n1 = number1, n2 = number2, result =0;
        if (n2 !=0){
            result = n1/n2;
        }
            else System.out.println("0으로 나누기 금지");

        return 0;

    }
}
