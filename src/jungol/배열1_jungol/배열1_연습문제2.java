package jungol.배열1_jungol;

//26개의 문자배열을 선언하고 'A'부터 'Z'까지의 대문자를 차례로 대입 시킨 후
// 배열의 마지막부터 처음까지 각 문자를 출력하는 프로그램을 작성하시오.

public class 배열1_연습문제2 {
    public static void main(String[] args) {
        char[] a = new char[26]; // 26개의 문자배열을 선언

        // itar방식 'A'부터 'Z'까지 배열에 저장  itar방식
        for (int i = 0; i < a.length; i++) {//정수형 i 의 값 0부터 26까지 반복
            a[i] = (char) ('A' + i); //대문자 'A'는 유니코드 65, 65값에 i값을 더해줌 ,알파벳 문자 저장
        }

        // 배열을 역순으로 출력
        for (int i = a.length - 1; i >= 0; i--) { //배열을 역순으로 처리하기 위해 a.length에 -1을 해주고 i >= 0;은 i가
            //0이상인 경우네는 반복을 해준다 , i-- 반복할때마다 i를 감소 시킨다
            System.out.print(a[i] + " ");//배열의 각 문자를  출력하고 한칸 띄우기




        }
    }
}
