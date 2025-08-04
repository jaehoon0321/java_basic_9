package jungol.반복제어문2_jungol;

import java.util.Scanner;

public class 반복제어문_형성평가1 {
    public static void main(String[] args) {
        Scanner sccanner = new Scanner(System.in);

        int n = sccanner.nextInt(); // 사용자로부터 n 입력받음

        for (int i = 0; i < n; i++) { //i= 0에서 i가 n보다 작은값을 출력한다 i++ 후위 증가한다 여기서 당연한 말이지만
            //n의 값을 5를 입력 했을때 식대로면 4인데 5개가 출력 이 될까? i=0 부터 시작 했기 때문에
            //0,1,2,3,4 총 5개 1부터 할려면? for (int i = 1; i<=n; i++)=

            System.out.println("jungol"); // "JUNGOL"을 n번 줄바꿈하며 출력
        }
    }
}
