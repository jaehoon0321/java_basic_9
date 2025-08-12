package javabasic_02.day12.day11.inheritance.sec06.package1;

public class A {
	//필드 선언
    protected static String field; //다른 패키제에서 protected  extends인 경우에만 생성 가능..

	//생성자 선언
    protected A(){}

	//메소드 선언
    protected  void method(){
        System.out.println("value");

    }

}