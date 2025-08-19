package javabasic_02.day16.comparableEx;

import java.util.Objects;

// Comparable<Fruit> 인터페이스를 구현하여 Fruit 객체끼리 비교 가능하도록 만듭니다.
public class Fruit implements Comparable<Fruit> {
    public String name;
    public int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 객체의 정보를 보기 쉽게 출력하기 위해 toString() 메소드를 재정의합니다.
    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Fruit o) {
        // 가격(price)을 기준으로 오름차순 정렬합니다.
        // this.price에서 o.price를 빼면 오름차순이 됩니다.
        // 만약 내림차순으로 하고 싶다면 o.price - this.price로 변경하면 됩니다.
        return this.price - o.price;
    }

    // TreeSet에서 동등 객체 비교를 위해 equals와 hashCode도 오버라이딩하는 것이 좋습니다.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return price == fruit.price && Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}