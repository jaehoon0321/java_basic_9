import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        //3개의 정수를 입력받아 3개의 합 결과를 출력하세요
        int num1, num2, num3, sum;

        //사용자 입력을 위한 키보드 입력 기능 추가
        Scanner input = new Scanner(System.in);

        //각 변수에 값을 할당
        System.out.println("첫번째 숫자를 입력하세요");
        num1 = input.nextInt();
        System.out.println("두번째 숫자를 입력하세요");
        num2 = input.nextInt();
        System.out.println("세번째 숫자를 입력하세요");
        num3 = input.nextInt();

        //연산
        sum = num1 + num2 + num3;
        System.out.println("출력괄과는 다음과 같습니다");
        System.out.println("출력괄과는 다음과 같습니다");
        //출력
        System.out.println(num1 + "+" + num2 + "+" + num3 + "=" + sum);//ctrl+d 해당줄 복사  , " "=문자열  변수와 문자열을 연결하는 연결 연산자
        System.out.printf("%d + %d + %d = %d" ,num1,num2,num3,sum );//printf(자바에서 제공하는 만성되어있는 기능 -> 순서대로 꽃아서 출력해라



    }
}







//<Notion> 2025년 7월 23일 수요일

/*class ex01{}소괄호시작과 끝을 의미
public 공공의 누구나 접근할 수 있는 ex01 public class ex01{} 접근 제한자
접근제한자 - public > protected > default > private
private는 자기 자신만 볼 수 있는 것
class ex 01 (default의 경우, 작성하지 않는 경우
main 메소드 , 메소드 : 기능단위 메인메소드는 순차적으로 수행한다(main의 특징) 실행 메소드라고 함(핵심적인 실행부)
수행한다 -> 하드웨어적으로 공간을 할당 받는다는것 메모리 -> CPU(연산을 함)저장한것을 다시 가져다 놓는 일련의 과정
static 프로그램이 끝날 때까지 공간을 유지
void는 리턴값이 있나 없나를 체크함(데이터 파일에 따라서 바뀔 수도 있다)



Q. 3개의 정수를 10, 11, 12를 더하여 결과를 출력하시오

* */