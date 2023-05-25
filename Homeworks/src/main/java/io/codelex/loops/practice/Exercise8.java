package io.codelex.loops.practice;

public class Exercise8 {
    public static void main(String[] args) {
        int ROWS = 20;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < (ROWS - i) * 4; j++) {
                System.out.print("/");
            }
            for (int j = 0; j < i * 8; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < (ROWS - i) * 4; j++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}


