package homework.ANIMALQ01;

public class Dog extends Animal {

    Dog(int speed) {
        this.speed = speed;

    }

    @Override
    void run(int hours) {
        distance += (double) speed*hours/2;


    }
}

//Dog