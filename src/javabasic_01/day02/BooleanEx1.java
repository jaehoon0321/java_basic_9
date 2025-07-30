package javabasic_01.day02;

public class BooleanEx1 {
    public static void main(String[] args) {

        int x=30;

        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (x > 0 && x < 30);
        boolean result4 = (x <= 0 || x >= 30);

        System.out.println("result1 =" + result1);
        System.out.println("result2 =" + result2);
        System.out.println("result3 =" + result3);
        System.out.println("result4 =" + result4);
    }
}



// x가 0 이하이거나 30 이상인가?


//int x = 30;
//변수 x의 값이 20인가? 결과 result1에 저장
//변수 x의 값이 20이 아닌가? 결과 result2에 저장
//변수 x의 값이 0보다 크고 30보다 작은가? 결과 result3 저장
//변수 x의 값이 0보다 적거나 30보다 크거나 같은가 result4 저장
