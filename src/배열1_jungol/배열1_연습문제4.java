package 배열1_jungol;

import java.util.Scanner;

public class 배열1_연습문제4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[100];//int[] num =//num 정수 int  생성 int = 100
        int count = 0;// int count 는 정수는 0부터 시작한다 정수 초기화


        while (count < 100) {//while 문(조건이 참이면 무조건 계속 반복)을 이용해서 count가 100 미만이면 계속 반복 아니라면 중지
            int n = sc.nextInt();//정수형 n값 입력을 받고
            if (n == 0) break;//만약 n ==0값이 나온다면 반복을 끝내 버려.
            num[count++] = n;//입력 받은 값을 저장하고 count는 증가
        }

        // 짝수 번째 입력된 수 출력 (2번째, 4번째, ...)
        for (int i = 1; i < count; i += 2) {//중요한데 짝수만을 출력하는것
            // for 반복문( 주어진 조건을 만족하는 동안 반복적인 작업을 수행_
            //내가 헷갈린게 2번째 4번째를 즉 짝수 번째 출력인데 배열은 0 1 2 3 4 5 6 ~ 이런식으로 저장이 되어있고
            // 0 1짝수번째 2 3 짝수 번째 이기 때문에
            //for (int i = 1; -> 1로 시작이 여기가 짝수번째 시작 2 3 (배열로 따지면 4) 짝수번째 그렇기에
            //for (int i =1; i < count; i+=2

            System.out.print(num[i] + " ");




        }
    }
}
