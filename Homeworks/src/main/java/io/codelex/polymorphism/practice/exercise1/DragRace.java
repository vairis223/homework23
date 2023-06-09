package io.codelex.polymorphism.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        Car volvo = new Volvo();
        carList.add(volvo);

        Car opel = new Opel();
        carList.add(opel);

        Car audi = new Audi();
        carList.add(audi);

        Car bmw = new Bmw();
        carList.add(bmw);

        Car tesla = new Tesla();
        carList.add(tesla);

        Car lexus = new Lexus();
        carList.add(lexus);

        for (int i = 0; i < 10; i++) {
            for (Car car : carList) {
                car.speedUp();
                car.slowDown();
                car.showCurrentSpeed();

                if (i == 2 && car instanceof Boost) {
                    Boost boostCar = (Boost) car;
                    boostCar.useNitrousOxideEngine();
                }

            }

        }
        Car fastCar = null;
        int maxspeed = Integer.MIN_VALUE;

        for (Car car : carList) {
            int currentSpeed = Integer.parseInt(car.showCurrentSpeed());
            if (currentSpeed > maxspeed) {
                maxspeed = currentSpeed;
                fastCar = car;
            }
        }
        if (fastCar != null) {
            System.out.println("Fastest car: " + fastCar.getClass().getSimpleName());
            System.out.println("Fastest car speed: " + fastCar.showCurrentSpeed());
        }

    }
}
