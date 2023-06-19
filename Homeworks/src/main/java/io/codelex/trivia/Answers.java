package io.codelex.trivia;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Answers {
    public static List<Integer> AnswerOptions(int correctAnswer) {
        List<Integer> answerOptions = new ArrayList<>();
        Random random = new Random();

        answerOptions.add(correctAnswer);

        while (answerOptions.size() < 3) {
            int option = random.nextInt(1000) + 1;
            if (!answerOptions.contains(option)) {
                answerOptions.add(option);
            }
        }
        return answerOptions;
    }
}

