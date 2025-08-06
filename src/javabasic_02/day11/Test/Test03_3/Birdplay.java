package javabasic_02.day11.Test.Test03_3;
//문제3. 다음과 같은 설명을 읽고 Duck과 Sparrow 클래스를 작성하십시오. PlayBird 클래스를 참고하세요.(선택)

public class Birdplay {
    public static void main(String s[]) {
        Duck duck = new Duck();
        duck.setName("꽥꽥이");
        duck.fly();
        duck.sing();
        System.out.println(duck.toString());

        Sparrow sparrow = new Sparrow();
        sparrow.setName("짹짹");
        sparrow.fly();
        sparrow.sing();
        System.out.println(sparrow.toString());

    }
}
