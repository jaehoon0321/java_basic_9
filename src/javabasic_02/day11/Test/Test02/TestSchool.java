package javabasic_02.day11.Test.Test02;
//각각의 객체에 대해 아래와 같은 조건에 맞게 클래스(Student, Teacher, Employee)를 작성하세요.
//        1) 클래스 작성시 멤버변수를 직접 접근 못하도록 encapsulation시키기 위해 각 변수를 private으로 선언하고,
//        각 private member variable에 접근하기 위한 getter, setter member method를 선언하시오.
//        (getter, setter method는 public으로 선언하고, 각 변수마다 작성)
//        2) 각 클래스에, 멤버 변수의 내용을 출력하기 위한 print method를 구현하시오.
//3) main 메소드를 실행했을 때 다음과 같은 결과가 나와야 합니다.

    public class TestSchool {

        public static void main(String[] args) {

            Student s = new Student();
            s.setName("홍길동");
            s.setAge(20);
            s.setId(200201);
            Teacher t = new Teacher ();
            t.setName("이순신");
            t.setAge(30);
            t.setSubject("JAVA");
            Employee  e= new Employee();
            e.setName("유관순");
            e.setAge(40);
            e.setDept("교무과");

            s.print();
            t.print();
            e.print();
        }

    }


