package io.codelex.arrays.practice;


import java.util.Scanner;

public class Exercise8 {
    private static String[] words = {"lorry", "road", "car", "bus", "train", "bike"};
    private static int tries = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        while (playAgain) {
            playGame(scanner);
            System.out.print("Play again? (y/n): ");
            playAgain = scanner.nextLine().equalsIgnoreCase("y");
        }
    }

    private static void playGame(Scanner scanner) {
        String word = words[(int) (Math.random() * words.length)];
        char[] letters = new char[word.length()];
        int numTries = 0;
        String missedLetters = "";
        boolean wordGuessed = false;

        for (int i = 0; i < letters.length; i++) {
            letters[i] = '_';
        }

        while (!wordGuessed && numTries < tries) {
            System.out.println("Word: " + new String(letters));
            System.out.println("Misses: " + missedLetters);
            System.out.print("Guess: ");
            String guess = scanner.nextLine().toLowerCase();

            if (guess.length() == 1 && Character.isLetter(guess.charAt(0))) {
                char letter = guess.charAt(0);
                if (word.indexOf(letter) >= 0) {
                    for (int i = 0; i < letters.length; i++) {
                        if (word.charAt(i) == letter) {
                            letters[i] = letter;
                        }
                    }
                    if (new String(letters).indexOf('_') < 0) {
                        wordGuessed = true;
                    }
                } else {
                    missedLetters += letter;
                    numTries++;
                }
            }
        }
    }
}