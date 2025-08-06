package javabasic_02.day10;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 100000;
    private int blance;

    private int balance;// 공공의 통장 (입출금 내역 및 잔고확인)

    public void setBalance(int money){
        if(money < 0 || money > 1000000){
            return;
        }
        this.balance += money; //assign -> 할당한다
    }

    public int getBalance(){

        return this.balance;
    }

    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println(account.balance);

        account.setBalance(200);
        System.out.println(account.balance);

    }
}
