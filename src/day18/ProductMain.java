package day18;

//List<Product> products 생성

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
//5개의 제품을 생성하여 products에 저장헤주세요


        products.add(new Product("a", "제네시스", "현대", 900000000));
        products.add(new Product("b", "벤츠", "독일", 110000000));
        products.add(new Product("c", "BMW", "독일", 100000000));
        products.add(new Product("d", "아우디", "독일", 90000000));
        products.add(new Product("e", "테슬라", "미국", 80000000));

        System.out.println("제품정보 출력");
        ////객체 스트림을 얻어서 각 제품의 정보를 출력하세요

        Stream<Product> productStream = products.stream(); //객체 스트림을 얻는 방법..
        productStream.forEach(System.out::println);

        //productsStream.forEach(product -> System.out.println(product))
    }
    }




