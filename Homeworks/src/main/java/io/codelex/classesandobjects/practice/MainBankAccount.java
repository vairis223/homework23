package io.codelex.classesandobjects.practice;

import io.codelex.classesandobjects.practice.BankAccount;

public class MainBankAccount {
    public static void main(String[] args) {
    BankAccount account = new BankAccount();
    account.name = "Benson";
    account.balance = -17.25;


    System.out.println("Account Information:");
    System.out.println("Name: " + account.name);
    System.out.println("Balance: " + account);
}
}
