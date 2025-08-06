package javabasic_02.day11.Test.Test03;

public class Prob1 {

    public static void main(String[] args) {

        Emp emp = new Emp();
        emp.setId("12345");
        emp.setName("홍길동");
        emp.setBaseSalry(50000);
        System.out.println( emp.toString() );
        System.out.println( "봉급 = " + emp.getSalary( 30 ) );
    }
}
//1. 사원(Emp) 클래스는 사원번호를 나타내는 id(문자열)와 사원 이름을 나타내는 name(문자열),
// 사원의 기본급을 나타내는 baseSalary(정수) 필드를 가지고 있다.
//2. 메소드는 사원의 이름 변경 setName메소드와 이름을 반환하는 getName,
// 기본급을 변경하는 setBaseSalary 와 기본급을 반환하는 getBaseSalary,
// 사원번호를 변경하는 setId, 사원번호를 반환하는 getId 메소드를 가지고 있다.
//3. 또한 보너스 값을 매개인자로 받아 다음과 같이 봉급을 계산하여 반환하는 double getSalary(double bonus) 메소드를 가지고 있다.
//        - double getSalary(double bonus) 메소드의 봉급 구현 방법은 다음과 같이 기본급과 보너스를 곱한 값에 기본급을 더하여 계산한다.
//        - salary = baseSalary + baseSalary * bonus ;
//4. 다음과 같은 형식으로 사원정보를 리턴하는 String toString() 메소드를 가지고 있다
//- “name(id) 사원의 기본급은 baseSalary원 입니다.”
//        * 모든 필드는 외부에서 직접 접근하여 값을 변경하거나 얻어가지 못하도록 private로 접근 제한을 막고,
//        메소드는 제한 없이 모두 호출할 수 있는 접근 제한자(public)를 사용한다