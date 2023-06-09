package io.codelex.polymorphism.practice.exercise1;

public class Opel implements Car{
    private Integer currentSpeed = 0;
    @Override
    public void speedUp() {
        currentSpeed += 11;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 11;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
