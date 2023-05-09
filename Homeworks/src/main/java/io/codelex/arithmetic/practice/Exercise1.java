package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first integer: ");
        int first = scanner.nextInt();
        System.out.println("Please enter second integer: ");
        int second = scanner.nextInt();
        System.out.println("Result: " + calculate(first, second));
    }

    public static boolean calculate(int x, int y) {
        if (x == 15 || y == 15)
            return true;
        return ((x + y) == 15 || Math.abs(x - y) == 15);

    }
}

