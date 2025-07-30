package javabasic_01.day02;

public class PrimitiveAndStringConversionEx {
    public static void main(String[] args) {
        // 문자열 "10"을 정수형 10으로 변경
        String v1 = "10";
        int d1 = Integer.parseInt(v1);
        System.out.println(d1 + 10); // 출력: 20

        // 문자열 "3.14"를 실수형으로 변경
        v1 = "3.14";
        double d2 = Double.parseDouble(v1);
        System.out.println(d2 + 0.01); // 출력: 3.15

        // 문자열 "true"를 boolean으로 변경
        v1 = "true";
        boolean bool1 = Boolean.parseBoolean(v1);
        System.out.println(v1); // 출력: true

        if (!bool1) { // bool1이 false면
            System.out.println("true");
        } else {
            System.out.println("false"); // 여기서 출력됨 (bool1이 true니까)
        }

        // 정수형/실수형 → 문자열로 변환
        String str1 = String.valueOf(10);     // "10"
        String str2 = String.valueOf(3.14);   // "3.14"
        System.out.println(str1 + " " + str2); // 출력: 10 3.14
    }
}

