//package javabasic_02.day12.Ex01;
//
//public class Cleaner implements RemoteControl {
//
//    private int minutes;
//
//    public Cleaner(int minutes) {
//        this.minutes = minutes;
//    }
//
//    public void clean(int minutes) {
//        System.out.println(minutes + "분 동안 청소한다.");
//    }
//
//    @Override
//    public void turnOn() {
//        System.out.println("청소기의 전원을 켠다.");
//        clean(minutes);  // 생성자에서 저장된 시간으로 clean 실행
//    }
//
//    @Override
//    public void turnOff() {
//        System.out.println("청소기의 전원을 끈다.");
//    }
//}
