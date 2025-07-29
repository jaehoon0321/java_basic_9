package 반복제어문2;

public class 반복제어문_연습문제7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {//반복문이 시작 i =1로 시작하고 i= 5와 같거나 작다 i++ 증가//줄 수 :5줄 출략
            for (int a = 1; a <= 5; a++) {//inta는 1부터 시작하고 5까지  1씩 증가//각 줄에 5번 반복을 하고
                System.out.print(i + " ");//출력은 i값만 출력을 해라,줄번호 i를 출력한다.
            }
            System.out.println();
        }

        System.out.println();  // 패턴 사이 줄바꿈

        // 두 번째 패턴
        for (int i = 1; i <= 5; i++) {
            for (int b = 1; b <= 5; b++) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}

/*
* Q.
*/