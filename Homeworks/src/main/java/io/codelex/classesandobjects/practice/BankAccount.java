package io.codelex.classesandobjects.practice;



public class BankAccount {
    public String name;
    public double balance;

    public final void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public final String withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn successfully.");
            } else {
                System.out.println("Insufficient balance.");
            }

        }
        return null;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.name = "Benson";
        account.balance = -17.25;


        System.out.println("Account Information:");
        System.out.println("Name: " + account.name);
        System.out.println("Balance: " + account);
    }
}

