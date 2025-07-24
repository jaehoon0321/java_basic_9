package 입력;

public class 입력_연습문제2 {
    public static void main(String[] args) {
        int a = 10; //정수형 a라는 공간에 10을 넣어줌
        int b = 20; //정수형 b라는 공간에 20을 넣어줌

        int temp = a;  //
        a = b;
        b = temp; //temp의 역활은 a와,b의 역활이 스왑 되는 것

        System.out.println(a + " " + b); //a출력하고 b를 출력하는데 ""사이에 공백을 넣어서 보기 좋겠끔 " " 안들어가거나 그냥 a+b할경우 그냥 30으로 나옴 유의

    }
}


