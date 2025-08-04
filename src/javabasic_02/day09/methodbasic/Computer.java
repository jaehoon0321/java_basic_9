package javabasic_02.day09.methodbasic;
//가변길이 매개변수
//메소드를 호출할때 매개변수의 개수에 맞게 매개값을 제공해야 한다
//만약 메소드가 가변길이 매개변수를 가지면 매개변수의 개수와 상관없이 매개값을 줄 수 있다.


public class Computer {
    public int totalSum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];//누적시켜야되니
        }
        if (sum % 2 == 0)
            return 0;

        else return 1;
    }
}
//
//    public int totalSum(int[] arr) {
//        int sum = 0;
//        for (int num : arr) {
//            sum += num;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
//        Computer computer = new Computer();
//        int result = computer.totalSum(nums);
//
//        System.out.println("1부터 5까지의 누적합은 " + result + " 입니다.");
//    }
//}
