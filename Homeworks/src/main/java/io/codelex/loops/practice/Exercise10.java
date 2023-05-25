package io.codelex.loops.practice;

import java.util.Scanner;
public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter  min value: ");
        int min = scanner.nextInt();

        System.out.println("Please enter ma value: ");
        int max = scanner.nextInt();

        for (int i = min; i <= max ; i++) {
            for (int j = i; j <= max ; j++) {
                System.out.print(j + " ");
            }
            for (int k = min; k< i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
