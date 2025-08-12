package javabasic_02.day12.day11.inheritance.sec06.package1;

public class B {
	//메소드 선언

    public void method(){
        A a = new A();
        A.field = "value";
        a.method();
    }

    public static void main(String[] args) {
        B b = new B();

    }

}