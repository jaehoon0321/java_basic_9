package 반복제어문2;

import java.util.Scanner;

public class 반복제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 두 개의 정수 입력받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 작은 값부터 큰 값으로 출력하기 위해 min과 max 설정
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        // 반복문으로 min부터 max까지 출력
        for (int i = min; i <= max; i++) {//for반복문으로 int i의 값은 최소값부터 시작을 하고 <= max값을 하나씩 증가시키면서

            System.out.print(i +" ");//+ " " i만 쓰면 붙여서 나오기 때문에 + " " 띄어쓰기를 통해 가독성을 높임

        }


    }
}

/*<code review>
*package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int temp1 = 0;
        int temp2 = 0;
        if (num1 > num2) { //만약에 num1이 num2 보다 크다면
            temp1 = num1; 탬프 =num1이고
            temp2 = num2; 탬프2 num2이다
        } else {//그렇지 않다면
            temp1 = num2;
            temp2 = num1;
        }

        for (int i = temp2; i <= temp1; i++) {
            System.out.print(i + " ");
        }
    }
}
}*/