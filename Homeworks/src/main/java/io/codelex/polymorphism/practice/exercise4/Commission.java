package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly{

    private double totalSale;
    private double commissionRate;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate,double commissionRate ) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    public void addSales(double totalSale) {
        this.totalSale =+ totalSale;
    }
    public double pay() {
        double payment = super.pay();
        payment += totalSale * commissionRate;
        totalSale = 0;
        return payment;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSale;
    }
}
