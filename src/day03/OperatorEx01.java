package day03;

public class OperatorEx01 {
    public static void main(String[] args) {
        //부호 연산 : 변수의 부호를 유지하거나 변경한다.
        byte b= 100;
        System.out.println(b);
        //정수 타입 (byte, short, int)의 연산결과는 int 타입으로 저장
        b = 100;
        System.out.println();

        int a = -b;
        System.out.println(a);

        int c = -a;
        System.out.println(c);

        //2.증감연산자 : 변수의 값을 1증가시키거나 1감소시킴
        // ++X, --x prefix,
        // x++, x-- postfix


        //산술
        byte v1 = 10;
        byte v2 = 4;
        byte v3 = 5;
        long v4 = 10L;

        int result4 = v1 = v2; //모든 피연산자는 int 타입으로 자동변환 후 연산.
        System.out.println(result4);

        long result5 = v1 + v2 -v4;// 모든 피연산자는 ong 타입으로 promotion연산
        System.out.println(result5);
        double result6 = (double)v1/v2; //double로 타입 강제 변환 후 연산
        System.out.println(result6);




    }
}
