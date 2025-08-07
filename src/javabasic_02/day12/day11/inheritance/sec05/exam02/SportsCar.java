package javabasic_02.day12.day11.inheritance.sec05.exam02;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed += 10;
		if(speed == 0) super.stop();
	}

//	public void stop(){ ->안됨
//
//	}

}