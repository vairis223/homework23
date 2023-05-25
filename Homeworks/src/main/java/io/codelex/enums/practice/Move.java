package io.codelex.enums.practice;

import java.util.Random;

public enum Move {
    ROCK("r"),
    PAPER("p"),
    SCISSORS("s");

    private final String value;

    Move(String value) {
        this.value = value;
    }

    public static Move fromPlayer(String playerMove) {
        return switch (playerMove) {
            case "r" -> ROCK;
            case "p" -> PAPER;
            case "s" -> SCISSORS;
            default -> null;
        };
    }

    public String getValue() {
        return value;
    }

    public static Move getComputerMove(Random random) {
        int randomNumber = random.nextInt(3);
        return Move.values()[randomNumber];
    }

    public boolean isPlayerWin(Move computerMove) {
        return (this == ROCK && computerMove == SCISSORS) ||
                (this == SCISSORS && computerMove == PAPER) ||
                (this == PAPER && computerMove == ROCK);
    }

    @Override
    public String toString() {
        return "Move{" +
                "value='" + value + '\'' +
                '}';
    }
}


