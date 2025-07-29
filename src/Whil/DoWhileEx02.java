package Whil;

import java.util.Scanner;

public class DoWhileEx02 {
    public static void main(String[] args) {
        System.out.println("메시지를 입력하세요. ");
        System.out.println("프로그램을 종료하려면 q 또는 quit를 입력하세요.");

        Scanner in = new Scanner(System.in);
        String inputString;
gi
        do {
            System.out.print("> ");
            inputString = in.nextLine();
            System.out.println(inputString);
        } while (!(inputString.equals("q") || inputString.equals("quit")));

        System.out.println("---------------");
        System.out.println("채팅 종료");

        in.close();
    }
}
