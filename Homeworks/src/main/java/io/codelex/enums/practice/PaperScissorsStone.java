package io.codelex.enums.practice;

;
import java.util.Random;
import java.util.Scanner;

public class PaperScissorsStone {
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int numOfGames = 0;
        int gamesWon = 0;
        int gamesLost = 0;

        System.out.println("Let's begin...");
        System.out.println("Paper-Scissors-Stone");

        System.out.println("It's your turn! Enter r, p, or s for your move, or press q to quit!");
        while (true) {
        System.out.print("Enter your move: ");
        String playerMove = in.nextLine();

        if (playerMove.equalsIgnoreCase("q")) {
        break;
        }
        if (!isValidInput(playerMove)) {
        System.out.println("Your move is not valid!");
        continue;
        }
        Move playerChoice = Move.fromPlayer(playerMove);
        Move computerChoice = Move.getComputerMove(random);

        if (playerChoice == computerChoice) {
        System.out.println("It's a tie!");
        } else if (playerChoice.isPlayerWin(computerChoice)) {
        System.out.println("You won!");
        gamesWon++;
        } else {
        System.out.println("You lost!");
        gamesLost++;
        }
        numOfGames++;
        }

        System.out.println("Number of games: " + numOfGames);
        System.out.println("You won " + gamesWon + " games (" + percentage(gamesWon, numOfGames) + "%).");
        System.out.println("You lost " + gamesLost + " games (" + percentage(gamesLost, numOfGames) + "%).");
        }

private static boolean isValidInput(String playerMove) {
        return playerMove.equalsIgnoreCase("r") ||
        playerMove.equalsIgnoreCase("p") ||
        playerMove.equalsIgnoreCase("s");
        }

private static double percentage(int wins, int total) {
        return (double) (wins * 100) / total;
        }
        }