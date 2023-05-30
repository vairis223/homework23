package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5 {
    public static int getNumber(char lowerCaseLetter) {
        int number = switch (lowerCaseLetter) {
            case 'a', 'b', 'c' -> 2;
            case 'd', 'e', 'f' -> 3;
            case 'g', 'h', 'i' -> 4;
            case 'j', 'k', 'l' -> 5;
            case 'm', 'n', 'o' -> 6;
            case 'p', 'q', 'r', 's' -> 7;
            case 't', 'u', 'v' -> 8;
            case 'w', 'x', 'y', 'z' -> 9;
            default -> 0;
        };
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to convert in phone number: ");
        String stringValue = scanner.nextLine();

        for (int i = 0; i < stringValue.length(); i++) {
            if (Character.isLetter(stringValue.charAt(i))) {
                System.out.println(getNumber(Character.toLowerCase(stringValue.charAt(i))));
            } else {
                System.out.println(stringValue.charAt(i));
            }

        }
    }
}
