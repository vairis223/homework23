package io.codelex.loops.practice;

import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word: ");
        String secondWord = scanner.nextLine();
        int dots = 30 - firstWord.length() - secondWord.length();

        System.out.print(firstWord);

        for (int i = 0; i < dots; i++) {
            System.out.print(".");
        }
        System.out.println(secondWord);
    }
}
