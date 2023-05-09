package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.println("Please enter height in inches: ");
        double height = scanner.nextDouble();

        double BMI = weight * 703 / Math.pow(height, 2);

        if (BMI < 18.5) {
            System.out.println("You are underweight!");
        } else if (BMI > 25) {
            System.out.println("You are overweight!");
        } else {
            System.out.println("Your weight is optimal");
        }

    }
}
