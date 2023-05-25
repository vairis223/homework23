package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Enter the numerator ('Q' or 'q' to quit):");
                String input = scanner.next();

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Exiting!");
                    break;
                }

                int numerator = 0;
                try {
                    numerator = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("You entered wrong data. Please try again.");
                }

                System.out.println("Enter the divisor:");
                int divisor = scanner.nextInt();

                try {
                    System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
                } catch (ArithmeticException e) {
                    System.out.println("You can't divide by zero!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter a number!");
        }
    }
}