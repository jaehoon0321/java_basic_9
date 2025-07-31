package javabasic_02.day07;

public class MemberTest {

    public static void main(String[] args) {
         Member ss_health1 = new Member();

        ss_health1.name = "홍길동";
        ss_health1.age = 30;
        ss_health1.tel = "010-1234-1234";
        ss_health1.email = "jaehoon@naver.com";
        ss_health1.address = "서울";
        ss_health1.weight = 90.2;

        Member ss_health2 = new Member();
        ss_health2.name = "김이슬";
        ss_health2.age = 26;
        ss_health2.tel = "01012341234";
        ss_health2.email = "samsungIS.IScompany.com";
        ss_health2.address = "서울";
        ss_health2.weight = 40;

        //삼성 지점 sshealth 헬스센터
        Member [] 삼성 = new Member[2];
        삼성[0] = ss_health1;
        삼성[1] = ss_health2;

        //t삼성 지점 회원의 리스트 출력

        for (int i = 0; i < 삼성.length; i++) {
            Member member = 삼성[i];
            System.out.println(member.name);

        }
        for (Member member : 삼성) {
            System.out.println(member.name);

        }
    }
}
