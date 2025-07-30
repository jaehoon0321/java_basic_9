package javabasic_01.day03;

public class 반복제어문1_자가진단1 {
    public static void main(String[] args) {
        /*
        System.out.println("1 2 3 4 5 6 7 8 9 10");
        System.out.print(1);
        System.out.print(2);
        System.out.print(3);
        System.out.print(4);
        System.out.println();

        for(int loop = 1 ; loop <= 50; loop++){
            System.out.printf("%d", loop);
        }

        Scanner in = new Scanner(System.in);

        char c = in.next().charAt(0);

        for(int i =1; i<=20; i++){
            System.out.printf("%c", c); // 입력한 문자 출력

            int ch = 65;
            for(int j = 1 ; j<=6; j++){
                System.out.printf("%c", ch);
                ch = ch + 1;
            }
        }
        */


        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total = total + i;
        }
        System.out.println("1-100의 총합: " + total);
    }
}

