package 반복제어문2_jungol;

import java.util.Scanner;

public class 반복제어문2_연습문제4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("자연수를 입력하세요: ");
        int num = scanner.nextInt();//int로 정수형 저장

        int sum = 0; //정수형 sum을 0으로 정의를 하고
        for (int i = 1; i <= num; i++) {
            sum += i;//매 반복마다 sum 값에 i값을 더한다
            //계산이 i+sum값,  1+0=1 , 2+1=3, 3+3=6, 4+6=10, 5+10=15, ,6+15~ ... 이런식으로 식이 진행된다는걸 이해해야함

            //1+3+6+10+15
        }

        System.out.println("합: " + sum);
    }
}

//Q.자연수를 입력받아서 1부터 입력받은 수까지의 합을 출력하는 프로그램을 작성하시오.
//생각 10을 input을 하면 55가 output 되는데 1,3,