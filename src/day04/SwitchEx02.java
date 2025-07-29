package day04;

import java.util.Scanner;

public class SwitchEx02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char grade = in.next().charAt(0);


        //사용자에게 A~C 중 한문자를 받아서 'A' => "매우 우수" B => "우수 " C => "노력하세요"

        switch (grade) {//switch('5'이렇게 될시에 문자열로 인식이 되기 때문에 case도 '5'라고 해야지 인식이 됨
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;

            case 'C':
                System.out.println("노력하세요");
                break;



            default://예외가 없을시에 default로 처리한다.
                System.out.println("사용자 성적이 잘못 입력되었습니다.");
        }
    }
}
