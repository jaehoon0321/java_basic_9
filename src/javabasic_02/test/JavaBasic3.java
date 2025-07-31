package javabasic_02.test;

/*While문과 Math.random() 메소드를 이용해서 두개의 주사위를 던졌을때
나오는 숫자를(숫자1, 숫자2) 형태로 출력하고,
숫자의 합이 5가 아니면 계속 주사위를 던지고,
숫자의 합이 5이면 실행을 멈추는 코드를 작성하세요.
숫자의 합이 5가 되는 경우의 수를 생각하세요. 클래스명:  JavaBasic3*/

public class JavaBasic3 {

    public static void main(String[] args) {
        while (true) {
            int dice1 = (int)(Math.random() * 6) + 1;
            int dice2 = (int)(Math.random() * 6) + 1;

            System.out.println(dice1 + ", " +dice2);

            if (dice1 + dice2 == 5) {
                break;
            }
        }
    }
}
