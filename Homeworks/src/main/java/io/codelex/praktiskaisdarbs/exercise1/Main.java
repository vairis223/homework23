package io.codelex.praktiskaisdarbs.exercise1;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard =new CreditCard("Aldis Lapins", "334567778334", "033", 575.0);
        DebitCard debitCard = new DebitCard("Alfons Rusa", "654345667533", "045", 10000.0);

        try {

            creditCard.takeMoney(345.0);
            creditCard.takeMoney(345.0);
            System.out.println("Owner of card: " + creditCard.getOwner());
            System.out.println("Card number: " + creditCard.getCardNumber());
            System.out.println();


            debitCard.addMoney(250);
            debitCard.takeMoney(345.0);
            System.out.println("Card number: " + debitCard.getCardNumber());

        } catch (NotEnoughFundsException e) {
            System.out.println("Error:" + e.getMessage());
        }


    }
}
