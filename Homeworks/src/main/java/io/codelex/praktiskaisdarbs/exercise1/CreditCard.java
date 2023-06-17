package io.codelex.praktiskaisdarbs.exercise1;

public class CreditCard extends Card {
    public CreditCard(String owner, String cardNumber, String ccvCode, double balance) {
        super(owner, cardNumber, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        double newBalance = getBalance() - amount;
        if (newBalance < 100) {
            System.out.println("Warning: Low funds");
        }
        setBalance(newBalance);
    }
    }
