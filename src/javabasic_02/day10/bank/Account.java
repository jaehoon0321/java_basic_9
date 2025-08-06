package javabasic_02.day10.bank;
//첫 번째 조건.은행 계좌 객체인 Account  객체는 잔고 (balance)필드를 가지고 있다.
//두 번재 조건.balance 필드는 음수값이 될 수 없고, 최대 백만우너 까지만 저장할수 있다.
//세번째 조건 외부에서 balance 필드를 마음대로 변경하지 못하도록 하고, 0<= balance <= 1,000,000범위의 값만 가질 수 있도록Account 클래스를 작성

//조건 1-1 Setter와 Gatter  를 이용
//조건 1-2 0과 1,000,000은 MIIN ,MAX "BALANCE" 상수를 선언해서 이용
//조건 1-3 Setter 매개값이 음수이거나 백만원을 초과하면 현재  balance 값을 유지

/*
* 1. <알아야 될 개념 >
1. 객제 지향 프로그래밍에서 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막는다.
*  WHY? -> 객체 데이터를 외부에서 읽고 변경 시 객체의 무결성이 깨질 수 있기 때문이다.
* 따라서 객체 지향 프로그래밍에서는 메소드를 통해 데이터를 변경하는 방법을 선호한다.
* 이러한 역활을 하는게 Setter 메소드 이다.
*
*2. 외부에서 객체의 데이터를 읽을 때 또한 메소드를 사용하는게 좋은데
* 객체 외부에서 객체 필드값을 사용하기 부적적한 경우가 있어서 메소드를 필드값으로 가공 후 외부로 전달한다.
* 이 역활이 Gatter 메소드 이다.
*
* 3.static = 고정된 의미  객체 생성없이 사용할 수 있는 필드와 메서드를 생성하고자 할때 사용
*
* 4.final =최종적인 해당 변수는 값이 저장되면 최종적인 값이 되므로 , 수정이 불가능하다.
*
* 5. static final 고정된 최종적인 의미 , 상수를 선언하고자 할 때 사용 (모든 영역에서 고정) */


//이 개념을 가지고 19번 문제에 적용해보자.

public class Account {

    private static final int MIN_BALANCE = 0; //문제에서 0< balance < 1000000 범위의 값만 가질 수 있도록 하라고 했으므로
    // static final을 사용 하여 값을 고정 시키려고  static final을 사용함...?
    private static final int MAX_BALANCE = 1000000;

    private int balance;   //private가  붙은 변수나 메서드는 해당 클래스 안에서만 접근이 가능하다.
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

        account.setBalance(10000);//setBalance메소드를 이용해 계좌에 10000원값을 누적하고
        System.out.println(account.balance); //출력문인데 계좌의 잔고를 출력한다.
    }
}