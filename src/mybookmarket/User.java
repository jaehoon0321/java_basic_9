package mybookmarket;

// public class User extends Person
// 'extends' 키워드는 'User' 클래스가 'Person' 클래스를 상속받는다.
//  User는 Person이 가진 모든 필드(name, phone, address)와 메서드를 자동으로 상속 받음

public class User extends Person {


    public User(String name, String phone) {
        // super(name, phone);
        // 'super()'는 부모 클래스(Person)의 생성자를 호출하는 특별한 명령어입니다.
        // 자식 클래스(User)가 생성될 때, 먼저 부모 클래스(Person)가 완성되어야 합니다.
        // 이 코드는 "전달받은 name과 phone 값을 부모인 Person의 생성자로 넘겨서 초기화해달라"는 의미입니다.
        super(name, phone);
    }



    public User(String username, String phone, String address) {
        // 위와 마찬가지로, 부모 클래스인 Person의 3개짜리 매개변수를 받는 생성자를 호출하여
        // 이름, 전화번호, 주소 필드를 초기화합니다.
        super(username, phone, address);
    }
}