package io.codelex.arithmetic.practice;

import java.util.Scanner;
import java.util.Random;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int number = random.nextInt(2) + 1;

        System.out.println("I'm thinking about number between 1 and 100. Try to guess it: ");
        int guess = scanner.nextInt();

        if (guess < number) {
            System.out.println("Sorry, you are too low.  I was thinking of " + number);
        } else if (guess > number) {
            System.out.println("Sorry you are too high. I was thinking of " + number);
        } else {
            System.out.println("You guessed it!  What are the odds?!?");

        }

    }

}

