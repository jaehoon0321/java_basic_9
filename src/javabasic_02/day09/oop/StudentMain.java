package javabasic_02.day09.oop;

public class StudentMain {

    public static void main(String[] args) {
        Student 경민 = new Student();
        Student 우혁 = new Student("강우혁","12345");
        Student 형근 = new Student("김형근",27,"경기도 의정부시","123456789");
        Student 기웅 = new Student("박기웅",25,"서울시강남구,","12345678945");

        System.out.println(경민.toString());
        System.out.println(우혁.toString());
        System.out.println(형근.toString());
        System.out.println(기웅.toString());
        System.out.println(기웅.getStu_name());
        System.out.println(기웅.getAddress());
        String 기웅주소 = 기웅.getAddress();
        System.out.println(기웅주소 + "살고 있습니다.");
        기웅.gender = "남자";//직접적으로 값을 입력하여 값을 받아옴
        경민.gender = "여자";
        System.out.println(기웅.gender);//직접 접근
        System.out.println(경민.gender);//직접 접근
    }
}
