package Whil;

//조건식이 true일 경우에 계속해서 반복하고, false가 되면 반복을 멈추고 while 문을 종료
public class WhileEx02 {
    public static void main(String[] args) {
        //1부터 10까지 출력하는 프로그램 -while문을 이용
        int loop = 1; //정수형 무한루프는 1부터 시작
        int total = 0;
        while(loop <= 100){// 루프는 100보다 같거나 작을때까지만 반복해
            total += loop;//total에 현재 숫자(loop)를 더한다는 의미예요.
            loop +=1; //loop++; loop = loop + 1;//루프가 한번 반복할때마다 루프의 값을 하나씩 더해
        }
        System.out.println("1-100의합 = " + total); //출력문
    }
}
//while문은 조건식이 참이면 루프를 계속 반본복하는 반복문
//조건식은 대개 비교 또는 논리 연산식
//while문은 반복 횟수가 정해져 있지 않을 때 사용함

