package Study.Ex06;


//6번 문제 : 클래스를 상속해서
//자바의 상속 규칙: 자식 클래스의 객체를 생성하면, 부모 클래스의 객체가 먼저 생성되어야 한다.
// 따라서 자식 클래스의 생성자는 반드시 첫 줄에서 부모 클래스의 생성자를 호출해야 한다.
//
//컴파일러의 자동 처리:
// 만약 개발자가 자식 생성자에서 부모 생성자를 호출하는 코드(super(...))를 직접 작성하지 않으면,
// 컴파일러는 자동으로 부모의 기본 생성자를 호출하는 super(); 코드를 첫 줄에 삽입합니다.
//
//문제의 상황:
//
//Parent 클래스에는 Parent(String name) 생성자만 있고, 매개변수가 없는 기본 생성자 Parent()는 존재하지 않습니다.
//
//Child 생성자에는 super가 없으므로, 컴파일러가 자동으로 super();를 추가하려고 시도합니다.
//
//하지만 Parent 클래스에는 super();가 호출할 Parent()가 없으므로, 컴파일 에러가 발생하는 것입니다.

public class Parent {
    public String name;

    public Parent(String name){
        this.name = name;
    }
}
