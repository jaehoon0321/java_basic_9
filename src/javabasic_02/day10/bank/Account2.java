package javabasic_02.day10.bank;

public class Account2 {
    // 최소 및 최대 허용 잔액 상수 정의 (상한/하한을 고정시키기 위해 final 사용)
    static final int MiN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    // 계좌 정보: 잔액, 계좌주 이름, 계좌번호
    private int balance;
    private String name;
    private String accountNum;

    // 기본 생성자: 초기값 세팅
    public Account2(){
        balance = 0;
        name = "";
        accountNum = "";
    }

    // 잔액 조회
    public int getBalane(){
        return balance;
    }

    // 계좌주 이름 조회
    public String getName() {
        return name;
    }

    // 계좌번호 조회
    public String getAccountNum() {
        return accountNum;
    }

    // 계좌주 이름 설정
    public void setName(String name){
        this.name = name;
    }

    // 계좌번호 설정
    public void setAccountNum(String accountNum){
        this.accountNum = accountNum;
    }

    // 잔액 설정 (입금 기능처럼 동작)
    public void setBalane(int balane){
        // 현재 잔액(balance)가  유효 범위 내에 있을 경우만 입금 처리
        if (balance >= MiN_BALANCE && balance <= MAX_BALANCE){//외부에서 balane 값을 받아서 balance에 누적하는 방식
            this.balance += balane;
        }else{ //이 값에 해당이 안된다면.
            System.out.println("오류: 0원이상 100만원이하만 가능합니다.");
        }
    }
}
