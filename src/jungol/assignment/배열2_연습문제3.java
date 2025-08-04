package jungol.assignment;

public class 배열2_연습문제3 {
    public static void main(String[] args) {

        int[] terms = {10, 20, 30, 40}; // 🔸 구하려는 항 번호들
        for (int term : terms) {       // 🔁 terms 배열을 돌면서 각각 항 계산
            long fib = fibonacci(term); // 🔸 해당 항에 대한 피보나치 수 계산
            System.out.println("피보나치 수열 " + term + "항 : " + fib);
        }
    }

    // ✅ 피보나치 수열을 구하는 메서드 (반복문 사용)
    public static long fibonacci(int n) {
        if (n == 1 || n == 2) return 1; // 🔹 1항과 2항은 1

        long a = 1; // 🔸 첫 번째 항
        long b = 1; // 🔸 두 번째 항
        long result = 0;

        // 🔁 3번째 항부터 n번째 항까지 반복하여 계산
        for (int i = 3; i <= n; i++) {
            result = a + b; // 🔸 이전 두 항의 합
            a = b;          // 🔁 다음 항 계산을 위해 변수 이동
            b = result;
        }
        return result;
    }
}
