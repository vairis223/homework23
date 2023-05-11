package io.codelex.loops.practice;

import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i <= n; i++) {
            if( i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            }  else if (i % 5 == 0) {
                System.out.print("Buzz ");
            }else {
                System.out.print(i + " ");
            }
            count++;

                    if (count == 20) {
                        System.out.println();
                        count = 0;
                    }
        }

    }
}
