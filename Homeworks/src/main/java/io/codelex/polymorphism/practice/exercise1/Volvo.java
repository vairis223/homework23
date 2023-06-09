package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car, Boost {
    private Integer currentSpeed = 0;
    @Override
    public void speedUp() {
        currentSpeed += 30;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 30;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 25;
    }

}
