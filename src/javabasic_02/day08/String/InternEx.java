package javabasic_02.day08.String;
//intrer() : 문자열을 최적화 관리를 위한 메소드
//문자열을 리터럴로 선언할 경우 내부적으로 STring의 intern()메서드가 호출이 된다.
//    해당 리터럴이 문자열 상수 pool안에 존재하는지 확인,
//만약 존재하면 해당 pool 의 리터럴을 리턴한다.
//        존재하지 않는다면 리터럴을 pool안에 집어 넣고 새로운 주소값을 반환

public class InternEx {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(new char[]{'H','e','l','l','o'}).intern();

        System.out.println(str1 == str2);
        //해당 코드는 의미는 무엇인가?

        String str3 = "Hi"; //2개의 위치가 바뀌면 트루가 나온다 str4의 String값을 참조하기 때문에 equlse <-> intern
        String str4 = new String("Hi");

        str3 = str3.intern(); //intern()의 역활
        System.out.println(str4 == str3); //true


    }
}
