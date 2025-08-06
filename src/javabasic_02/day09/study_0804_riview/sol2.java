package javabasic_02.day09.study_0804_riview;
//매개변수가 없고 반환값이 있는 메서드 선언하고 호출하기


public class sol2 {//div라는 클래스를 만들어주고
    public static int div( ) {
         int a = 10, b = 5;
         int result = a / b;

         return result;
         }
 public static void main(String[] args) {
         int num = div ();//num값에 div 값을 넣어줌
         System.out .println(num);// 그 값을 출력
         }
}

