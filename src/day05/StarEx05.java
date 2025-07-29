package day05;

public class StarEx05 {


    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for(int j=1; j <=i; j++){
                System.out.print("-");
            }
            for (int star = 0; star <5-i; star++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}