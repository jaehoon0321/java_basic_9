package day05;

public class StarEx02 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {//5행이 됩니다
            for (int j = 1; j <= i; j++) {//열에서는 1 부터 시작하고 i의 값이 1부터 증감이 됩니다.
                System.out.print("*");//i의 값은
                //좌표값을 찍으려면 ("(%d, %d)",i, j);

                //여기까지는************************* 출력 반복이 되니
                //******
                //*****
                //*****
            }
            System.out.println();
        }
    }
}