package javabasic_02.day09.oop;

public class Student {
    //Student 멤버(필드)
    private String stu_name;
    private Integer stu_age;
    private String address;
    private String stu_ssn;
    public String gender;

    //생성자를 통하여 학생의 객체의 필드를 초기화
    Student() { }   //기본 생성자

    Student(String stu_name, String stu_ssn){
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
    }
    Student(String stu_name, Integer stu_age, String address, String stu_ssn){
        this.stu_name = stu_name;
        this.stu_ssn = stu_ssn;
        this.stu_age = stu_age;
        this.address = address;
    }

    public String getStu_name() {
        return stu_name;
    }

    public void setStu_name(String stu_name) {
        this.stu_name = stu_name;
    }

    public Integer getStu_age() {
        return stu_age;
    }

    public void setStu_age(Integer stu_age) {
        this.stu_age = stu_age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStu_ssn() {
        return stu_ssn;
    }

    public void setStu_ssn(String stu_ssn) {
        this.stu_ssn = stu_ssn;
    }

    //Object 클래스의 toString() 오버로딩
    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", stu_age=" + stu_age +
                ", address='" + address + '\'' +
                ", stu_ssn='" + stu_ssn + '\'' +
                '}';
        //구현클래스와 실행클래스는 나늬어지는게 좋음
    }
}