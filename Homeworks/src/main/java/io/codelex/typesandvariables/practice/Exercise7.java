package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();

        String upperCase = "";

        for (int i = 0; i < string.length(); i++) {
            char thisChar = string.charAt(i);

            if (thisChar >= 'A' && thisChar <= 'Z') {
                upperCase += thisChar;
            }
        }

        System.out.println("Uppercase letters: " + upperCase.length());


    }

}
