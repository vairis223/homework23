package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5 {
    public static int getNumber(char lowerCaseLetter) {
        int number = 0;
        switch (lowerCaseLetter) {
            case 'a', 'b', 'c':
                number = 2;
                break;
            case 'd', 'e', 'f':
                number = 3;
                break;
            case 'g', 'h', 'i':
                number = 4;
                break;
            case 'j', 'k', 'l':
                number = 5;
                break;
            case 'm', 'n', 'o':
                number = 6;
                break;
            case 'p', 'q', 'r', 's':
                number = 7;
                break;
            case 't', 'u', 'v':
                number = 8;
                break;
            case 'w', 'x', 'y', 'z':
                number = 9;
                break;
        }
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
