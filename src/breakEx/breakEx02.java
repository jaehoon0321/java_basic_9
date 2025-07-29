package breakEx;

public class breakEx02 {

    public static void main(String[] args) {
        // 중첩 반복문에서 바깥쪽 반복문까지 종료시키려면 레이블을 사용합니다.
        Outter:
        for (char upper = 'A'; upper <= 'Z'; upper++) {

            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + " - " + lower);

                if (lower == 'k') {
                    break Outter; // 바깥 반복문까지 완전히 종료
                }
            }
        }

        System.out.println("프로그램 종료");
    }
}
