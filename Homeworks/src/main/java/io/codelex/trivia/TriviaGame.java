package io.codelex.trivia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class TriviaGame {
    private static final int MAX_GAMES = 20;

    private Random random;
    private Scanner scanner;
    private Set<Integer> askedNumbers;

    public TriviaGame() {
        random = new Random();
        scanner = new Scanner(System.in);
        askedNumbers = new HashSet<>();
    }

    public void playGame() {
        int gamesPlayed = 0;
        int correctAnswers = 0;

        while (gamesPlayed < MAX_GAMES) {
            int randomNumber = getRandomNumber();

            try {
                URL url = new URL("http://numbersapi.com/" + randomNumber);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String response = in.readLine();
                    in.close();

                    String question = response.replaceAll("\\d", "");

                    String formattedQuestion = question.substring(0, 2).toUpperCase() + question.substring(2);
                    System.out.println("Question " + (gamesPlayed + 1) + ": " + formattedQuestion);

                    List<Integer> answerOptions = Answers.AnswerOptions(randomNumber);
                    Collections.shuffle(answerOptions);

                    for (int j = 0; j < answerOptions.size(); j++) {
                        System.out.println((j + 1) + ". " + answerOptions.get(j));
                    }

                    int userAnswer = scanner.nextInt();

                    if (userAnswer == randomNumber) {
                        System.out.println("Correct!");
                        correctAnswers++;
                    } else {
                        System.out.println("Incorrect. The correct answer is: " + randomNumber + formattedQuestion);
                        break;
                    }

                    askedNumbers.add(randomNumber);
                    gamesPlayed++;
                } else {
                    System.out.println("Failed to connect to numbersapi.com.");
                }


            } catch (IOException e) {
                System.out.println("Error: Failed to get question.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a number.");
                e.printStackTrace();
            }
        }
        System.out.println("Correctly answered to: " + correctAnswers + " questions ");
    }

    private int getRandomNumber() {
        int randomNumber;
        boolean alreadyAsked;

        do {
            randomNumber = random.nextInt(1000) + 1;
            alreadyAsked = askedNumbers.contains(randomNumber);
        } while (alreadyAsked);

        askedNumbers.add(randomNumber);
        return randomNumber;
    }
}




