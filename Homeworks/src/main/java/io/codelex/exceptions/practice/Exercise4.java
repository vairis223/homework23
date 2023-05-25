package io.codelex.exceptions.practice;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = in.nextLine();

        try {
            double d = getInput(input);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } // todo -
        catch (IllegalArgumentException e) {
            System.out.println("Non-positive number entered.");
        }

    }

    static double getInput(String s) throws IOException {

        double d = Double.parseDouble(s);
        // Throw an NonPositiveNumberException if d is less than 0
        if (d < 0) {
            throw new IllegalArgumentException("Non PositiveNumber");
        }
        return d;
    }
}





