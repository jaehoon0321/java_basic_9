package javabasic_02.day10;

public class mntest02_1 {
    public static void main(String[] args) {
        mntest02 memberService = new mntest02(); // 클래스명 수정됨
        boolean result = memberService.login("hong", "12345");

        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        } else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
