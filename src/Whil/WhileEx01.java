package Whil;

public class WhileEx01 {
    public static void main(String[] args) {
        //1부터 10까지 출력하는 프로그램 -while문을 이용
        int loop = 1; //정수형 무한루프는 1부터 시작
        while(loop <= 10){// 루프는 10보다 같거나 작을때까지만 반복해

            System.out.print(loop + " ");//출력해 루프값 + 띄어쓰기
            loop +=1; //loop++; loop = loop + 1;//루프가 한번 반복할때마다 루프의 값을 하나씩 더해

        }
    }
}
