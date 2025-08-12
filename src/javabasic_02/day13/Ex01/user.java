package javabasic_02.day13.Ex01;

public class user {
    public static void main(String[] args) {
        B b = new B();
        C c =  new C();
        D d = new D();
        E e = new E();

        A a;
        a = b;
        a = c;//각각의 객체에서 제공하는 기능들을 호출해서 쓸 수 있다.
        a = d;
        a = e;
        //인터페이스 타입으로 묶고 수행 할 수 있는 통합 모듈로 묶을 수 있다.
        //약간 모듈 만들기 , 결제모듈, 선택모듈, 이런식으로
        //
    }
}
