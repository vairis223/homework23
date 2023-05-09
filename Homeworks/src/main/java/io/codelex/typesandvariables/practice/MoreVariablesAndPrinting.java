package io.codelex.typesandvariables.practice;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {


        String name = "Zed A. Shaw";
        int age = 35;
        double height = 74;  // inches
        double weight = 180; // lbs
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        double heightInCm = height * 2.54;
        float weightInKilos = (float) (weight * 0.453592f);
        String formattedWeight = String.format("%.2f", weightInKilos);

        double result = age + heightInCm + weightInKilos;


        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + heightInCm + " centimeters tall.");
        System.out.println("He's " + formattedWeight + " kilograms heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");


        System.out.printf("If I add " + age + ", " + heightInCm + ", and " + weightInKilos
                + " I get " + result + ".");
    }
}