package javabasic_02.day16.comparableEx;

import java.util.TreeSet;

public class FruitStore {
    public static void main(String[] args) {
        // TreeSet은 저장과 동시에 정렬을 수행하는 컬렉션입니다.
        // Fruit 클래스에 정의된 compareTo() 정렬 기준을 사용합니다.
        TreeSet<Fruit> fruitSet = new TreeSet<>();

        // 총각네 과일가게에 과일 상품을 추가합니다.
        System.out.println("총각네 과일가게 상품 입고");
        fruitSet.add(new Fruit("사과", 10000));
        fruitSet.add(new Fruit("귤", 12000));
        fruitSet.add(new Fruit("포도", 10000)); // 가격이 사과와 같지만 다른 객체로 추가됩니다.
        // 만약 가격과 이름이 모두 같으면 중복으로 처리되어 추가되지 않습니다.

        // TreeSet에 저장된 상품 리스트를 출력합니다.
        System.out.println("\n--- 총각네 과일가게 상품 리스트 (가격 오름차순) ---");
        for (Fruit fruit : fruitSet) {
            System.out.println(fruit.name + " : " + fruit.price + "원");
        }
    }
}