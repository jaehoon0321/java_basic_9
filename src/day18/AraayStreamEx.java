package day18;

import java.util.Arrays;
import java.util.stream.Stream;

public class AraayStreamEx {
    public static void main(String[] args) {
        String[] stings = new String[]{"1","2","3","4","5"};
        Stream<String> stream = Arrays.stream(stings);//Arrays 클래스에서 Stream 메소드를 통해서 Sting배열..
//        stream.forEach(System.out::println);
        stream.forEach(item -> System.out.print(item + " "));

        Integer[] integers = new Integer[]{1,2,3,4,5};
        Stream<Integer> stream1 = Arrays.stream(integers);
        stream1.forEach(item -> System.out.print(item + " "));

        Long[] longs = new Long[]{1l,2l,3l,4l};
        Stream<Long> longStream = Arrays.stream(longs);
        longStream.forEach(item -> System.out.print(item + " "));
        System.out.println();




    }
}
