package io.codelex.praktiskaisdarbs.exercise1;

public class DebitCard extends Card {
    public DebitCard(String owner, String cardNumber, String ccvCode, double balance) {
        super(owner, cardNumber, ccvCode, balance);
    }

    @Override
    public void addMoney(double amount) {
        double newBalance = getBalance() + amount;
        if (newBalance > 10000) {
            System.out.println("Warning: Too much money");
        }
        setBalance(newBalance);
    }


    @Override
    public void takeMoney(double amount) throws NotEnoughFundsException {
        double newBalance = getBalance() - amount;
        if (newBalance < 0) {
            throw new NotEnoughFundsException("Not enough funds");
        }
        setBalance(newBalance);
    }
}
