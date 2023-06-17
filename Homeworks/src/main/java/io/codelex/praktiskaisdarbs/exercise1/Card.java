package io.codelex.praktiskaisdarbs.exercise1;

public abstract class Card {
    private String owner;
    private String cardNumber;
    private String cvcCode;
    private double balance;


    public Card(String owner, String cardNumber, String cvcCode, double balance) {
        this.owner = owner;
        this.cardNumber = cardNumber;
        this.cvcCode = cvcCode;
        this.balance = balance;
    }

    public abstract void addMoney(double amount);

    public abstract void takeMoney(double amount) throws NotEnoughFundsException;

    public String getOwner() {
        return owner;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvcCode() {
        return cvcCode;
    }

    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Card{" +
                "owner='" + owner + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", cvcCode='" + cvcCode + '\'' +
                ", balance=" + balance +
                '}';
    }
}
