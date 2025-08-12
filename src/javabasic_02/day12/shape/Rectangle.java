package javabasic_02.day12.shape;

public class Rectangle extends Shape{

    //사각형, 삼각형, 원 클래스는 서로 다른 타입이어서 각각 타입을 정의해서 같은 타입끼리 묶여서 관리하겠다
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle();
        rectangles[1] = new Rectangle();
        rectangles[2] = new Rectangle();
        rectangles[3] = new Rectangle();

        Triangle[] triangles = new Triangle[5];
        for (int i = 0; i < triangles.length; i++) {
            Triangle triangle = triangles[i];

        }

        Circle[] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();

        }
    }
}
