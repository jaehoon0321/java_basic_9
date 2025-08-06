package javabasic_02.day10;

public class Ex17 {


    public class Printer {

        public static void println(int value){
            System.out.println();

        }public void println(boolean value){
            System.out.println();
        }public void println(double value){
            System.out.println();
        }public void println(String value) {
            System.out.println();
        }

        public static void main(String[] args) {
            javabasic_02.day10.Printer printer = new javabasic_02.day10.Printer();
            printer.println(10); //static 변경
            printer.println(true);
            printer.println(5.7);
            printer.println("홍길동");
        }

    }

}

