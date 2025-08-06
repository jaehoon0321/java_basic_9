package javabasic_02.day09.study_0804_riview;

//반환 유형이 없는 메서드는 메서드명 앞에 void 키워드를 사용함
// 메서드 안에 return이 없음


public class sol4 {
    public static void sum() {
     int sum = 0;
     for (int i = 0; i <= 10; i++) {
         sum += i;
         }
     System.out.println(sum);
     }

         public static void main(String[] args) {
         System.out.print("1부터 10의 합계 : ");
         sum();
         }
 }
//반환 값이 없는 메서드 void
 //메서드가 값을 돌려주지 않고, 내부에서 출력하거나 동작만 수행하고 끝난다.
//주로 출력, 화면 처리, 로그 출력 등 결과를 따로 저장할 필요가 없을 때 사용됩니다.


//반환 값이 있는 메서드 int String
//메서드가 값을 계산한 후 return으로 결과를 돌려주고 그 값을 변수에 저장하거나, 다른 계산에 재사용 가능. 유연하고 재사용이 높은 코드 가능
