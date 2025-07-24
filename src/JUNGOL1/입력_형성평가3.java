package 입력;

public class 입력_형성평가3 {
    public static void main(String[] args) {
        int a = 50;
        double b = 100.12;


        int result = (int) Math.round(a * b);

        System.out.printf("%.2f * %d = %d", b, a, result);
    }
}
