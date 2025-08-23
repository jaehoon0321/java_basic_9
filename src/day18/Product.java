package day18;


import lombok.*;
//제품은 제품번호 (no), 제품이름(name), 제조사(company), 가격(price)이란 속성을 가지고 있다.
// Setter, Getter toString 오버라이딩 하세요
// 제품 생성시 모든 속성의 값을 할당하여 제품을 생산합니다.

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor

public class Product {
    private String no;
    private String name;
    private String company;
    private Integer price;//int price로 했는데  Integer로 받네
}
