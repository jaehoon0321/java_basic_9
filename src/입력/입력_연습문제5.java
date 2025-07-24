package 입력;

public class 입력_연습문제5 {
    public static void main(String[] args) {
    double x = 1.234;
    double y = 10.34587;


    System.out.println("전체 7자리로 맞추고 소수 4자리까지 출력");
    System.out.printf("x = %7.4f\n", x); //%7.4f-> 7자리의 공간 확보
    System.out.printf("y = %7.4f\n", y);

    System.out.println("소수 2자리까지 출력(반올림)");
    System.out.printf("x = %.2f\n", x); //.2f는 반올림을 해줌.
    System.out.printf("y = %.2f\n", y);
    }
}
