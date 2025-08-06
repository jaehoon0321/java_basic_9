
package javabasic_02.day09.study_0804_riview;

public class sol1 {
// 메서드의 개념 알아가기

    // [메서드 블록: method()]
    // static 메서드: 객체 생성 없이 클래스명으로 직접 호출 가능
    public static void method() {
        System.out.println("static 메서드입니다.");
        System.out.println(5 + 6); // 간단한 덧셈 출력
    }

    // 메인 메서드 블록
    // 자바 프로그램의 시작  -> (가장 먼저 실행되는 메서드)
    public static void main(String[] args) {
        System.out.println("첫번째 호출 메소드 입니다");

        // 메서드 호출 (method() 블록 사용)
        method(); // 첫 번째 호출

        System.out.println("두번째 호출 메소드 입니다");

        // 메서드 호출 (method() 블록 사용
        method(); // 두 번째 호출
    }
}
