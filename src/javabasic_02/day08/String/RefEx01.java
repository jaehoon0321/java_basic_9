package javabasic_02.day08.String;

public class RefEx01 {
    public static void main(String[] args) {
            String refVar1= null; //스택
            String refVar2 = null;

            refVar1 =new String("자바");  //힙에 들어가있고
            refVar2 ="자바";//리터럴에 들어가 있고  ,,프로그램이라는 문자열이 첫번째에 만들어졌다
            String refVar3 = "자바";
            String refVar4 = null;

        System.out.println(refVar1 == refVar2);//문자열은 2가지 방법으로 구분한다.
        System.out.println(refVar2 == refVar3);
        System.out.println(refVar1 == refVar3);

        System.out.println("------------------------");
        System.out.println(refVar1.equals(refVar2));// equals는 문자열을 비교한다.
        System.out.println(refVar2.equals(refVar3));// equals는 문자열을 비교한다.

        System.out.println("---------NullPointException---------------");
        System.out.println(refVar4);//아직 이참조 타입 refVar4타입인 아직 인스턴스 되어있지 않는 상태 , 즉 할당받지 못한 상태
        //refVar4 라는 변수에 문자열에 길이를 뭐냐 근데 null값이라 값이 없기 때문에 length추출할게 없는거지 그래서 오류가 뜬다
        //당연히  string 타입에 대한 메소드가 없으니까.
        System.out.println(refVar3.length());

        //JAVA는 API에서 제공하는 걸 사용 해야지 문제가 되지 않는다
        //콘솔창에서 문제가 발생하면 내문제이다.
    }
}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "refVar4" is null
//	at javabasic_02.day08.RefEx01.main(RefEx01.java:23)
// ->