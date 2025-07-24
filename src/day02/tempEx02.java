package day02;

public class tempEx02 {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int temp = 0;

        System.out.printf("x = %d, y = %d, temp = %d \n",x,y,temp);

        temp = x;
        x = y;
        y = temp;
        System.out.printf("x = %d, y = %d, temp = %d \n",x,y,temp);


    }
}
//값 지정 을 해야 내가 원하는 논리를 할 수 있다.

