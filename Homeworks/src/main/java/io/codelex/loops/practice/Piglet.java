package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {
    int score;
    private Scanner scanner;


    public Piglet() {
        this.score = 0;
        this.scanner = new Scanner(System.in);
        play();
    }

    private void play() {
        System.out.println("Welcome to piglet!");
        while (true) {
            int roll = rollDice();
            if (roll == 1) {
                System.out.println("You rolled a 1! Game over, 0 points.");
                break;
            } else {
                System.out.println("You rolled a " + roll);
                score += roll;
                System.out.println("Your current score is: " + score);
                System.out.println("Roll again? (y) or end turn(q)?");
                String choice = scanner.nextLine();
                if (choice.equalsIgnoreCase("q")) {
                    System.out.println("You ended your turn with " + score + " points. ");
                    break;
                }
            }
        }
    }

    private int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        new Piglet();
    }
}
