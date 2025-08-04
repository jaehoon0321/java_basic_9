package javabasic_02.day08.String;

/*(CTRL + SHIFT + /)=전체 주석 처리
//똑같은 변수 a의 주소값을 출력하였다.
//문자열이 변경됨에 따라 주소값이 바뀌어 있음을 확인
//즉, 문자열 값 자체는 불변이라 변경할 수 없기 때문에 새로운 문자열데이터 객체를 대입하여 새로운 공간에 값이 할당됨을 확인한다
*/

public class RefEx02 {
    public static void main(String[] args) {
        String a = "Hello";
        a += "Java Programming";
        System.out.println(a.toString());  //해쉬코드 값은 다르다  a.hashCode()로 확인 가능

        a += "Java Programming";
        System.out.println(a.toString());
        System.out.println(a);
    }
}
