package homework.ANIMALQ01;

public class Chicken extends Animal implements Cheatable {

    Chicken(int speed){
        this.speed = speed;
    }
    @Override
    public void fly() {
        super.speed*=2; //super.speed = super.speed*2;
    }

    @Override
    void run(int hours) {
    distance += (double) speed*hours;
    }
}
