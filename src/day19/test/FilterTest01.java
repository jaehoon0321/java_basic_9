package day19.test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterTest01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bobi", "Charlie", "David", "Eve");
        //이름중 "A"로 시작하는 이름을 수집하여 출력하세요

        List<String> filteredNames =
                names.stream().filter(name -> name.startsWith("A"))//filter을 줄때 람다식 을 넣어준다
                .collect(Collectors.toList());

        for (String name : filteredNames) {
            System.out.println();
        }

        names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);
        names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()).forEach(name -> System.out.println(name));



        List<String> names2 = Arrays.asList("Alice","Bobi","Charlie");

        //2. 각 이름의 길이를 세어서출력하시오 :[5, 4 , 7]

        names2.stream().mapToInt(String::length).forEach(System.out::println);

    }
}
