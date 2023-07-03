package io.codelex.classesandobjects.practice;

import java.util.Scanner;

public class SavingsAccountMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How much money is in the account?: ");
        double balance = input.nextDouble();

        System.out.print("Enter the annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("How long has the account been opened? ");
        int numMonths = input.nextInt();

        SavingsAccount savingsAccount = new SavingsAccount(balance);
        savingsAccount.setAnnualInterestRate(annualInterestRate);

        double totalDeposits = 0;
        double totalWithdraw = 0;
        double savingBalance = 0;

        for (int i = 1; i <= numMonths; i++) {
            System.out.print("Enter amount deposited for month " + i + ": ");
            double depositAmount = input.nextDouble();
            savingsAccount.deposit(depositAmount);
            totalDeposits += depositAmount;

            System.out.print("Enter amount withdrawn for month " + i + ": ");
            double withdrawalAmount = input.nextDouble();
            savingsAccount.withdraw(withdrawalAmount);
            totalWithdraw += withdrawalAmount;

            savingsAccount.addMonthlyInterest();
            savingBalance += savingsAccount.getBalance() * (annualInterestRate / 12);

            System.out.printf("Balance at the end of month %d: $%.2f%n", i, savingsAccount.getBalance());
        }

        System.out.printf("Total deposited: $%.2f%n", totalDeposits);
        System.out.printf("Total withdrawn: $%.2f%n", totalWithdraw);
        System.out.printf("Interest earned: $%.2f%n", savingBalance);
        System.out.printf("Ending balance: $%.2f%n", savingsAccount.getBalance());
    }
}