// 패키지 선언: 이 클래스가 포함된 패키지 이름
package javabasic_02.day09.study_0804_riview;

public class sol3 {

    // [메서드 블록: max()]
    // 두 개의 정수(x, y)를 매개변수로 받아서, 더 큰 값을 반환
    public static int max(int x, int y) {
        int result; // 결과값을 담을 변수 선언
        if (x > y)
            result = x; // x가 더 크면 x를 반환
        else
            result = y; // y가 더 크거나 같으면 y를 반환

        return result; // 최종 결과값 반환
    }

    // [메인 메서드 블록: main()]
    // 프로그램 시작
    public static void main(String[] args) {
        int a = 5, b = 6; // 비교할 두 정수 선언

        // max 메서드 호출 → 두 수 중 더 큰 값을 반환받아 num에 저장
        int num = max(a, b);//num값은 max메서드의 실행 값.

        // 결과 출력 -> a는 5 b= 6이므로 큰 값을 결과값에 출력해주는 메서드 6
        System.out.println(a + "(와)과 " + b + "의 수 중 " + num + "이 큽니다.");
    }
}
