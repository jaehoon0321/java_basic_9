package jungol.입력_jungol;

import java.text.DecimalFormat;

public class 입력_연습문제4 {
    public static void main(String[] args) {
        double radius = 5; // 반지름
        double c = 3.140000;

        double circumference = radius * 2 * c; // 원주
        double area = radius * radius * c;     // 넓이

        DecimalFormat df = new DecimalFormat("0.000000");

        System.out.println("출력_jungol");
        System.out.println("원주 = " + radius + " * 2 * " + df.format(c) + " = " + df.format(circumference));
        System.out.println("넓이 = " + radius + " * " + radius + " * " + df.format(c) + " = " + df.format(area));
    }
}

