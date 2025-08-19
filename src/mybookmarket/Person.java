package mybookmarket;
//사람의 이름과 전화번호 정보를 담는 Person 이라는 객체를 만들기 위한 설계도

public class Person {//public class person 클래스 선언 .
    // public클래스는 어디서든 이 클래스를 사용할 수 있다는 의미
    private String name;//객체가 가질 데이터를 지정  필드 or 멤버변수를 의미
    //이름은 pirvate 정보은닉 을 위해서 즉 내부에서만 접근할 수 있고 외부에서는 직접 값을 읽거나 수정 할 수 없다.

    private String phone;//핸드폰은 int 정수형으로 받고
    private String address;//주수도 String 문자열로 받는다.

    //int phone 보단 String phone이 났다
    //-WHY? 전화번호는 010으로 시작하기도 하고 산술 연산에 쓰이지 않기 때문에

    public Person(String name, String phone){//생성자 생성 객체를 만들때 호출되는 메서드
        this.name = name;//name값을 객체에 필드 name 에 저장하라.
        this.phone = phone;//phone의 값을 객체이 필드 phone에 저장하라.
    }

    public Person(String name, String phone, String address){//생성자를 만들고
        this.name = name;
        this.phone = phone;
        this.address = address;

        //필드가 private 개인으로 설정되어있으므로 이 필드를 읽거나 수정하려면
        //getter와 setter메서드가 필요하다.
    }
//Alt +Insert 를 이용해서 name, phone, address 를 get, set 을 설정해준다.
//필드가 private 개인으로 설정되어있으므로 이 필드를 읽거나 수정하려면
//getter와 setter메서드가 필요하다.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
