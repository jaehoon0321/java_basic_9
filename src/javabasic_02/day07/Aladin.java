package javabasic_02.day07;

public class Aladin {
    public static void main(String[] args) {
        Book 전지적독자시점 = new Book();
        전지적독자시점.title = "전지적독자시점";
        전지적독자시점.company = "취업을 위한 길";
        전지적독자시점.author = "긍정적 마인드";
        전지적독자시점.price = 13500;

        System.out.println(전지적독자시점);

        Book 뉴문 = new Book();
        뉴문.title = "뉴문";
        뉴문.company = "트와일라잇 출판사";
        뉴문.author = "스테프니 메이어";
        뉴문.price = 12000;

        Book 브레이킹던 = new Book();
        브레이킹던.title = "브레이킹 던";
        브레이킹던.company = "트와일라잇 출판사";
        브레이킹던.author = "스테프니 메이어";
        브레이킹던.price = 13000;

        Book[] 판타지 = new Book[2];
        판타지[0] = 뉴문;
        판타지[1] = 브레이킹던;

        for (Book b : 판타지) {
            System.out.println(b);
        }
    }
}
