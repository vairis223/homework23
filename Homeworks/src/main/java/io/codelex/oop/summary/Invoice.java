package io.codelex.oop.summary;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;


public class Invoice {
    private static int invoiceCounter = 0;

    private int invoiceNumber;
    private InvoiceStatus status;
    private List<SellableThing> items;

    private static final double VAT_RATE = 0.21;

    public Invoice(Order order, String inv) throws WrongOrderException {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("Cannot create an invoice with an empty order.");
        }
        this.invoiceNumber = ++invoiceCounter;
        this.status = InvoiceStatus.APPROVED;
        this.items = new ArrayList<>(order.getItems());
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    private double calculatePriceWithoutVAT() {
        double sum = 0.0;
        for (SellableThing item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    private double calculateVAT() {
        return calculatePriceWithoutVAT() * VAT_RATE;
    }

    private double calculateTotal() {
        return calculatePriceWithoutVAT() + calculateVAT();
    }

    private String formatAmount(double amount) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#0.00", symbols);
        return df.format(amount);
    }

    public String getFormattedInvoice() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("===================================================\n");
        stringBuilder.append("= INVOICE NUMBER: INV").append(invoiceNumber).append("                            =\n");
        stringBuilder.append("= STATUS: ").append(status).append("                                =\n");
        stringBuilder.append(getItemsText());
        stringBuilder.append("= SUM: ").append(formatAmount(calculatePriceWithoutVAT())).append(" EUR");
        stringBuilder.append(" ".repeat(45 - " SUM: ".length() - formatAmount(calculatePriceWithoutVAT()).length()));
        stringBuilder.append("=\n");
        stringBuilder.append("= VAT (21%): ").append(formatAmount(calculateVAT())).append(" EUR");
        stringBuilder.append(" ".repeat(45 - " VAT (21%): ".length() - formatAmount(calculateVAT()).length()));
        stringBuilder.append("=\n");
        stringBuilder.append("= TOTAL: ").append(formatAmount(calculateTotal())).append(" EUR");
        stringBuilder.append(" ".repeat(45 - " TOTAL: ".length() - formatAmount(calculateTotal()).length()));
        stringBuilder.append("=\n");
        stringBuilder.append("===================================================\n");
        return stringBuilder.toString();
    }

    private String getItemsText() {
        StringBuilder stringBuilder = new StringBuilder();
        int index = 1;
        for (SellableThing item : items) {
            String line;
            if (item instanceof Item regularItem) {
                line = "= " + index + ". " + regularItem.fullInfo();
            } else if (item instanceof ItemPacking itemPacking) {
                line = "= " + index + ". " + itemPacking.fullInfo();
            } else {
                line = "";
            }
            line += " ".repeat(49 - line.length());
            line += " =\n";
            stringBuilder.append(line);
            index++;
        }
        return stringBuilder.toString();
    }
}