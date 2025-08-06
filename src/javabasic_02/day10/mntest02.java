package javabasic_02.day10;

public class mntest02{
    // login 메서드: id와 password를 받아 로그인 확인
    public boolean login(String id, String password) {
        if (id.equals("hong") && password.equals("12345")) {
            return true;
        }
        return false;
    }
    // logout 메서드: id만 받아 로그아웃 메시지 출력
    public void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다." +"");

    }



    }


