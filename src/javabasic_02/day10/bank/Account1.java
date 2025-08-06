package javabasic_02.day10.bank;

//문제 20번
//키보드로 부터 계좌 정보를 입력받아 계좌를 관리하는 프로그램이다.
//계좌는 Account 객체로 생성되고
//BankApplication  에서 길이 100인 Account[]배열로 관리됩니다.
//실행결과를 보고 , Account 와 BankApplication 클래스를 작성하세요
// 키보드로 입력 받을 때는 Scanner의 nextLine()메소드를 사용.

/*<알아야될 개념 >
*
* */

/*<구상 어떻게 코드를 짜야할지 구조파악>
계좌 생성 = accountNo
소유자 =  owner;
통장 <입출금 내역 및 잔고 확인>
* */
public class  Account1 {
    private static final int MIN_BALANCE = 0; //문제에서 0< balance < 1000000 범위의 값만 가질 수 있도록 하라고 했으므로
    // static final을 사용 하여 값을 고정 시키려고  static final을 사용함...?
    private static final int MAX_BALANCE = 1000000;
    private String accountNo;
    private String owner;
    private int balance; // -> ALT INSERT gatter setter 껍대기 만듬

    //은행에 가서 계좌개설 신청하면 개인정보를 은행에 등록하는 첫 과정

    public String getAccountNo() {
        return accountNo;
    }

//    public void setAccountNo(String accountNo) {
//        this.accountNo = accountNo;
//    }  -> 계좌번호를 수정하진 않아서

    public String getOwner() {
        return owner;
    }

//    public void setOwner(String owner) {
//        this.owner = owner;
//    } -> 소유자도 마찬가지

    Account1(String accountNo, String owner, int balance){
        this.accountNo =accountNo;
        this.owner = owner;
        this.balance = balance;

    }
    public void setBalance(int money){//private에 접근을 하려면 무조건 public 이어야 한다.
        if (money < MIN_BALANCE  || money > MAX_BALANCE){//만약에 money의 값이 0보다 작거나 1000000보다 크면 유효하지 않는 값 true가된다.
            return;

            //왜 이렇게 코드를 했을까?
            // 문제에서 "Setter 매개값이 음수이거나 백만 원을 초과하면 현재 balance 값을 유지" 라고 했기 때문에
            //money의 값이 0보다 작거나 1000000보다 크면 유효하지 않는 값이 나오게 된다면 return 값을 변경하지 않는다. 현재 balance값을 유지한다.
        }
        this.balance += money; //balance필드에 money값을 할당 assign 한다.  ,+= 을 했으므로  money 값을 누적 시킨다.
    }//private에 접근을 하려면 무조건 public 이어야 한다.


    public int getBalance(){//int라는 리턴값을 반환해야 되기 때문에 return문이 반드시 필요
        return this.balance;

    }//추가적으로 Alt + Insert를 하면  Gatter , Setter 메소드를 자동 완성을 할 수 있다. 참고.

    public static void main(String[] args) {
        Account account = new Account(); //Account 계좌 개설을 하고

    }

}

