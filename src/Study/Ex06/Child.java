package Study.Ex06;

public class Child extends Parent {//Child 클래스가 Parent 클래스를 물려받는다. Parent 상위클래스, Child 하위 클래스
    public int studentNo;

    public Child(String name, int studentNo) {
        // 1. super()를 이용해 부모 생성자를 명시적으로 호출 (반드시 첫 줄에 와야 함)
        super(name);

        // 2. 자식 클래스의 필드를 초기화
        this.studentNo = studentNo;

        // super(name) 호출로 부모의 name 필드는 이미 초기화되었으므로
        // this.name = name; 코드는 더 이상 필요 없습니다.
    }
}