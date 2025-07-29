package 선택제어문;

public class 주사위랜덤문제 {
    public static void main(String[] args) {
        Math.random();  //0.0 <=Math.random() <1.0
        //0.0*6 <= MAth.random() <1.0*6
        //0.6 <= Math.random() < (int)6.0  //(int)로 캐스팅을 해줌 소수가 필요 없기 때문에
        //0, 1 , 2, 3, 4, 5
        //0 <=  Math.random() < 6 // 0,1,2,3,4,5
        //(0+1) = ((int)Math.random()*6)+1) <6+1  -> 정수로 캐스팅을 하고 원하는 범위를 설정 그리고 안에서 랜덤하게 숫자를 뽑아내는 방법을 수식으로 명시화 한 것
        // Math.random은 자바의 기본 유틸 페키지 , 스캐너, 시스템, math은 import를 해줘야됨,

        int number = (int) (Math.random() * 45) + 1;  //+1을 하는 이유는 0~45 부터 하기 때문에 1부터 시작하려면 +1을 해줘야 한다
        // (int)로 캐스팅을 해주고 math.random()을 적용하고 * 45 -> 0~45 니까 1~45를 하려면 +1 을 해준다

        //start부터 시작하는 n개의 정수 중에서 하나의 정수를 얻기 위한 코드를 작성하세요.//위에 코드는 +1가 스타트 값임
        //int num = (int)(Math.random() * n)+ start 자바에서 난수를 만들기 위한 공식!!!


        System.out.println("3번을 연달아 주사위를 던지고 나온 값을 출력하세요");
        int num = 0;

        for (int i = 1; i < 4; i++) {
            num = (int) (Math.random() * 6) + 1;
            System.out.println("num");
        }


    }
}
