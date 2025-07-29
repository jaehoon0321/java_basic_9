package day04;

public class SwitchEx01 {
    public static void main(String[] args) {

        int num = (int) (Math.random() * 6) + 1; // random() 1~6중 하나의 숫자만 생성 저장
        System.out.println(num);

        switch (7) {//switch('5'이렇게 될시에 문자열로 인식이 되기 때문에 case도 '5'라고 해야지 인식이 됨
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;

            case 5:
                System.out.println("6");
                break;
            case 6:
                System.out.println("5");
                break;
            
                
                default://예외가 없을시에 default로 처리한다.
                System.out.println("스위치 문입니다");

        }
    }
}
