package javabasic_02.day12.day11.inheritance.sec07.exam01;

public class PromotionExample {

	static class A {}
	static class B extends A {}
	static class C extends A {}
	static class D extends B {}
	static class E extends C {}

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		B b1 =d;
//		B b2 =e;
		C c1 = e;
//		C c2 =d; 본인 자식들만 가능하고  자식이 아니면 자동변환이 일어나지 않는다. 즉 나의 부모타입으로만 자동변환이 된다.
		//상속 관계가 아니다!.(요약)
	}
}
