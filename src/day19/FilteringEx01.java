package day19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringEx01 {

    public static void main(String[] args) {
        //List 컬렌션 ArrayList 생성
        //list 5명의 이름을 저장하세요 단 5명의 이름중 같은 이름을 두번 넣어주세요
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("bbb");
        list.add("aaa");

        List<String> list1 = Arrays.asList(
                new String("신명성"),
                new String("신명성"),
                new String("김주림")

        );//Arrays라는 메소드를 사용

        //중복요소 제거
        list.stream().forEach(System.out::println);
        System.out.println();

        list.stream().distinct().forEach(System.out::println);

        //list에서 중복을 제거하고 이름에 "신"가 들어간 사람의 이름을 출력하세요

        //list1에 들어있는 모든 요소를 출력 필터링 안함

        list1.stream().forEach(System.out::println);

        System.out.println();
        //같은 이름 제거 필터링
        list1.stream().distinct().forEach(System.out::println);

        //같은 이름 제거 필터링을 하고 이름에 "신"만 출력하세요

        list.stream().distinct().filter(name -> name.startsWith("신")).forEach(System.out::println);
    }
}
