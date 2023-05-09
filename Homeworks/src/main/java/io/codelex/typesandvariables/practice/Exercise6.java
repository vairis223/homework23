package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        int total = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a single digit number: ");
            String numbers = scanner.next();

            if (numbers.equalsIgnoreCase("q")) {
                break;
            }
            int digit = Integer.parseInt(numbers);
            if (digit < 0 || digit > 9) {
                System.out.println("Invalid input.");
                continue;
            }
            total += digit;
        }
        System.out.println("The sum of digits is: " + total);
    }
}
