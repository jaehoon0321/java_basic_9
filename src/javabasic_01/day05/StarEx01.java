package javabasic_01.day05;

public class StarEx01 {
    public static void main(String[] args) {
        for(int i = 1; i<=5; i++){
            for(int j = 1; j <= 5; j++){
                System.out.print("*");
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
