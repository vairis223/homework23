package io.codelex.oop.exercise4;

public class RunnerTest {
    public static void main(String[] args) {
        double marathonTime1 = 100;
        double marathonTime2 = 350;

        Runner runner1 = Runner.getFitnessLevel((int) marathonTime1);
        Runner runner2 = Runner.getFitnessLevel((int) marathonTime2);

        System.out.println("First runner fitness level is: " + runner1);
        System.out.println(("Second runners fitness level is: " + runner2));
    }
}
