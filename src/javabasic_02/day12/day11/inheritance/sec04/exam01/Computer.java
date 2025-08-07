package javabasic_02.day12.day11.inheritance.sec04.exam01;

public class Computer extends Calculator{
	//메소드 오버라이딩
    Computer(){
        super();
    }

    @Override //어노테이션(@) 컴파일 시 정확히 오버라이딩이 되었는지 체크(생략가능)
    //areaCircle에 메소드가 있는데 자기 입맛에 재정의 한것.
    public double areaCircle(double r) {
        System.out.println("Calculator 객체의 areaCircle()실행");
        super.areaCircle(r);
        return Math.PI * r *r;

    }
}