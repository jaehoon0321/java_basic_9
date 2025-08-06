package javabasic_02.day11.TestBank;

public class BankApplication {
}












































/*package javabasic_02.day10.bank;

import java.util.Scanner;

public class BankApplication {
    static Scanner sc = new Scanner(System.in);
    static Account2[] accounts = new Account2[100];
    static int index = 0;
    static boolean running = true;

    public static void main(String[] args) {
        // accounts 배열 초기화
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = new Account2(); // 빈 계좌로 초기화
        }

        while (flag) {
            printMenu();
        }
    }

    public static void printMenu() {
        System.out.println("---------------------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("---------------------------------");
        System.out.print("선택> ");

        int choice = Integer.parseInt(sc.nextLine());
        handleMenu(choice);
    }

    public static void handleMenu(int choice) {
        switch (choice) {
            case 1 -> createAccount();
            case 2 -> listAccounts();
            case 3 -> deposit();
            case 4 -> withdraw();
            case 5 -> {
                System.out.println("프로그램을 종료합니다.");
                running = false;
            }
            default -> System.out.println("1 ~ 5 사이 숫자를 입력하세요.");
        }
    }

    // 1. 계좌 생성
    public static void createAccount() {
        System.out.println("[계좌생성]");
        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();
        System.out.print("계좌주: ");
        String name = sc.nextLine();
        System.out.print("초기입금액: ");
        int money = Integer.parseInt(sc.nextLine());

        if (money < 0 || money > Account2.MAX_BALANCE) {
            System.out.println("초기입금액은 0원 이상 100만원 이하만 가능합니다.");
            return;
        }

        Account2 account = accounts[index];
        account.setAccountNum(accountNum);
        account.setName(name);
        account.setBalane(money); // setBalance는 누적이므로 초기값 설정에도 사용 가능
        index++;

        System.out.println("계좌가 성공적으로 생성되었습니다.");
    }

    // 2. 계좌 목록 출력
    public static void listAccounts() {
        System.out.println("[계좌목록]");
        for (int i = 0; i < index; i++) {
            Account2 acc = accounts[i];
            System.out.printf("%s %s %d원\n",
                    acc.getAccountNum(),
                    acc.getName(),
                    acc.getBalane());
        }
    }

    // 3. 예금
    public static void deposit() {
        System.out.println("[예금]");
        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();
        System.out.print("예금액: ");
        int amount = Integer.parseInt(sc.nextLine());

        Account2 acc = findAccount(accountNum);
        if (acc == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return;
        }

        acc.setBalane(amount); // 누적 처리 및 유효성 검사는 내부에서
    }

    // 4. 출금
    public static void withdraw() {
        System.out.println("[출금]");
        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();
        System.out.print("출금액: ");
        int amount = Integer.parseInt(sc.nextLine());

        Account2 acc = findAccount(accountNum);
        if (acc == null) {
            System.out.println("계좌를 찾을 수 없습니다.");
            return;
        }

        // 출금 시 잔액 감소 → 누적 메서드 사용 불가하므로 음수 전달
        acc.setBalane(-amount);
    }

    // 계좌번호로 계좌 찾기
    public static Account2 findAccount(String accountNum) {
        for (int i = 0; i < index; i++) {
            if (accounts[i].getAccountNum().equals(accountNum)) {
                return accounts[i];
            }
        }
        return null;
    }
}
*/